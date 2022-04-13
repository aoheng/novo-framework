package com.novo.commons.support.deviceCenter.mqtt.constant;

import com.novo.commons.support.deviceCenter.IEnum;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/31.
 * 洗碗机状态位
 */
public enum D2_ByteStatusFlag implements IEnum {
    POWER_OFF(0x00, "关机"),
    POWER_ON(0x10, "开机"),
    BOOKING(0x20, "预约"),
    RUNNING(0x30, "运行"),
    FAULT(0x40, "故障"),
    RESERVED(0x50, "预留");

    private int value;
    private String commonet;

    D2_ByteStatusFlag(int value, String commonet) {
        this.value = value;
        this.commonet = commonet;
    }

    public static D2_ByteStatusFlag parse(int value) {
        return IEnum.enumValueOf(D2_ByteStatusFlag.class, value);
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
