package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description: 证件类型枚举
 * @Date: Created in 19:15 2020/1/25
 */
public enum CertificatesType {
    IDCARD("二代身份证"),
    BUSINESS_LICENSE("营业执照"),
    RESIDENCE("户口本");

    private String value;

    CertificatesType(String value) {
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
