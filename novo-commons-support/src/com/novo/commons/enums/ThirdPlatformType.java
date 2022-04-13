package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description: 第三方平台类型枚举
 * @Date: Created in 14:03 2020/1/22
 */
public enum ThirdPlatformType {

    WeChat("微信"),
    Alipay("支付宝"),
    QQ("QQ"),
    Bank("银行平台");

    private String value;

    ThirdPlatformType(String value) {
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
