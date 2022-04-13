package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/11/2.
 * 时分
 */
public class ByteArrayHourMin {

    private Integer mins = 0;
    private Integer hours = 0;

    public ByteArrayHourMin() {}

    public ByteArrayHourMin(byte[] bytes) {
        mins = ByteUtils.toUint8(bytes[0]);
        hours = ByteUtils.toUint8(bytes[1]);
    }

    public byte[] toBytes() {
        byte[] bytes = new byte[2];
        bytes[0] = ByteUtils.uint8toByte(mins);
        bytes[1] = ByteUtils.uint8toByte(hours);
        return bytes;
    }

    @Override
    public String toString() {
        return String.format("%s:%s", hours, mins);
    }

    public Integer getMins() {
        return mins;
    }

    public void setMins(Integer mins) {
        this.mins = mins;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;/**/
    }

    public int getTotalMins() {
        int h = hours == null ? 0 : hours;
        int m = mins == null ? 0 : mins;
        int totalMins = h * 60 + m;
        return totalMins;
    }
}
