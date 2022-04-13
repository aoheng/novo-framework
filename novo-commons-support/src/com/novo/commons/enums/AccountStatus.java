package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description: 账户状态枚举
 * @Date: Created in 17:57 2020/1/25
 */
public enum AccountStatus {
    CHECK("审核"),
    ENABLE("启用"),
    FROZEN("冻结");

    private String value;

    AccountStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
