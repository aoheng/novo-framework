package com.novo.framework.core.bean.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

public class BeanUtils {
	
	public static  <T> List<T> copyPropertiesToList(List<?> sources, Class<T> targetType) throws Exception{
		return copyPropertiesToList(sources,targetType,null);
	}
	
	public static  <T> List<T>  copyPropertiesToList(List<?> sources, Class<T> targetType,String[] ignoreProperties) throws Exception{
		List<T> targetList = new ArrayList<T>();
		for(Object source : sources) {
			T target = targetType.newInstance();
			copyProperties(source,target,ignoreProperties);
			targetList.add(target);
		}
		return targetList;
	}
	
	public static void  copyProperties(Object source, Object target) throws Exception{
		copyProperties(source,target,null);
	}
	public static void  copyProperties(Object source, Object target,String[] ignoreProperties) throws Exception{
		List<Field> entityFields = FieldUtil.getAllFieldList(target.getClass());
		Map<String,Field> dataObjectFileds = FieldUtil.getAllFieldMap(source.getClass());
		if(ignoreProperties != null) {
			for(String ignore : ignoreProperties) {
				dataObjectFileds.remove(ignore);
			}
		}
		for(Field entityField : entityFields) {
			Field dataField = dataObjectFileds.get(entityField.getName());
			if(dataField == null) {
				continue;
			}
			setValueForField(source, target, dataField, entityField);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void setValueForField(Object source, Object target,Field dataField,Field entityField) throws Exception {
		
		Object value = InvokeMethod.invokeGetter(source, dataField.getName());
		if(value == null || value.equals("")) {
			return;
		}
		if(entityField.getType() != dataField.getType()) {
			if(dataField.getType() == String.class && entityField.getType().isEnum()) {
				InvokeMethod.invokeSetter(target, entityField.getName(),
						Enum.valueOf((Class<Enum>)entityField.getType(), value.toString()));
			}
			if(dataField.getType().isEnum() && entityField.getType() == String.class) {
				InvokeMethod.invokeSetter(target,entityField,((Enum)value).name());
			}
		}
		
		if(entityField.getType() == dataField.getType()) {
			InvokeMethod.invokeSetter(target, entityField, value);
		}
	}
	
	public static <V extends Serializable> List<V> convert(List<?> resources,Class<V> clazz){
		List<V> result = new ArrayList<V>();
		for(Object resource : resources) {
			result.add(convert(resource,clazz));
		}
		return result;
	}
	public static <V extends Serializable> V convert(Object resource,Class<V> clazz) {
		try {
			V vo = clazz.newInstance();
			copyProperties(resource, vo);
			return vo;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException();
		}
	}
}
