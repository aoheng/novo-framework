package com.novo.commons.support.deviceCenter.mqtt.constant;

import com.novo.commons.support.deviceCenter.IEnum;

import java.io.Serializable;

/**
 * @author Aoheng on 2020/10/31.
 * 原因类型
 */
public enum ByteReasonType implements IEnum {

    FILE_ERROR(0x00, "升级文件错误"),
    NETWORK_ERROR(0x01, "网络出现异常"),
    NOT_SUPPORT(0x02, "升级协议不支持");

    private int value;
    private String commonet;

    ByteReasonType(int value, String commonet) {
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
