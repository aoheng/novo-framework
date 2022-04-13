package com.novo.commons.support.deviceCenter.mqtt.constant;


import com.novo.commons.support.deviceCenter.IEnum;

import java.io.Serializable;

/**
 * @author Aoheng on 2020/10/31.
 * 操作结果类型
 */
public enum ByteOptResultType implements IEnum {

    SUCESS(0x00, "成功"),
    FAILED(0x01, "失败"),
    NOT_SUPPORT(0x02, "不支持"),
    CONTENT_ERROR(0x03, "内容错误");

    private int value;
    private String commonet;

    ByteOptResultType(int value, String commonet) {
        this.value = value;
        this.commonet = commonet;
    }

    /** 枚举数据库存储值 */
    @Override
    public Serializable getEnumValue() {
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCommonet() {
        return commonet;
    }

    public void setCommonet(String commonet) {
        this.commonet = commonet;
    }
}
