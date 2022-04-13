package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description: 币种枚举
 * @Date: Created in 18:12 2020/1/25
 */
public enum Currency {
    RMB("人民币"),
    Dollar("美元"),
    HK("港币");

    private String value;

    Currency(String value) {
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
