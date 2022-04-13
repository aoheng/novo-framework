package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 14:33 2020/04/24
 */
public enum OrderStatus {

    OPEN("开立"), CHECKING("审核中"),CHECKED("已审核"),CLOSE("关闭");

    private String value;

    OrderStatus(String value) {
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