package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.util.List;

/**
 * @author MickeyChen
 * @date 2020/11/6
 */
public class D4_ByteArrayCoinsPackage {

    /** 参数长度 */
    private Integer length;
    /** 模式总数（不超过7种） */
    private Integer typeTotal;

    private List<D4_CoinsPackageType> typeList;

    public D4_ByteArrayCoinsPackage() {
    }

    public D4_ByteArrayCoinsPackage(byte[] bytes) {
        this.length = ByteUtils.toUint8(bytes[0]);
        this.typeTotal = ByteUtils.toUint8(bytes[1]);
        for (int i = 2; i < bytes.length; i = i+2) {
            if (bytes.length < i+1) {
                break;
            }
            byte[] byteOne = {bytes[i],bytes[i+1]};
            D4_CoinsPackageType type = new D4_CoinsPackageType(byteOne);
            this.typeList.add(type);
        }
    }

    @Override
    public String toString() {
        return String.format("{length=%s, typeTotal=%s, typeList=%s}", length, typeTotal, typeList);
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getTypeTotal() {
        return typeTotal;
    }

    public void setTypeTotal(Integer typeTotal) {
        this.typeTotal = typeTotal;
    }

    public List<D4_CoinsPackageType> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<D4_CoinsPackageType> typeList) {
        this.typeList = typeList;
    }
}
