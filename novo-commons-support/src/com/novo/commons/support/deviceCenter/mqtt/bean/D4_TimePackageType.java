package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.nio.ByteOrder;

/**
 * @author MickeyChen
 * @date 2020/11/6
 */
public class D4_TimePackageType {

    /** 模式索引 */
    private Integer typeIndex;
    /** 剩余时间（不超过3600s） */
    private Integer remainTime;

    public D4_TimePackageType() {
    }

    public D4_TimePackageType(byte[] bytes) {
        this.typeIndex = ByteUtils.toUint8(bytes[0]);
        this.remainTime = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 1, 2), ByteOrder.BIG_ENDIAN);
    }

    public Integer getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(Integer typeIndex) {
        this.typeIndex = typeIndex;
    }

    public Integer getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(Integer remainTime) {
        this.remainTime = remainTime;
    }
}
