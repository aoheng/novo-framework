package com.novo.framework.core.dataSource;

import java.util.List;

public enum QueryType {
    equal, like, left_like, between, greater_than, greater_than_or_equal_to, less_than, less_than_or_equal_to, in;

    public static QueryType getQueryType(Class<?> valueType) {
        if (valueType == String.class) {
            return QueryType.like;
        }
        if (valueType == Long.class) {
            return QueryType.equal;
        }
        if (valueType == Integer.class) {
            return QueryType.equal;
        }
        if (valueType == Boolean.class) {
            return QueryType.equal;
        }
        if (valueType == Character.class) {
            return QueryType.equal;
        }

        if (valueType == String[].class) {
            return QueryType.in;
        }
        if (valueType == Long[].class) {
            return QueryType.in;
        }
        if (valueType == Integer[].class) {
            return QueryType.in;
        }
        if (valueType == Boolean[].class) {
            return QueryType.in;
        }

        if (valueType == List.class) {
            return QueryType.in;
        }

        if (valueType.isEnum()) {
            return QueryType.equal;
        }
        return null;
    }
}
