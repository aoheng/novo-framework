package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_d_ByteArrayHardwareEvent {

    private List<String> events;

    public D1_d_ByteArrayHardwareEvent() {

    }

    public D1_d_ByteArrayHardwareEvent(byte[] bytes) {
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }
}
