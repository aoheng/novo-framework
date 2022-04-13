package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.commons.support.deviceCenter.vo.WashPlanTimeVO;
import com.novo.framework.core.util.ByteUtils;

/**
 * @author MickeyChen
 * @date 2020/3/4
 */
public class ByteArrayStatusWeekHourMin {

    private Integer status = 0;
    private Integer week = 0;
    private Integer hour = 0;
    private Integer min = 0;

    public ByteArrayStatusWeekHourMin() {}

    public ByteArrayStatusWeekHourMin(byte[] bytes) {
        status = ByteUtils.toUint8(bytes[0]);
        week = ByteUtils.toUint8(bytes[1]);
        hour = ByteUtils.toUint8(bytes[2]);
        min = ByteUtils.toUint8(bytes[3]);
    }

    public byte[] toBytes() {
        byte[] bytes = new byte[4];
        bytes[0] = ByteUtils.uint8toByte(status);
        bytes[1] = ByteUtils.uint8toByte(week);
        bytes[2] = ByteUtils.uint8toByte(hour);
        bytes[3] = ByteUtils.uint8toByte(min);
        return bytes;
    }

    public ByteArrayStatusWeekHourMin(WashPlanTimeVO value) {
        status = value.getWashPlanTimeSwitch();
        week = value.getWashPlanTimeWeek();
        hour = Integer.parseInt(value.getWashPlanTime().split(":")[0]);
        min = Integer.parseInt(value.getWashPlanTime().split(":")[1]);
    }

    @Override
    public String toString() {
        return String.format("status=%s，week=%s，%s:%s", status, week, hour, min);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }
}
