package com.novo.framework.core.interceptor;

import com.novo.framework.core.protocol.RequestProtocol;

import java.lang.reflect.Field;
import java.util.Map;


public interface QueryInterceptor<Q> {

    public <T extends RequestProtocol> void intercept(final Q query, final T requestProtocol,
                                                      final Map<String, Field> entFields) throws Exception;
}
