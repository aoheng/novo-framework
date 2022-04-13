package com.novo.commons.support.deviceCenter.mqtt.constant;

import com.novo.commons.support.deviceCenter.IEnum;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/31.
 * 洗涤阶段
 */
public enum D2_ByteWashPhase implements IEnum {
    NONE(0x00, "未洗涤"),
    PRE_WASH(0x01, "预洗"),
    MAIN_WASH(0x02, "主洗"),
    RINSE(0x03, "漂洗"),
    DRY(0x04, "干燥"),
    END(0x05, "结束");

    private int value;
    private String comment;

    D2_ByteWashPhase(int value, String comment) {
        this.value = value;
        this.comment = comment;
    }

    public static D2_ByteWashPhase parse(int value) {
        return IEnum.enumValueOf(D2_ByteWashPhase.class, value);
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
