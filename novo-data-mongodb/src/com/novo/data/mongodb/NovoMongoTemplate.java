package com.novo.data.mongodb;

import com.novo.framework.core.bean.util.BeanUtils;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.dataSource.SortType;
import com.novo.framework.core.entity.MBaseEntity;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.*;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;

//@Component
public class NovoMongoTemplate {
	
	@Autowired private MongoTemplate mongoTemplate;
	
//	public NovoMongoTemplate(MongoTemplate mongoTemplate) {
//		this.mongoTemplate = mongoTemplate;
//	}
	
	public <R extends RequestProtocol,T extends MBaseEntity,K extends Serializable> PaginationResponseProtocol<List<K>> findEntity(
			R requestProtocol,Class<T> entityClass,Class<K> voClass) {
		PaginationResponseProtocol<List<K>> resp = new PaginationResponseProtocol<List<K>>();
		Query query = null;
		try {
			query = this.createwQuery(requestProtocol, entityClass);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException();
		}
		if(query == null) {
			query = new Query();
		}
		if(DataSort.class.isAssignableFrom(requestProtocol.getClass())) {
			DataSort dataSort = (DataSort)requestProtocol;
			String[] sortFields = dataSort.getSortFields();
			SortType sortType = dataSort.getSortType();
			if(sortFields != null && sortType != null) {
				for(String sortField : sortFields) {
					if(sortType == SortType.desc) {
						query.with(new Sort(Direction.DESC, sortField));
					}else {
						query.with(new Sort(Direction.ASC, sortField));
					}
				}
			}
		}
		if(Pagination.class.isAssignableFrom(requestProtocol.getClass())) {
			Pagination pagination = (Pagination)requestProtocol;
			long count=(long) mongoTemplate.count(query,entityClass);
			resp.setPageNo(pagination.getPageNo());
			int pages = (int)count / pagination.getPageSize();
			if(count % pagination.getPageSize() > 0) {
				pages ++;
			}
			query.skip((pagination.getPageNo()-1) * pagination.getPageSize()).limit(pagination.getPageSize());
			resp.setPages(pages);
			resp.setPageSize(pagination.getPageSize());
			resp.setTotal(count);
		}
		List<T> list = mongoTemplate.find(query, entityClass);
		resp.setData(BeanUtils.convert(list, voClass));
		resp.writeMessage(ResponseMessage.CODE_SUCCESS);
		return resp;
	}
	public static void main(String[] args) {
		System.out.println(5/2);
	}
	
	protected <R extends RequestProtocol,T extends MBaseEntity> Query createwQuery(R requestProtocol,Class<T> entityClass) throws Exception {
		Criteria cr = null;
		Map<String,Field> reqFields = FieldUtil.getAllFieldMap(requestProtocol.getClass());
		Map<String,Field> enFields = FieldUtil.getAllFieldMap(entityClass);
		int count = 0;
		for(String fieldName : reqFields.keySet()) {
			Field enField = enFields.get(fieldName);
			if(fieldName.equals("taskId")) {
				continue;
			}
			if(enField == null) {
				continue;
			}
			Object value = InvokeMethod.invokeGetter(requestProtocol, fieldName);
			if(value == null || value.toString().equals("")) {
				continue;
			}
			Field reqField = reqFields.get(fieldName);
			if(reqField.getType() != enField.getType()) {
				if(reqField.getType().isEnum()) {
					Object enumValues[] = reqField.getType().getEnumConstants();
					for(Object enumEl : enumValues) {
						if(enumEl.toString().equals(value)) {
							value = enumEl;
							break;
						}
					}
					if(!value.getClass().isEnum()) {
						continue;
					}
				}else {
					continue;
				}
			}
			
			QueryType queryType = QueryType.getQueryType(reqField.getType());
			if(queryType != null) {
				if(count == 0) {
					cr = Criteria.where(fieldName);
					this.setValue(cr, value, queryType);
				}else {
					Criteria criteria = Criteria.where(fieldName);
					this.setValue(criteria, value, queryType);
					cr.andOperator(criteria);
				}
				count ++;
			}
			
		}
		if(TimeStamp.class.isAssignableFrom(requestProtocol.getClass())) {
			TimeStamp timeStamp = (TimeStamp)requestProtocol;
			String targetTimeName = timeStamp.targetTimeName();
			if(targetTimeName != null && !targetTimeName.equals("") && enFields.get(targetTimeName) != null) {
				Date startTime = timeStamp.getStartTime();
				Date endTime = timeStamp.getEndTime();
				if(count == 0) {
					cr = Criteria.where(targetTimeName);
				}else {
					cr.and(targetTimeName);
				}
				if(startTime != null) {
					cr.gt(startTime);
				}
				if(endTime != null) {
					cr.lt(endTime);
				}
			}
		}
		if(cr != null) {
			return Query.query(cr);
		}
		return null;
	}
	
	private void setValue(final Criteria criteria,Object value,QueryType queryType) {
		switch (queryType) {
		case like:
			criteria.regex(value.toString());break;
		case equal:	
			criteria.is(value);break;
		case in:
			criteria.in(value);break;
		case less_than:
			criteria.lt(value);break;
		case greater_than:
			criteria.gt(value);break;
		default:
			break;
		}
	}
}
