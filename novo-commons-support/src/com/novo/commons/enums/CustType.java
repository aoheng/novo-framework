package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 18:06 2020/04/25
 */
public enum CustType {

    OPERATIONCUST("运营商客户"), WEBSITECUST("官网客户"),APPCUST("app客户"),PUBLICCUST("公众号客户");

    private String value;

    CustType(String value) {
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