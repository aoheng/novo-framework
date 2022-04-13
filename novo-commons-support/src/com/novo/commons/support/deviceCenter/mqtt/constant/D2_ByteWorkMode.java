package com.novo.commons.support.deviceCenter.mqtt.constant;

import com.novo.commons.support.deviceCenter.IEnum;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/31.
 * 工作模式
 */
public enum D2_ByteWorkMode implements IEnum {
    NONE(0x00, "空挡", 0),
    SAVING_WASH(0x01, "节能洗", 90),
    STRONG_WASH(0x02, "强力洗", 80),
    NORMAL_WASH(0x03, "日常洗", 60),
    QUICK_WASH(0x04, "快速洗", 25),
    FEEDER_WASH(0x05, "奶瓶洗", -1),
    FRUIT_WASH(0x06, "果蔬洗", 12),
    SELF_CLEANING(0x07, "自清洁", 6),
    CUSTOM(0x08, "自定义", 0),
    AI(0x09, "智能洗", 80);

    private int value;
    private String comment;
    private int washTotalTime;

    D2_ByteWorkMode(int value, String comment, int washTotalTime) {
        this.value = value;
        this.comment = comment;
        this.washTotalTime = washTotalTime;
    }

    public static D2_ByteWorkMode parse(int value) {
        return IEnum.enumValueOf(D2_ByteWorkMode.class, value);
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

    public int getWashTotalTime() { return washTotalTime; }

    public void setWashTotalTime(int washTotalTime) { this.washTotalTime = washTotalTime; }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
