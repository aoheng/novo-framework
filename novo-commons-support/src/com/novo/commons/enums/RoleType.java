package com.novo.commons.enums;

/**
 * @author of Aoheng
 * @TODO 角色使用状态
 * @date 2020-01-11 14:14
 **/
public enum RoleType {

    FORBIDDEN("禁用"), USABLE("可用");

    private String value;

    private RoleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }



}
