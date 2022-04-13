package com.novo.framework.core.bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class FieldBean implements DataClass{
	
	private String fieldName;
	
	private Class<?> fieldType;
	
	private Annotation annotation;
	
	private Object fieldValue;
	

	public Object getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Class<?> getFieldType() {
		return fieldType;
	}

	public void setFieldType(Class<?> fieldType) {
		this.fieldType = fieldType;
	}

	public Annotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(Annotation annotation) {
		this.annotation = annotation;
	}

	@Override
	public Class<?> getType() {
		return fieldType;
	}
	
}
