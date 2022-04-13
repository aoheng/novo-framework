package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 19:30 2020/04/24
 */
public enum OrderType {

    PURCHASE("购机"), RENT("租赁");

    private String value;

    OrderType(String value) {
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