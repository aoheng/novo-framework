package com.novo.commons.enums;

import java.lang.reflect.Field;
import java.sql.Date;
import java.util.List;


public enum ElementFieldType {
	DATE,INT,ARRAY,LIST,STRING,ENUM,DOUBLE,BOOLEAN;
	
	public static ElementFieldType getCustomFieldType(String name) {
		for(ElementFieldType e : allowCustomFieldType()) {
			if(e.name().equals(name)) {
				return e;
			}
		}
		return null;
	}
	
	public static ElementFieldType[] allowCustomFieldType() {
		return new ElementFieldType[] {DATE,INT,STRING};
	}
	
	public static ElementFieldType getFieldType(Class<?> clazz) {
		if(clazz == Date.class) {
			return ElementFieldType.DATE;
		}
		if(clazz == String.class) {
			return ElementFieldType.STRING;
		}
		if(clazz.isEnum()) {
			return ElementFieldType.ENUM;
		}
		if(clazz == Integer.class) {
			return ElementFieldType.INT;
		}
		if(clazz == Long.class) {
			return ElementFieldType.INT;
		}
		if(clazz.isArray()) {
			return ElementFieldType.ARRAY;
		}
		if(clazz == List.class) {
			return ElementFieldType.LIST;
		}
		if(clazz == Double.class) {
			return ElementFieldType.DOUBLE;
		}
		if(clazz == Boolean.class) {
			return ElementFieldType.BOOLEAN;
		}
		return ElementFieldType.STRING;
	}
	
	public static ElementFieldType getFieldType(Field field) {
		return getFieldType(field.getType());
	}
}
