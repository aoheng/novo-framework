package com.novo.framework.core.filter;

import java.lang.reflect.Field;
import java.util.Map;

public interface QueryCriteriaFilter {

    public void doFilter(final Map<String, Field> fieldMap);
}
