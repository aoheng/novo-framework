package com.novo.framework.core.reflect;

import com.novo.framework.core.bean.ClassBean;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MethodUtil {

    public static final String voidType = "void";

    public static ClassBean getGenericReturnType(Method method) {
        Type genericReturnType = method.getGenericReturnType();
        if (genericReturnType == null || genericReturnType.getTypeName().equals(voidType)) {
            return null;
        }
        return getGenericType(genericReturnType);
    }

    public static ClassBean getGenericType(Type genericReturnType) {
        ClassBean generic = new ClassBean();
        if (genericReturnType instanceof ParameterizedType) {
            ParameterizedType pType = ((ParameterizedType) genericReturnType);
            generic.setClassType(pType.getRawType().getTypeName());

            Type[] actualTypeArguments = pType.getActualTypeArguments();
            if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                List<ClassBean> genericTyps = new ArrayList<ClassBean>();
                for (Type actualTypeArgument : actualTypeArguments) {
                    genericTyps.add(getGenericType(actualTypeArgument));
                }
                generic.setGenericTypes(genericTyps);

            }


        } else {
            generic.setClassType(genericReturnType.getTypeName());
        }
        return generic;
    }

}
