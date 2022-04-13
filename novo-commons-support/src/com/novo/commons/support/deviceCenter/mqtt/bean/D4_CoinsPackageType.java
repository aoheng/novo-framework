package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author MickeyChen
 * @date 2020/11/6
 */
public class D4_CoinsPackageType {

    /** 模式索引 */
    private Integer typeIndex;
    /** 投币数 */
    private Integer coinsTotal;

    public D4_CoinsPackageType() {
    }

    public D4_CoinsPackageType(byte[] bytes) {
        this.typeIndex = ByteUtils.toUint8(bytes[0]);
        this.coinsTotal = ByteUtils.toUint8(bytes[1]);

    }

    public Integer getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(Integer typeIndex) {
        this.typeIndex = typeIndex;
    }

    public Integer getCoinsTotal() {
        return coinsTotal;
    }

    public void setCoinsTotal(Integer coinsTotal) {
        this.coinsTotal = coinsTotal;
    }
}
