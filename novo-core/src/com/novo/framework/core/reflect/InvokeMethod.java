package com.novo.framework.core.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InvokeMethod {

    private static final String get = "get";
    private static final String set = "set";

    public static Object invokeGetter(Object object, String fieldName) throws Exception {
        Method method = object.getClass().getMethod(getMethodName(get, fieldName));
        return method.invoke(object);

    }

    public static void invokeSetter(Object object, String fieldName, Object params) throws Exception {
        Method method = object.getClass().getMethod(getMethodName(set, fieldName), params.getClass());
		/*Class<?> paraType = method.getParameterTypes()[0];
		if(params.getClass() != paraType) {
			params = DataTypeResolver.resolve(params, paraType);
		}*/
        method.invoke(object, params);
    }

    public static void invokeSetter(Object object, Field field, Object params) throws Exception {
        Method method = object.getClass().getMethod(getMethodName(set, field.getName()), field.getType());
		/*Class<?> paraType = method.getParameterTypes()[0];
		if(params.getClass() != paraType) {
			params = DataTypeResolver.resolve(params, paraType);
		}*/
        method.invoke(object, params);
    }

    private static String getMethodName(String setterOrGetter, String fieldName) {
        return setterOrGetter + fieldName.replaceFirst(fieldName.substring(0, 1), fieldName.substring(0, 1).toUpperCase());
    }

}
