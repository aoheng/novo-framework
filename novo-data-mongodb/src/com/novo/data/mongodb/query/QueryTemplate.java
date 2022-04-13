package com.novo.data.mongodb.query;

import com.novo.framework.core.bean.FieldBean;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.DataSort;
import com.novo.framework.core.protocol.Pagination;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.TimeStamp;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class QueryTemplate {

    private static final Logger logger = LoggerFactory.getLogger(QueryTemplate.class);
    private Direction direction;

    private Map<String, FieldBean> queryCriteria = new HashMap<String, FieldBean>();

    private Map<String, String> sortFields = new HashMap<String, String>();

    private PaginationInfo pagination;

    private TimeStampInfo timeStamp;


    public <T extends RequestProtocol> QueryTemplate(T requestProtocol, Class<?> entityClass, String[] ignoreProperties) {
        this.pagination(requestProtocol);
        this.dataSort(requestProtocol, entityClass);
        this.queryCriteria(requestProtocol, entityClass, ignoreProperties);
    }

    private <T extends RequestProtocol> void queryCriteria(T requestProtocol, Class<?> entityClass, String[] ignoreProperties) {
        Map<String, Field> entityFields = FieldUtil.getAllFieldMap(entityClass);
        Map<String, Field> protocolFields = FieldUtil.getAllFieldMap(requestProtocol.getClass());

        if (ignoreProperties != null) {
            for (String ignore : ignoreProperties) {
                protocolFields.remove(ignore);
            }
        }
        for (Field proField : protocolFields.values()) {
            Field enField = entityFields.get(proField.getName());
            if (enField == null) {
                continue;
            }
            Object value;
            try {
                value = InvokeMethod.invokeGetter(requestProtocol, proField.getName());
                QueryType queryType = QueryType.getQueryType(enField.getType());
                if (value != null && queryType != null) {
                    FieldBean fbean = new FieldBean();
                    fbean.setFieldName(proField.getName());
                    fbean.setFieldValue(value);
                    fbean.setFieldType(enField.getType());
                    this.queryCriteria.put(proField.getName(), fbean);
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
                throw new SystemException();
            }

        }
        if (TimeStamp.class.isAssignableFrom(requestProtocol.getClass())) {
            TimeStamp timeStampPro = (TimeStamp) requestProtocol;
            String targetTimeName = timeStampPro.targetTimeName();
            if (targetTimeName != null && !targetTimeName.equals("") && entityFields.get(targetTimeName) != null) {
                timeStamp = new TimeStampInfo(timeStampPro);
            }
        }
    }

    private <T extends RequestProtocol> void dataSort(T requestProtocol, Class<?> entityClass) {
        if (DataSort.class.isAssignableFrom(requestProtocol.getClass())) {
            DataSort sort = (DataSort) requestProtocol;
            if (sort.getSortType() != null && sort.getSortFields() != null) {
                this.direction = Direction.fromString(sort.getSortType().name());
                String[] sortFieldArrays = sort.getSortFields();
                Map<String, Field> entityFields = FieldUtil.getAllFieldMap(entityClass);
                for (String field : sortFieldArrays) {
                    if (entityFields.get(field) == null) {
                        logger.error("sort field[" + field + "] is not exist!");
                        throw new CustomException("mongodb_error_001", "sort field[" + field + "] is not exist!");
                    }
                    sortFields.put(field, field);
                }
            }

        }
    }

    private <T extends RequestProtocol> void pagination(T requestProtocol) {
        if (Pagination.class.isAssignableFrom(requestProtocol.getClass())) {
            this.pagination = new PaginationInfo((Pagination) requestProtocol);
        }
    }

    public Query buildQuery() {
        Query query = new Query();
        for (String fieldName : queryCriteria.keySet()) {
            FieldBean fbean = queryCriteria.get(fieldName);
            QueryType queryType = QueryType.getQueryType(fbean.getType());
            if (queryType == QueryType.like) {
                query.addCriteria(Criteria.where(fieldName).regex(fbean.getFieldValue().toString()));
            } else if (queryType == QueryType.equal) {
                query.addCriteria(Criteria.where(fieldName).is(fbean.getFieldValue()));
            } else if (queryType == QueryType.in) {
                Object[] values = (Object[]) fbean.getFieldValue();
                query.addCriteria(Criteria.where(fieldName).in(values));
            }
        }
        if (!sortFields.isEmpty() && direction != null) {
            for (String sortField : sortFields.keySet()) {
                query.with(new Sort(direction, sortField));
            }

        }

        if (pagination != null && pagination.getPaginationStatus()) {
            query.skip(pagination.getPageNo()).limit(pagination.getPageSize());
        }

        if (timeStamp != null) {
        }


        return query;
    }

    public class TimeStampInfo implements TimeStamp {

        private Date startTime;
        private Date endTime;
        private String targetTimeName;

        public TimeStampInfo() {}

        public TimeStampInfo(TimeStamp timeStamp) {
            this.setTargetTimeName(timeStamp.targetTimeName());
            this.setEndTime(timeStamp.getEndTime());
            this.setStartTime(timeStamp.getStartTime());
        }

        @Override
        public String targetTimeName() {
            return targetTimeName;
        }

        @Override
        public Date getStartTime() {
            return startTime;
        }

        @Override
        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public String getTargetTimeName() {
            return targetTimeName;
        }

        public void setTargetTimeName(String targetTimeName) {
            this.targetTimeName = targetTimeName;
        }

    }

    public class PaginationInfo implements Pagination {

        private Long total = 0l;
        private Integer pages = 0;
        private Integer pageNo = 0;
        private Integer pageSize = 0;
        private Boolean paginationStatus = true;

        public PaginationInfo(Pagination pagination) {
            this.total = pagination.getTotal();
            this.pages = pagination.getPages();
            this.pageNo = pagination.getPageNo();
            this.pageSize = pagination.getPageSize();
        }

        public PaginationInfo() {}

        public Long getTotal() {
            return total;
        }

        public void setTotal(Long total) {
            this.total = total;
        }

        public Integer getPages() {
            return pages;
        }

        public void setPages(Integer pages) {
            this.pages = pages;
        }

        public Integer getPageNo() {
            return pageNo;
        }

        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        @Override
        public boolean getPaginationStatus() {
            return paginationStatus;
        }

        @Override
        public void setPaginationStatus(Boolean paginationStatus) {
            this.paginationStatus = paginationStatus;
        }


    }
}
