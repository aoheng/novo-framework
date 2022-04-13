package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_c_ByteArrayHardwareEvent {

    private List<String> events;
    /** 开机（0：未触发，1：触发） */
    private Integer powerOn;
    /** 关机（0：未触发，1：触发） */
    private Integer powerOff;

    public D1_c_ByteArrayHardwareEvent() {

    }

    public D1_c_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        powerOn = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        powerOff = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (powerOn != null && powerOn.equals(1))
            events.add("开机");
        if (powerOff != null && powerOff.equals(1))
            events.add("关机");
    }

    @Override
    public String toString() {
        return String.format("{powerOn=%s, powerOff=%s}", powerOn, powerOff);
    }

    public Integer getPowerOn() { return powerOn; }

    public void setPowerOn(Integer powerOn) { this.powerOn = powerOn; }

    public Integer getPowerOff() { return powerOff; }

    public void setPowerOff(Integer powerOff) { this.powerOff = powerOff; }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }
}
