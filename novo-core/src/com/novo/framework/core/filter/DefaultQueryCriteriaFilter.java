package com.novo.framework.core.filter;

import com.novo.framework.core.entity.BaseEntity;

import java.lang.reflect.Field;
import java.util.Map;

public class DefaultQueryCriteriaFilter implements QueryCriteriaFilter {

    @Override
    public void doFilter(final Map<String, Field> fieldMap) {
        fieldMap.remove(BaseEntity.base_field_dataSort);
    }

}
