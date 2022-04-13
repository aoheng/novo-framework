package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 14:31 2020/03/02
 */
public enum ContractStatus {
    NotEnable("未启用"),
    Enable("启用"),
    Expired("过期");

    private String value;

    ContractStatus(String value) {
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