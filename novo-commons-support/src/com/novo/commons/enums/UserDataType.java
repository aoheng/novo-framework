package com.novo.commons.enums;

/**
 * @author of Aoheng
 * @TODO 数据权限类型
 * @date 2020-01-11 14:17
 **/
public enum UserDataType {

    FORBIDDEN("禁用"), PERSON("个人"), DEPARTMENT("部门"), COMPANY("公司");

    private String value;

    private UserDataType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
