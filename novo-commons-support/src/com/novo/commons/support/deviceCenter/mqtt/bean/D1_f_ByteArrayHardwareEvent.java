package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_f_ByteArrayHardwareEvent {

    private List<String> events;
    /** 低液位触发（0：未触发，1：触发） */
    private Integer lowLiquid;
    /** 高液位触发（0：未触发，1：触发） */
    private Integer highLiquid;

    public D1_f_ByteArrayHardwareEvent() {

    }

    public D1_f_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        lowLiquid = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        highLiquid = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (lowLiquid != null && lowLiquid.equals(1))
            events.add("低液位触发");
        if (highLiquid != null && highLiquid.equals(1))
            events.add("高液位触发");
    }

    @Override
    public String toString() {
        return String.format("{lowLiquid=%s, highLiquid=%s}", lowLiquid, highLiquid);
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }

    public Integer getLowLiquid() {
        return lowLiquid;
    }

    public void setLowLiquid(Integer lowLiquid) {
        this.lowLiquid = lowLiquid;
    }

    public Integer getHighLiquid() {
        return highLiquid;
    }

    public void setHighLiquid(Integer highLiquid) {
        this.highLiquid = highLiquid;
    }
}
