package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D2_ByteArrayHardwareEvent {

    private List<String> events;
    /** 关机（0：未触发，1：触发） */
    private Integer powerOff;
    /** 开机（0：未触发，1：触发） */
    private Integer powerOn;
    /** 预约（0：未触发，1：触发） */
    private Integer booking;
    /** 运行（0：未触发，1：触发） */
    private Integer running;
    /** 故障（0：未触发，1：触发） */
    private Integer fault;
    /** 预留（0：未触发，1：触发） */
    private Integer reserved;
    /** 净水芯到期（0：未触发，1：触发） */
    private Integer core1Expired;
    /** 软水芯到期（0：未触发，1：触发） */
    private Integer core2Expired;
    /** 净洁芯到期（0：未触发，1：触发） */
    private Integer core3Expired;
    /** 亮碟芯到期（0：未触发，1：触发） */
    private Integer core4Expired;
    /** 净水芯到期预警（0：未触发，1：触发） */
    private Integer core1EarlyWarning;
    /** 软水芯到期预警（0：未触发，1：触发） */
    private Integer core2EarlyWarning;
    /** 净洁芯到期预警（0：未触发，1：触发） */
    private Integer core3EarlyWarning;
    /** 亮碟芯到期预警（0：未触发，1：触发） */
    private Integer core4EarlyWarning;

    public D2_ByteArrayHardwareEvent() {

    }

    public D2_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        powerOff = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        powerOn = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        booking = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        running = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        fault = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        reserved = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2Expired = (b & n) != 0 ? 1 : 0;

        b = bytes[bytes.length - 2];
        n = 0x01;
        core3Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core4Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core3EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core4EarlyWarning = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (powerOff != null && powerOff.equals(1))
            events.add("关机");
        if (powerOn != null && powerOn.equals(1))
            events.add("开机");
        if (booking != null && booking.equals(1))
            events.add("预约");
        if (running != null && running.equals(1))
            events.add("运行");
        if (fault != null && fault.equals(1))
            events.add("故障");
        if (reserved != null && reserved.equals(1))
            events.add("预留");
        if (core1Expired != null && core1Expired.equals(1))
            events.add("净水芯到期");
        if (core2Expired != null && core2Expired.equals(1))
            events.add("软水芯到期");
        if (core3Expired != null && core3Expired.equals(1))
            events.add("净洁芯到期");
        if (core4Expired != null && core3Expired.equals(1))
            events.add("亮碟芯到期");
        if (core1EarlyWarning != null && core1EarlyWarning.equals(1))
            events.add("净水芯到期预警");
        if (core2EarlyWarning != null && core2EarlyWarning.equals(1))
            events.add("软水芯到期预警");
        if (core3EarlyWarning != null && core3EarlyWarning.equals(1))
            events.add("净洁芯到期预警");
        if (core4EarlyWarning != null && core3EarlyWarning.equals(1))
            events.add("亮碟芯到期预警");
    }

    @Override
    public String toString() {
        return String.format("D2_ByteArrayHardwareEvent{powerOff=%s, powerOn=%s, booking=%s, running=%s, fault=%s, reserved=%s, core1Expired=%s, core2Expired=%s, core3Expired=%s, core4Expired=%s, core1EarlyWarning=%s, core2EarlyWarning=%s, core3EarlyWarning=%s, core4EarlyWarning=%s}", powerOff, powerOn, booking, running, fault, reserved, core1Expired, core2Expired, core3Expired, core4Expired, core1EarlyWarning, core2EarlyWarning, core3EarlyWarning, core4EarlyWarning);
    }

    public Integer getPowerOff() { return powerOff; }

    public void setPowerOff(Integer powerOff) { this.powerOff = powerOff; }

    public Integer getPowerOn() { return powerOn; }

    public void setPowerOn(Integer powerOn) { this.powerOn = powerOn; }

    public Integer getBooking() { return booking; }

    public void setBooking(Integer booking) { this.booking = booking; }

    public Integer getRunning() { return running; }

    public void setRunning(Integer running) { this.running = running; }

    public Integer getFault() { return fault; }

    public void setFault(Integer fault) { this.fault = fault; }

    public Integer getReserved() { return reserved; }

    public void setReserved(Integer reserved) { this.reserved = reserved; }

    public Integer getCore1Expired() { return core1Expired; }

    public void setCore1Expired(Integer core1Expired) { this.core1Expired = core1Expired; }

    public Integer getCore2Expired() { return core2Expired; }

    public void setCore2Expired(Integer core2Expired) { this.core2Expired = core2Expired; }

    public Integer getCore3Expired() { return core3Expired; }

    public void setCore3Expired(Integer core3Expired) { this.core3Expired = core3Expired; }

    public Integer getCore4Expired() { return core4Expired; }

    public void setCore4Expired(Integer core4Expired) { this.core4Expired = core4Expired; }

    public Integer getCore1EarlyWarning() { return core1EarlyWarning; }

    public void setCore1EarlyWarning(Integer core1EarlyWarning) { this.core1EarlyWarning = core1EarlyWarning; }

    public Integer getCore2EarlyWarning() { return core2EarlyWarning; }

    public void setCore2EarlyWarning(Integer core2EarlyWarning) { this.core2EarlyWarning = core2EarlyWarning; }

    public Integer getCore3EarlyWarning() { return core3EarlyWarning; }

    public void setCore3EarlyWarning(Integer core3EarlyWarning) { this.core3EarlyWarning = core3EarlyWarning; }

    public Integer getCore4EarlyWarning() { return core4EarlyWarning; }

    public void setCore4EarlyWarning(Integer core4EarlyWarning) { this.core4EarlyWarning = core4EarlyWarning; }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }
}
