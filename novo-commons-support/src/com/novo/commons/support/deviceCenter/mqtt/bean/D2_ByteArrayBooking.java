package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.framework.core.util.ByteUtils;

import java.io.ByteArrayOutputStream;

/**
 * @author Aoheng on 2020/11/2.
 * 预约
 */
public class D2_ByteArrayBooking {

    private Boolean booking = false;
    private ByteArrayHourMin time = new ByteArrayHourMin();
    private Integer workMode = 0;

    @Override
    public String toString() {
        return String.format("{booking=%s, time=%s, workMode=%s}", booking, time, workMode);
    }

    public byte[] toBytes() {
        if (time.getTotalMins() == 0)
            booking = false;

        if (!booking) {
            time.setHours(0);
            time.setMins(0);
            workMode = 0;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(booking ? 0x01 : 0x00);
        baos.write(ByteUtils.uint8toByte(time.getMins()));
        baos.write(ByteUtils.uint8toByte(time.getHours()));
        baos.write(workMode);

        return baos.toByteArray();
    }

    public Boolean getBooking() { return booking; }

    public void setBooking(Boolean booking) { this.booking = booking; }

    public ByteArrayHourMin getTime() { return time; }

    public void setTime(ByteArrayHourMin time) { this.time = time; }

    public Integer getWorkMode() { return workMode; }

    public void setWorkMode(Integer workMode) { this.workMode = workMode; }
}
