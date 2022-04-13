package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/11/2.
 * 开始、结束时分对
 */
public class ByteArrayPlanTime {

    private Integer enable = 0;
    private ByteArrayHourMin startTime = new ByteArrayHourMin();
    private ByteArrayHourMin endTime = new ByteArrayHourMin();

    public ByteArrayPlanTime() {}

    public ByteArrayPlanTime(byte[] bytes) {
        enable = ByteUtils.toInt8(bytes[0]);
        startTime.setMins(ByteUtils.toUint8(bytes[1]));
        startTime.setHours(ByteUtils.toUint8(bytes[2]));
        endTime.setMins(ByteUtils.toUint8(bytes[3]));
        endTime.setHours(ByteUtils.toUint8(bytes[4]));
    }

    @Override
    public String toString() {
        return String.format("{enable=%s, startTime=%s, endTime=%s}", enable, startTime, endTime);
    }

    public byte[] toBytes() {
        byte[] bytes = new byte[5];
        bytes[0] = ByteUtils.uint8toByte(enable);
        bytes[1] = ByteUtils.uint8toByte(startTime.getMins());
        bytes[2] = ByteUtils.uint8toByte(startTime.getHours());
        bytes[3] = ByteUtils.uint8toByte(endTime.getMins());
        bytes[4] = ByteUtils.uint8toByte(endTime.getHours());
        return bytes;
    }

    public Integer getEnable() { return enable; }

    public void setEnable(Integer enable) { this.enable = enable; }

    public ByteArrayHourMin getStartTime() { return startTime; }

    public void setStartTime(ByteArrayHourMin startTime) { this.startTime = startTime; }

    public ByteArrayHourMin getEndTime() { return endTime; }

    public void setEndTime(ByteArrayHourMin endTime) { this.endTime = endTime; }
}
