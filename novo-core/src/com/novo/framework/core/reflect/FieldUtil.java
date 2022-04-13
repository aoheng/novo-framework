package com.novo.framework.core.reflect;

import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.DefaultRequestProtocol;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class FieldUtil {

    public static final List<Field> getAllFieldList(Class<?> clazz) {
        List<Field> result = new ArrayList<Field>();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                result.add(field);
            }
        }
        return result;
    }

    public static final List<Field> getFieldList(Class<?> clazz) {
        List<Field> result = new ArrayList<Field>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            System.out.println(field.getName() + "," + field.getType() + "," + field.getGenericType());
            result.add(field);
        }
        return result;
    }

    public static final boolean contains(Object object, String field) {
        Map<String, Field> fields = getFieldMap(object.getClass());
        if (fields.containsKey(field)) {
            return true;
        }
        return false;
    }

    public static final Map<String, Field> getFieldMap(Class<?> clazz) {
        Map<String, Field> result = new ConcurrentHashMap<String, Field>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            result.put(field.getName(), field);
        }
        return result;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
//		getFieldList(PaginationRequestProtocol.class);

        Enum<?>[] es = getEnumValues(DefaultRequestProtocol.class.getDeclaredField("dataScope"));
        for (Enum<?> en : es) {
            System.out.println(en);
        }


    }

    public static final Map<String, Field> getAllFieldMap(Class<?> clazz) {
        Map<String, Field> result = new ConcurrentHashMap<String, Field>();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                result.put(field.getName(), field);
            }
        }
        return result;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static Object enumValue(Field field, Object value) {
        return Enum.valueOf((Class<Enum>) field.getType(), value.toString());
    }

    public static Enum<?>[] getEnumValues(Field field) {
        if (field.getType().isEnum()) {
            try {
                Class<?> clazz = field.getType();
                Method method = clazz.getMethod("values");
                Enum<?>[] enums = (Enum<?>[]) method.invoke(null);
                return enums;
            } catch (Exception e) {
                throw new SystemException();
            }
        } else {
            throw new SystemException();
        }
    }

    public static String[] getEnumNames(Field field) {
        if (field.getType().isEnum()) {
            try {
                Class<?> clazz = field.getType();
                Method method = clazz.getMethod("values");
                Enum<?>[] enums = (Enum<?>[]) method.invoke(null);
                String[] names = new String[enums.length];
                int count = 0;
                for (Enum<?> en : enums) {
                    names[count] = en.name();
                    count++;
                }
                return names;
            } catch (Exception e) {
                throw new SystemException();
            }
        } else {
            throw new SystemException();
        }
    }
}
