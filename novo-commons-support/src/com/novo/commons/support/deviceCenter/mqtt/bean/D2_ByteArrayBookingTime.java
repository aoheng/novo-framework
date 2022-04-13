package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/11/2.
 * 预约时间
 */
public class D2_ByteArrayBookingTime {

    private Integer mins = 0;
    private Integer hours = 0;

    public D2_ByteArrayBookingTime() {}

    public D2_ByteArrayBookingTime(byte[] bytes) {
        mins = ByteUtils.toUint8(bytes[0]);
        hours = ByteUtils.toUint8(bytes[1]);
    }

    @Override
    public String toString() {
        return String.format("{mins=%d, hours=%d}", mins, hours);
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
