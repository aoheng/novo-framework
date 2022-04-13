package com.novo.framework.core.reflect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassUtil {

    public static List<Class<?>> getAllInterfaces(Class<?> clazz) {
        List<Class<?>> result = new ArrayList<Class<?>>();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Class<?> interfaces[] = clazz.getInterfaces();
            if (interfaces != null && interfaces.length > 0) {
                result.addAll(Arrays.asList(interfaces));
            }
        }
        return result;
    }

    public static String getClassSimpleName(Class<?> clazz) {
        return clazz.getSimpleName();
    }
}
