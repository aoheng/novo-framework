package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 11:38 2020/1/30
 */
public enum AccountType {

    CUSTOMER_ACCOUNT("客户账户"),
    DISTRIBUTOR_ACCOUNT("分销商账户"),
    MANUFACTURER_ACCOUNT("厂商账户");


    private String value;

    AccountType(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
