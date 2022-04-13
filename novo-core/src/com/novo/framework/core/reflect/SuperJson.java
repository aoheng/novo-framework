package com.novo.framework.core.reflect;

import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.type.DataTypeResolver;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.lang.reflect.Field;
import java.util.*;

public class SuperJson {

    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper().setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static <T> T readValue(Object arg, Class<T> clazz) {
        Map<String, Field> fields = FieldUtil.getAllFieldMap(clazz);
        try {
            Map<String, Field> map = FieldUtil.getAllFieldMap(arg.getClass());
            T t = clazz.newInstance();
            for (String key : map.keySet()) {
                Field field = fields.get(key);
                Object value = InvokeMethod.invokeGetter(arg, key);
                if (field != null && value != null && !value.equals("")) {
                    Field dataField = map.get(key);
                    if (dataField.getType() != field.getType()) {
                        value = DataTypeResolver.resolve(value, field.getType());
                    }
                    InvokeMethod.invokeSetter(t, key, value);
                }
            }
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    public static <T> T readValue(Object arg, Class<T> clazz, String[] ignoreProperties) {
        if (ignoreProperties == null || ignoreProperties.length < 1) {
            return readValue(arg, clazz);
        }
        List<String> ignorePropertiesList = Arrays.asList(ignoreProperties);
        Map<String, Field> fields = FieldUtil.getAllFieldMap(clazz);
        try {
            Map<String, Field> map = FieldUtil.getAllFieldMap(arg.getClass());
            T t = clazz.newInstance();
            for (String key : map.keySet()) {
                if (ignorePropertiesList.contains(key)) {
                    continue;
                }
                Field field = fields.get(key);
                Object value = InvokeMethod.invokeGetter(arg, key);
                if (field != null && value != null && !value.equals("")) {
                    Field dataField = map.get(key);
                    if (dataField.getType() != field.getType()) {
                        value = DataTypeResolver.resolve(value, field.getType());
                    }
                    if (value.getClass() != field.getType()) {
                        InvokeMethod.invokeSetter(t, field, value);
                    } else {
                        InvokeMethod.invokeSetter(t, key, value);
                    }
                }
            }
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    public static <T> List<T> readValue(List<Map<String, Object>> sources, Class<T> clazz) {
        List<T> result = new ArrayList<T>();
        for (Map<String, Object> source : sources) {
            result.add(readValue(source, clazz));
        }
        return result;
    }

    public static <T> T readValue(Map<String, Object> source, Class<T> clazz) {
        Map<String, Field> fields = FieldUtil.getAllFieldMap(clazz);
        T t;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e1) {
            e1.printStackTrace();
            throw new SystemException();
        }
        for (String key : source.keySet()) {
            Object value = source.get(key);
            if (fields.get(key) != null && value != null) {
                try {
                    InvokeMethod.invokeSetter(t, key, value);
                } catch (Exception e) {
                    if (value.getClass() == Long.class) {
                        try {
                            InvokeMethod.invokeSetter(t, key, new Date((Long) value));
                        } catch (Exception e1) {
                            e1.printStackTrace();
                            continue;
                        }
                    }
                    if (value.getClass() == Integer.class) {
                        try {
                            InvokeMethod.invokeSetter(t, key, new Long((int) value));
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        }
        return t;
    }

    public static <T> T convertValue(Object fromValue, Class<T> toValueType) {
        return mapper.convertValue(fromValue, toValueType);
    }

    public static <T> List<T> convertListValue(Object fromValue, Class<T> toValueType) {
        List<?> list = mapper.convertValue(fromValue, List.class);
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<T> result = new ArrayList<T>();
        for (Object object : list) {
            result.add(mapper.convertValue(object, toValueType));
        }
        return result;
    }
}
