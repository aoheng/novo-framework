package com.novo.data.jpa.query;

import com.novo.framework.core.dataSource.QueryType;

public class QueryParam {
	
	private String fieldName;
	
	private Object value;
	
	private QueryType queryType;
	
	private Class<?> valueType;

	
	public QueryParam(String fieldName, Object value, QueryType queryType, Class<?> valueType) {
		super();
		this.fieldName = fieldName;
		this.value = value;
		this.queryType = queryType;
		this.valueType = valueType;
	}
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public QueryType getQueryType() {
		return queryType;
	}

	public void setQueryType(QueryType queryType) {
		this.queryType = queryType;
	}

	public Class<?> getValueType() {
		return valueType;
	}

	public void setValueType(Class<?> valueType) {
		this.valueType = valueType;
	}
	
	
}
