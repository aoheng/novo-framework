package com.novo.commons.util.excel.helper;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;

import com.novo.commons.util.excel.ExcelOperBaseException;
import com.novo.commons.util.excel.annotation.TitleCell;
import com.novo.commons.util.excel.model.ExcelMeta;
import com.novo.commons.util.excel.model.TitleMeta;

public class ExcelBeanHelper {

	private static Map<String, Map<String, PropertyDescriptor>> aliasPropertyDescriptorCache = new ConcurrentHashMap<String, Map<String, PropertyDescriptor>>();

	private static Map<String, ExcelMeta> titleCellBeanCache = new ConcurrentHashMap<String, ExcelMeta>();

	public static <T> List<T> setRowValues(Class<T> clazz,List<String> contents){

		try {	
			Map<String, PropertyDescriptor> pds = getAliasPropertyDescriptors(clazz);
			
			List<T> results = new ArrayList<>();
			if(contents.isEmpty())return results;
			
			String[] titles = getExcelMeta(clazz).getFinalTitles();
			
			int titleRowCount = getExcelMeta(clazz).getTitleRowNum();
			
			//解析内容标题内容为数组
			List<String> contentTitles = new ArrayList<>();
			//第一行为sheet信息
			for (int i = 1; i <= titleRowCount; i++) {
				contentTitles.addAll(Arrays.asList(contents.get(i).split(ExcelValidator.FIELD_SPLIT)));
			}
			
			for (int i = 0; i < titles.length; i++) {
				if(titleRowCount == 1){
					if(!StringUtils.equals(titles[i], contentTitles.get(i)))throw new ExcelOperBaseException("格式错误，没有找到列["+titles[i] + "]");
				}else{
					if(!contentTitles.contains(titles[i]))throw new ExcelOperBaseException("格式错误，没有找到列["+titles[i] + "]");
				}
			}
			
			String[] vals = null;
			for (int i = titleRowCount + 1; i < contents.size(); i++) {
				String line = contents.get(i);
				if(line.startsWith(ExcelValidator.SHEET_NAME_PREFIX)){
					throw new ExcelOperBaseException("模板错误(暂不支持多个sheet)");
				}
				T instance = clazz.newInstance();
				vals = line.split(ExcelValidator.FIELD_SPLIT);

				boolean anyColumnNotEmpty = false;
				inner:for (int j = 0; j < titles.length; j++) {
					if(vals.length < j + 1 )break inner;
					anyColumnNotEmpty = anyColumnNotEmpty || StringUtils.isNotBlank(vals[j]);
					PropertyDescriptor propertyDescriptor = pds.get(clearWrapper(titles[j]).trim());
					if(propertyDescriptor != null && vals[j] != null){
						try {
							Object rawValue = rawValue(vals[j],propertyDescriptor.getPropertyType());
							propertyDescriptor.getWriteMethod().invoke(instance, rawValue);
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
				if(anyColumnNotEmpty){					
					results.add(instance);
				}
			}
			
			return results;
		} catch (Exception e) {
			if(e instanceof ExcelOperBaseException)throw (ExcelOperBaseException)e;
			throw new BeanConverterException(e);
		}
	
	}
	
	public static <T> List<Object[]> beanToExcelValueArrays(List<T> datas,Class<T> clazz){
		
		Map<String, PropertyDescriptor> pds = getAliasPropertyDescriptors(clazz);
		
		List<Object[]> result = new ArrayList<>(datas.size() + 1);
		
		String[] titles = getExcelMeta(clazz).getFinalTitles();
		
		if(datas == null || datas.isEmpty())return result;
			
		int valNums = titles.length;
		Object[] valArrs;
		for (T e : datas) {
			valArrs = new Object[valNums];
			try {				
				for (int i = 0; i < titles.length; i++) {
					PropertyDescriptor descriptor = pds.get(titles[i]);
					if(descriptor != null){
						valArrs[i] = descriptor.getReadMethod().invoke(e);
					}
				}
				result.add(valArrs);
			} catch (Exception e2) {
				throw new BeanConverterException(e2);
			}
		}
		return result;
	}
	
	
	public static ExcelMeta getExcelMeta(Class<?> clazz){
		String key = clazz.getCanonicalName();
		if(!titleCellBeanCache.containsKey(key)){
			getAliasPropertyDescriptors(clazz);
		}
		return titleCellBeanCache.get(key);
	}

	
	 private static Object rawValue(String value,Class<?> propertyType){
		    value = clearWrapper(value);
	    	Object result = value;
	    	if (propertyType == String.class) {
	    		return result;
	        }else if (propertyType == BigDecimal.class) {
	    		result = new BigDecimal(value.replaceAll(",", ""));
	        } else if (propertyType == byte.class || propertyType == Byte.class) {
	        	result = Byte.valueOf(value);
	        } else if (propertyType == short.class || propertyType == Short.class) {
	        	result = Short.valueOf(value.replaceAll(",", ""));
	        } else if (propertyType == int.class || propertyType == Integer.class) {
	        	result = Integer.parseInt(value.replaceAll(",", ""));
	        } else if (propertyType == double.class || propertyType == Double.class) {
	        	result = Double.valueOf(value.replaceAll(",", ""));
	        }else if (propertyType == float.class || propertyType == Float.class) {
	        	result = Float.parseFloat(value.replaceAll(",", ""));
	        } else if (propertyType == Date.class) {
	        	if(value != null){
	        		//TODO
	        	}
	            
	        } else if (propertyType == boolean.class || propertyType == Boolean.class) {
	        	result = Boolean.parseBoolean(value);
	        } 
	    	return result;
	    }
	
	private static Map<String, PropertyDescriptor> getAliasPropertyDescriptors(Class<?> clazz) {
		try {
			String canonicalName = clazz.getCanonicalName();
			Map<String, PropertyDescriptor> map = aliasPropertyDescriptorCache.get(canonicalName);
			
			if (map == null) {
				doCacheClass(clazz, canonicalName);
				map = aliasPropertyDescriptorCache.get(canonicalName);
			}
			
			return map;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param clazz
	 * @param canonicalName
	 * @return
	 * @throws IntrospectionException
	 */
	private synchronized static void doCacheClass(Class<?> clazz, String canonicalName)
			throws Exception {
		if (aliasPropertyDescriptorCache.containsKey(canonicalName))
			return;

		Map<String, PropertyDescriptor> map = new HashMap<>();
		Map<String, PropertyDescriptor> aliasMap = new HashMap<>();

		List<TitleMeta> titleMetas = new ArrayList<>();

		BeanInfo srcBeanInfo = Introspector.getBeanInfo(clazz);

		PropertyDescriptor[] descriptors = srcBeanInfo.getPropertyDescriptors();
		
		Map<String, TitleMeta> parentMap = new HashMap<>();
		int maxRow = 1;
		
		for (PropertyDescriptor descriptor : descriptors) {

			String name = descriptor.getName();
			
			if("class".equals(name))continue;

			Method readMethod = descriptor.getReadMethod();
			Method writeMethod = descriptor.getWriteMethod();

			
			if (readMethod == null)
				try {
					readMethod = clazz.getMethod("get" + name.substring(0, 1).toUpperCase() + name.substring(1));

					descriptor.setReadMethod(readMethod);
				} catch (NoSuchMethodException | SecurityException e) {
				}

			if (writeMethod == null)
				try {
					writeMethod = clazz.getMethod("set" + name.substring(0, 1).toUpperCase() + name.substring(1),
							descriptor.getPropertyType());

					descriptor.setWriteMethod(writeMethod);
				} catch (NoSuchMethodException | SecurityException e) {
				}

			if (readMethod != null || writeMethod != null) {
				map.put(descriptor.getName(), descriptor);
				//
				TitleCell annotation = null;
				try {
					annotation = clazz.getDeclaredField(name).getAnnotation(TitleCell.class);
				} catch (NoSuchFieldException e) {
					annotation = clazz.getSuperclass().getDeclaredField(name).getAnnotation(TitleCell.class);
				}
				if(annotation != null){
					aliasMap.put(annotation.name().trim(), descriptor);
					
					TitleMeta cell = new TitleMeta(annotation.name());
					cell.setValueType(annotation.type());
					
					if(StringUtils.isBlank(annotation.parentName())){
						cell.setColumnIndex(annotation.column());
						cell.setRowIndex(annotation.row());
						titleMetas.add(cell);
					}else{
						TitleMeta cellParent = parentMap.get(annotation.parentName());
						if(cellParent == null){
							cellParent = new TitleMeta(annotation.parentName());
							cellParent.setValueType(annotation.type());
							cellParent.setColumnIndex(annotation.column());
							parentMap.put(annotation.parentName(), cellParent);
							titleMetas.add(cellParent);
						}
						cell.setColumnIndex(annotation.column());
						cell.setRowIndex(annotation.row());
						cellParent.addChildren(cell);
						
						maxRow = annotation.row() > maxRow ? annotation.row() : maxRow;
					}
				}
			}
			
		}
		
		
        
        ExcelMeta excelMeta = new ExcelMeta(clazz,titleMetas,maxRow);
        titleCellBeanCache.put(canonicalName, excelMeta);
		aliasPropertyDescriptorCache.put(canonicalName, aliasMap);
	}
	
	private static String clearWrapper(String orig){
		return orig;
	}
	
	public static class BeanConverterException extends RuntimeException {
        private static final long serialVersionUID = 152873897614690397L;

        public BeanConverterException(Throwable cause) {
            super(cause);
        }
    }
	

}
