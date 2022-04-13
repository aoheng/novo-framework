package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/04/09.
 * 制冷信息（1.5代机)
 */
public class D1_c_ByteArrayCoolingInfo {
//    BYTE[0]：制冷启动后持续没有放冷水的时长(单位：h)
//    BYTE[1]：持续未启动制冷的时间(单位：min)
//    BYTE[2]：强制放冷水模式下，累计放水时长(单位：min)

    /** 制冷启动后持续没有放冷水的时长(单位：h) */
    private Integer nonCoolWaterHours;
    /** 持续未启动制冷的时间(单位：min) */
    private Integer nonCoolingMins;
    /** 强制放冷水模式下，累计放水时长(单位：min) */
    private Integer releaseWaterMins;

    public D1_c_ByteArrayCoolingInfo() {}

    public D1_c_ByteArrayCoolingInfo(byte[] bytes) {
        nonCoolWaterHours = ByteUtils.toUint8(bytes[0]);
        nonCoolingMins = ByteUtils.toUint8(bytes[1]);
        releaseWaterMins = ByteUtils.toUint8(bytes[2]);
    }

    @Override
    public String toString() {
        return String.format("{nonCoolWaterHours=%s, nonCoolingMins=%s, releaseWaterMins=%s}", nonCoolWaterHours, nonCoolingMins, releaseWaterMins);
    }

    public Integer getNonCoolWaterHours() { return nonCoolWaterHours; }

    public void setNonCoolWaterHours(Integer nonCoolWaterHours) { this.nonCoolWaterHours = nonCoolWaterHours; }

    public Integer getNonCoolingMins() { return nonCoolingMins; }

    public void setNonCoolingMins(Integer nonCoolingMins) { this.nonCoolingMins = nonCoolingMins; }

    public Integer getReleaseWaterMins() { return releaseWaterMins; }

    public void setReleaseWaterMins(Integer releaseWaterMins) { this.releaseWaterMins = releaseWaterMins; }
}
