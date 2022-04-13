package com.novo.framework.core.entity;

import com.novo.framework.core.bean.util.BeanUtils;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EntityUtil {
	
	/*public static  <T extends RequestProtocol,K extends BaseEntity> void  updateEntity(List<T> sources, Class<K> targetType,
			List<K> targetList) throws Exception{
		updateEntity(sources,targetType,targetList,null);
	}
	
	public static  <T extends RequestProtocol,K extends BaseEntity> void  updateEntity(List<T> sources, Class<K> targetType,
			List<K> targetList,String[] ignoreProperties) throws Exception{
		
		for(T source : sources) {
			K target = targetType.newInstance();
			updateEntity(source,target,ignoreProperties);
			targetList.add(target);
		}
	}*/

    public static <T extends RequestProtocol, K extends BaseEntity> void updateEntity(T dataObject, K targetEntity) throws Exception {
        updateEntity(dataObject, targetEntity, null);
    }

    public static <T extends RequestProtocol, K extends BaseEntity> void updateEntity(T dataObject, K targetEntity, String[] ignoreProperties)
            throws Exception {
        List<Field> entityFields = FieldUtil.getAllFieldList(targetEntity.getClass());
        Map<String, Field> dataObjectFileds = FieldUtil.getAllFieldMap(dataObject.getClass());
        if (ignoreProperties != null) {
            for (String ignore : ignoreProperties) {
                dataObjectFileds.remove(ignore);
            }
        }
        for (Field entityField : entityFields) {
            Field dataField = dataObjectFileds.get(entityField.getName());
            if (dataField == null) {
                continue;
            }
            setValueForField(dataObject, targetEntity, dataField, entityField);
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static <T extends RequestProtocol, K extends BaseEntity>
    void setValueForField(T dataObject, K targetEntity, Field dataField, Field entityField) throws Exception {

        Object value = InvokeMethod.invokeGetter(dataObject, dataField.getName());
        if (value == null || value.equals("")) {
            return;
        }
        if (entityField.getType() != dataField.getType()) {
            System.out.println(entityField.getType() + "   " + entityField.getType().isEnum());
            if (dataField.getType() == String.class && entityField.getType().isEnum()) {
                InvokeMethod.invokeSetter(targetEntity, entityField.getName(),
                        Enum.valueOf((Class<Enum>) entityField.getType(), value.toString()));
            }
        }

        if (entityField.getType() == dataField.getType()) {
            InvokeMethod.invokeSetter(targetEntity, entityField.getName(), value);
        }
    }

    public static <E extends BaseEntity, V extends Serializable> List<V> convert(List<E> entities, Class<V> clazz) {
        List<V> result = new ArrayList<V>();
        for (E entity : entities) {
            result.add(convert(entity, clazz));
        }
        return result;
    }

    public static <E extends BaseEntity, V extends Serializable> List<E> convertEntity(List<V> voList, Class<E> clazz) {
        List<E> result = new ArrayList<E>();
        for (V vo : voList) {
            result.add(convert(vo, clazz));
        }
        return result;
    }

    public static <E extends BaseEntity, V extends Serializable> V convert(E entity, Class<V> clazz) {
        try {
            V vo = clazz.newInstance();
            BeanUtils.copyProperties(entity, vo);
            return vo;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    public static <E extends BaseEntity, V extends Serializable> E convert(V vo, Class<E> clazz) {
        try {
            E entity = clazz.newInstance();
            BeanUtils.copyProperties(vo, entity);
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }
}
