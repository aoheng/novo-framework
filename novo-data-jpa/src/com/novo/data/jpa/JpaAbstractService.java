package com.novo.data.jpa;

import com.novo.data.jpa.query.QueryParam;
import com.novo.data.jpa.query.QuerySet;
import com.novo.framework.core.dataSource.DataKeyword;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.entity.Entity;
import com.novo.framework.core.entity.EntityUtil;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public abstract class JpaAbstractService<T extends BaseEntity, V extends Serializable> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected <R extends RequestProtocol> ResponseProtocol<V> saveEntity(final BaseRepository<T> repository, R requestProtocol) {
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        try {
            T entity = this.getEntity();
            entity.init();
            EntityUtil.updateEntity(requestProtocol, entity, new String[]{Entity.base_field_id});
            entity = repository.save(entity);
            V vo = EntityUtil.convert(entity, getVoClass());
            response.setData(vo);
            response.writeMessage(ResponseMessage.CODE_SUCCESS);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.writeMessage(ResponseMessage.CODE_FAIL);
        }
        return response;
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> deleteEntity(final BaseRepository<T> repository, R requestProtocol) {
        T entity = repository.findOne(requestProtocol.getId());
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        if (entity == null) {
            response.writeMessage(ResponseMessage.CODE_PARAM_ERROR);
            return response;
        }
        entity.setIsDelete(true);
        V vo = EntityUtil.convert(entity, getVoClass());
        response.setData(vo);
        response.writeMessage(ResponseMessage.CODE_SUCCESS);
        return response;
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> updateEntity(final BaseRepository<T> repository, R requestProtocol) {
        return this.updateEntity(repository, requestProtocol, null);
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> updateEntity(final BaseRepository<T> repository, R requestProtocol, String[] ignoreProperties) {
        T entity = repository.findOne(requestProtocol.getId());
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        if (entity == null) {
            response.writeMessage(ResponseMessage.CODE_TARGET_DATA_IS_NULL);
            return response;
        }
        List<String> ignoreList = new ArrayList<String>();
        ignoreList.add(Entity.base_field_isDelete);
        if (ignoreProperties != null && ignoreProperties.length > 0) {
            for (String pro : ignoreProperties) {
                ignoreList.add(pro);
            }
        }
        try {
            EntityUtil.updateEntity(requestProtocol, entity, ignoreList.toArray(new String[ignoreList.size()]));
            V vo = EntityUtil.convert(entity, getVoClass());
            response.setData(vo);
            response.writeMessage(ResponseMessage.CODE_SUCCESS);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.writeMessage(ResponseMessage.CODE_FAIL);
        }
        return response;
    }

    protected ResponseProtocol<List<V>> findEntity(BaseRepository<T> repository, QuerySet querySet) {

        if (querySet.getPagination() != null) {
            Page<T> page = this.query(repository, querySet);
            PaginationResponseProtocol<List<V>> response = new PaginationResponseProtocol<List<V>>();
            response.setPageNo(page.getNumber() + 1);
            response.setPages(page.getTotalPages());
            response.setPageSize(page.getSize());
            response.setTotal(page.getTotalElements());
            List<T> entities = page.getContent();
            if (entities != null && entities.isEmpty() == false) {
                List<V> list = EntityUtil.convert(page.getContent(), getVoClass());
                response.setData(list);
            }
            response.writeMessage(ResponseMessage.CODE_SUCCESS);
            return response;
        } else {
            List<T> dataList = this.getEntityList(repository, querySet);
            BaseResponseProtocol<List<V>> response = new BaseResponseProtocol<List<V>>();
            if (dataList != null && dataList.isEmpty() == false) {
                List<V> list = EntityUtil.convert(dataList, getVoClass());
                response.setData(list);
            }
            response.writeMessage(ResponseMessage.CODE_SUCCESS);
            return response;
        }
    }

    protected Page<T> getEntityPage(BaseRepository<T> repository, QuerySet querySet) {
        return this.query(repository, querySet);
    }

    protected List<T> getEntityList(BaseRepository<T> repository, QuerySet querySet) {
        if (querySet.isSort()) {
            return repository.findAll(this.createSpecification(querySet), new Sort(querySet.getDirection(), querySet.getSortFields()));
        } else {
            return repository.findAll(this.createSpecification(querySet));
        }
    }

    protected Page<T> query(BaseRepository<T> repository, QuerySet querySet) {
        if (querySet.getPagination() == null) {
            throw new SystemException();
        }
        Pageable pageable = null;
        if (querySet.isSort()) {
            pageable = new PageRequest(querySet.getPagination().getPageNo() - 1, querySet.getPagination().getPageSize(),
                    querySet.getDirection(), querySet.getSortFields());
        } else {
            pageable = new PageRequest(querySet.getPagination().getPageNo() - 1, querySet.getPagination().getPageSize());
        }

        return repository.findAll(this.createSpecification(querySet), pageable);
    }

    private Specification<T> createSpecification(QuerySet querySet) {
        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();
                querySet.addQueryParam(new QueryParam(BaseEntity.base_field_isDelete, false, QueryType.equal, Boolean.class));
                Collection<QueryParam> queryParams = querySet.getQueryParams();
                for (QueryParam queryParam : queryParams) {
                    list.add(predicate(queryParam, root, criteriaBuilder));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        };
    }

    private Predicate predicate(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        switch (queryParam.getQueryType()) {
            case equal:
                return this.predicateEqual(queryParam, root, criteriaBuilder);

            case like:
                return this.predicateLike(queryParam, root, criteriaBuilder);

            case left_like:
                return this.predicateLeftLike(queryParam, root, criteriaBuilder);

            case between:
                return this.predicateBetween(queryParam, root, criteriaBuilder);

            case greater_than:
                return this.predicateGreaterThan(queryParam, root, criteriaBuilder);

            case greater_than_or_equal_to:
                return this.predicateGreaterThanOrEqualTo(queryParam, root, criteriaBuilder);

            case less_than:
                return this.predicateLessThan(queryParam, root, criteriaBuilder);

            case less_than_or_equal_to:
                return this.predicateLessThanOrEqualTo(queryParam, root, criteriaBuilder);

            case in:
                return this.predicateIn(queryParam, root, criteriaBuilder);

            default:
                throw new SystemException();
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private In predicateIn(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        In in = criteriaBuilder.in(root.get(queryParam.getFieldName()));

        List<?> values = (List<?>) queryParam.getValue();
        for (Object value : values) {
            in.value(value);
        }
        return in;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Predicate predicateLessThanOrEqualTo(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        Class lessThanOrEqualToClass = queryParam.getValueType();
        if (lessThanOrEqualToClass == Integer.class) {
            return criteriaBuilder.lessThanOrEqualTo(root.get(queryParam.getFieldName()).as(lessThanOrEqualToClass),
                    (Integer) queryParam.getValue());
        }
        if (lessThanOrEqualToClass == Long.class) {
            return criteriaBuilder.lessThanOrEqualTo(root.get(queryParam.getFieldName()).as(lessThanOrEqualToClass),
                    (Long) queryParam.getValue());
        }
        if (lessThanOrEqualToClass == Double.class) {
            return criteriaBuilder.lessThanOrEqualTo(root.get(queryParam.getFieldName()).as(lessThanOrEqualToClass),
                    (Double) queryParam.getValue());
        }
        if (lessThanOrEqualToClass == Short.class) {
            return criteriaBuilder.lessThanOrEqualTo(root.get(queryParam.getFieldName()).as(lessThanOrEqualToClass),
                    (Short) queryParam.getValue());
        }
        if (lessThanOrEqualToClass == Date.class) {
            return criteriaBuilder.lessThanOrEqualTo(root.get(queryParam.getFieldName()).as(lessThanOrEqualToClass),
                    (Date) queryParam.getValue());
        }
        throw new SystemException();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Predicate predicateLessThan(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        Class lessThanClass = queryParam.getValueType();
        if (lessThanClass == Integer.class) {
            return criteriaBuilder.lessThan(root.get(queryParam.getFieldName()).as(lessThanClass),
                    (Integer) queryParam.getValue());
        }
        if (lessThanClass == Long.class) {
            return criteriaBuilder.lessThan(root.get(queryParam.getFieldName()).as(lessThanClass),
                    (Long) queryParam.getValue());
        }
        if (lessThanClass == Double.class) {
            return criteriaBuilder.lessThan(root.get(queryParam.getFieldName()).as(lessThanClass),
                    (Double) queryParam.getValue());
        }
        if (lessThanClass == Short.class) {
            return criteriaBuilder.lessThan(root.get(queryParam.getFieldName()).as(lessThanClass),
                    (Short) queryParam.getValue());
        }
        if (lessThanClass == Date.class) {
            return criteriaBuilder.lessThan(root.get(queryParam.getFieldName()).as(lessThanClass),
                    (Date) queryParam.getValue());
        }
        throw new SystemException();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Predicate predicateGreaterThanOrEqualTo(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        Class greaterThanOrEqualToClass = queryParam.getValueType();
        if (greaterThanOrEqualToClass == Integer.class) {
            return criteriaBuilder.greaterThanOrEqualTo(root.get(queryParam.getFieldName()).as(greaterThanOrEqualToClass),
                    (Integer) queryParam.getValue());
        }
        if (greaterThanOrEqualToClass == Long.class) {
            return criteriaBuilder.greaterThanOrEqualTo(root.get(queryParam.getFieldName()).as(greaterThanOrEqualToClass),
                    (Long) queryParam.getValue());
        }
        if (greaterThanOrEqualToClass == Double.class) {
            return criteriaBuilder.greaterThanOrEqualTo(root.get(queryParam.getFieldName()).as(greaterThanOrEqualToClass),
                    (Double) queryParam.getValue());
        }
        if (greaterThanOrEqualToClass == Short.class) {
            return criteriaBuilder.greaterThanOrEqualTo(root.get(queryParam.getFieldName()).as(greaterThanOrEqualToClass),
                    (Short) queryParam.getValue());
        }
        if (greaterThanOrEqualToClass == Date.class) {
            return criteriaBuilder.greaterThanOrEqualTo(root.get(queryParam.getFieldName()).as(greaterThanOrEqualToClass),
                    (Date) queryParam.getValue());
        }
        throw new SystemException();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Predicate predicateGreaterThan(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        Class greaterThanClass = queryParam.getValueType();
        if (greaterThanClass == Integer.class) {
            return criteriaBuilder.greaterThan(root.get(queryParam.getFieldName()).as(greaterThanClass),
                    (Integer) queryParam.getValue());
        }
        if (greaterThanClass == Long.class) {
            return criteriaBuilder.greaterThan(root.get(queryParam.getFieldName()).as(greaterThanClass),
                    (Long) queryParam.getValue());
        }
        if (greaterThanClass == Double.class) {
            return criteriaBuilder.greaterThan(root.get(queryParam.getFieldName()).as(greaterThanClass),
                    (Double) queryParam.getValue());
        }
        if (greaterThanClass == Short.class) {
            return criteriaBuilder.greaterThan(root.get(queryParam.getFieldName()).as(greaterThanClass),
                    (Short) queryParam.getValue());
        }
        if (greaterThanClass == Date.class) {
            return criteriaBuilder.greaterThan(root.get(queryParam.getFieldName()).as(greaterThanClass),
                    (Date) queryParam.getValue());
        }
        throw new SystemException();
    }

    @SuppressWarnings({"unchecked"})
    private Predicate predicateBetween(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        if (queryParam.getValueType() == Date.class) {
            Date start = ((List<Date>) queryParam.getValue()).get(0);
            Date end = ((List<Date>) queryParam.getValue()).get(1);
            return criteriaBuilder.between(root.get(queryParam.getFieldName()).as(Date.class), start, end);
        }
        if (queryParam.getValueType() == Long.class) {
            Long start = ((List<Long>) queryParam.getValue()).get(0);
            Long end = ((List<Long>) queryParam.getValue()).get(1);
            return criteriaBuilder.between(root.get(queryParam.getFieldName()).as(Long.class), start, end);
        }
        if (queryParam.getValueType() == Double.class) {
            Double start = ((List<Double>) queryParam.getValue()).get(0);
            Double end = ((List<Double>) queryParam.getValue()).get(1);
            return criteriaBuilder.between(root.get(queryParam.getFieldName()).as(Double.class), start, end);
        }
        if (queryParam.getValueType() == Integer.class) {
            Integer start = ((List<Integer>) queryParam.getValue()).get(0);
            Integer end = ((List<Integer>) queryParam.getValue()).get(1);
            return criteriaBuilder.between(root.get(queryParam.getFieldName()).as(Integer.class), start, end);
        }
        if (queryParam.getValueType() == Short.class) {
            Short start = ((List<Short>) queryParam.getValue()).get(0);
            Short end = ((List<Short>) queryParam.getValue()).get(1);
            return criteriaBuilder.between(root.get(queryParam.getFieldName()).as(Short.class), start, end);
        }
        throw new SystemException();
    }

    private Predicate predicateEqual(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(
                root.get(queryParam.getFieldName()).as(queryParam.getValueType()), queryParam.getValue());
    }

    private Predicate predicateLike(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        if (queryParam.getValueType() != String.class) {
            throw new SystemException();
        }
        return criteriaBuilder.like(
                root.get(queryParam.getFieldName()).as(String.class), DataKeyword.symbol_like + queryParam.getValue().toString() + DataKeyword.symbol_like);
    }

    private Predicate predicateLeftLike(QueryParam queryParam, Root<T> root, CriteriaBuilder criteriaBuilder) {
        if (queryParam.getValueType() != String.class) {
            throw new SystemException();
        }
        return criteriaBuilder.like(
                root.get(queryParam.getFieldName()).as(String.class), queryParam.getValue().toString() + DataKeyword.symbol_like);
    }

    protected T getEntity() {
        @SuppressWarnings("unchecked")
        Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        try {
            return entityClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    @SuppressWarnings("unchecked")
    protected Class<V> getVoClass() {
        return (Class<V>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
    }

    protected V getVo() {
        try {
            return getVoClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }
}
