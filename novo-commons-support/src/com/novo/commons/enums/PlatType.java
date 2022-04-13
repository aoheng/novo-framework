package com.novo.commons.enums;

/**
 * @author of Aoheng
 * @TODO 平台类型
 * @date 2020-05-17 14:06
 **/

public enum PlatType {
    ACCREDIT("授权"), COMMON("通用");

    private String value;

    private PlatType(String value) {
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
