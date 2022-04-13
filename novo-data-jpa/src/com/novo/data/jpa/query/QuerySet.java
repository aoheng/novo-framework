package com.novo.data.jpa.query;

import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.protocol.Pagination;
import org.springframework.data.domain.Sort.Direction;

import java.util.*;

public class QuerySet {
	
	private Map<String,QueryParam> queryParams = new HashMap<String,QueryParam>();
	
	private List<String> sortFields = new ArrayList<String>();
	
	private Pagination pagination ;
	
	private Map<String,Object> queryField = new HashMap<String,Object>();

	private Direction direction;
	
	public QuerySet() {
		this.direction = Direction.DESC;
		this.defaultSort(); 
	}
	public void defaultSort() {
		sortFields.add(BaseEntity.base_field_updateTime);
		sortFields.add(BaseEntity.base_field_dataSort);
	}
	public void setSortField(Direction direction,String... fieldNames) {
		if(direction != null) {
			this.direction = direction;
		}else {
			this.direction = Direction.DESC;
		}
		if(fieldNames != null) {
			sortFields.clear();
			for(String fieldName : fieldNames) {
				sortFields.add(fieldName);
			}
		}else {
			this.defaultSort();
		}
	}
	public void setSortField(String... fieldNames) {
		this.setSortField(null, fieldNames);
	}
	public Direction getDirection() {
		return this.direction;
	}
	public Collection<QueryParam> getQueryParams() {
		return this.queryParams.values();
	}
	public String[] getSortFields() {
		return sortFields.toArray(new String[sortFields.size()]);
	}
	public Boolean isSort() {
		return this.direction == null ? false : true;
	}
	public void removeQueryParam(String queryParamName) {
		this.queryParams.remove(queryParamName);
	}
	public void addQueryParam(QueryParam queryParam) {
		this.queryParams.put(queryParam.getFieldName(),queryParam);
	}
	
	public void addQueryParams(List<QueryParam> queryParams) {
		for(QueryParam queryParam : queryParams) {
			this.queryParams.put(queryParam.getFieldName(),queryParam);
		}
	}
	
	public void addQueryParams(QueryParam[] queryParams) {
		for(QueryParam queryParam : queryParams) {
			this.queryParams.put(queryParam.getFieldName(),queryParam);
		}
	}
	public void removeQueryField(String queryFieldName) {
		this.queryField.remove(queryFieldName);
	}
	public void addQueryField(String fieldName) {
		this.queryField.put(fieldName,fieldName);
	}
	
	public void addQueryFields(List<String> fieldNames) {
		for(String fieldName : fieldNames) {
			this.queryField.put(fieldName,fieldName);
		}
	}
	
	public void addQueryFields(String[] fieldNames) {
		for(String fieldName : fieldNames) {
			this.queryField.put(fieldName,fieldName);
		}
	}
	
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	
}
