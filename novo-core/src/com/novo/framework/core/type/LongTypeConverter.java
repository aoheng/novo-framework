package com.novo.framework.core.type;

import com.novo.framework.core.converter.Converter;
import com.novo.framework.core.exception.SystemException;

public class LongTypeConverter implements Converter<Object, Long> {

    @Override
    public Long convert(Object data) {
        if (data == Integer.class || data.getClass() == String.class) {
            String conver = (String) data;
            return Long.valueOf(conver);
        }
        throw new SystemException();
    }

}
