package com.novo.framework.core.type;

import com.novo.framework.core.exception.SystemException;

public class DataTypeResolver {

    public static final Object resolve(Object data, Class<?> targetType) {
        if (targetType == Long.class) {
            LongTypeConverter longTypeConverter = new LongTypeConverter();
            return longTypeConverter.convert(data);
        }
        throw new SystemException();
    }
}
