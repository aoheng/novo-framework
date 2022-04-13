package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D3_ByteArrayHardwareEvent {

    private List<String> events;
    /** 滤芯A到期（0：未到期，1：到期） */
    private Integer core1Expired;
    /** 空净值到期（0：未到期，1：到期） */
    private Integer expired;

    public D3_ByteArrayHardwareEvent() {

    }

    public D3_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        core1Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        expired = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (core1Expired != null && core1Expired.equals(1))
            events.add("滤芯A到期");
        if (expired != null && expired.equals(1))
            events.add("空净值到期");
    }

    public Integer getCore1Expired() { return core1Expired; }

    public void setCore1Expired(Integer core1Expired) { this.core1Expired = core1Expired; }

    public Integer getExpired() { return expired; }

    public void setExpired(Integer expired) { this.expired = expired; }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }
}
