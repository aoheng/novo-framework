package com.novo.commons.support.deviceCenter.mqtt.constant;

import com.novo.commons.support.deviceCenter.IEnum;

import java.io.Serializable;

/**
 * @author Aoheng on 2020/10/31.
 * 违约原因
 */
public enum ByteBreakReasonType implements IEnum {

    EXPIRED(0x00, "使用时间到期"),
    NOT_AVAILABLE(0x01, "人工操作导致不可用"),
    INVALID_SN(0x02, "与绑定控制板的SN不一致");

    private int value;
    private String commonet;

    ByteBreakReasonType(int value, String commonet) {
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
