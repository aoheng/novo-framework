package com.novo.framework.core.type;

import java.util.Date;

public enum BaseDataType {
    _String("String", String.class, "字符串"),
    _Integer("Integer", Integer.class, "整型"),
    _Long("Long", Long.class, "长整型"),
    _Double("Double", Double.class, "双精度"),
    _Character("Character", Character.class, "字符"),
    _Boolean("Boolean", Boolean.class, "布尔"),
    _Byte("Byte", Byte.class, "byte整型"),
    _Date("Date", Date.class, "时间");

    private String name;

    private Class<?> type;

    private BaseDataType(String name, Class<?> type, String desc) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }
}
