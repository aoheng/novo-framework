package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/04/09.
 * 加热信息（1.5代机)
 */
public class D1_c_ByteArrayHeatingInfo {
//    BYTE[0]: 加热停止温度(40~99摄氏度)
//    BYTE[1]: 加热保护时长(单位：h)

    /** 加热停止温度(40~99摄氏度) */
    private Integer stopTemp;
    /** 持续未启动制冷的时间(单位：min) */
    private Integer hours;

    public D1_c_ByteArrayHeatingInfo() {}

    public D1_c_ByteArrayHeatingInfo(byte[] bytes) {
        stopTemp = ByteUtils.toUint8(bytes[0]);
        hours = ByteUtils.toUint8(bytes[1]);
    }

    public byte[] toBytes() {
        byte[] bytes = new byte[2];
        bytes[0] = ByteUtils.uint8toByte(stopTemp);
        bytes[1] = ByteUtils.uint8toByte(hours);
        return bytes;
    }

    @Override
    public String toString() {
        return String.format("{stopTemp=%s, hours=%s}", stopTemp, hours);
    }

    public Integer getStopTemp() { return stopTemp; }

    public void setStopTemp(Integer stopTemp) { this.stopTemp = stopTemp; }

    public Integer getHours() { return hours; }

    public void setHours(Integer hours) { this.hours = hours; }
}
