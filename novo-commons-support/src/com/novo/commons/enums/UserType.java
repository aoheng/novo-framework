package com.novo.commons.enums;

/**
 * @author of Aoheng
 * @TODO 用户分类
 * @date 2020-01-11 14:19
 **/
public enum UserType {

    EMPLOYEE("员工"), FACTORY("厂商"), DISTRIBUTOR("分销商"), SUPPERADMIN("系统超级管理员");

    private String value;

    private UserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
