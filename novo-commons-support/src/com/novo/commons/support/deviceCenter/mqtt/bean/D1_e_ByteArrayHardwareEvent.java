package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_e_ByteArrayHardwareEvent {

    private List<String> events;
    /** 水杯满水（0：未满，1：满水） */
    private Integer cupFullWater;
    /** 压力罐满水（0：未满，1：满水） */
    private Integer tankFullWater;
    /** 滤芯A到期（0：未到期，1：到期） */
    private Integer core1Expired;
    /** 滤芯B到期（0：未到期，1：到期） */
    private Integer core2Expired;
    /** 滤芯A到期预警（0：无预警，1：预警） */
    private Integer core1EarlyWarning;
    /** 滤芯B到期预警（0：无预警，1：预警） */
    private Integer core2EarlyWarning;

    public D1_e_ByteArrayHardwareEvent() {

    }

    public D1_e_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        cupFullWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        tankFullWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2EarlyWarning = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (cupFullWater != null && cupFullWater.equals(1))
            events.add("水杯制满水");
        if (tankFullWater != null && tankFullWater.equals(1))
            events.add("压力罐制满水");
        if (core1Expired != null && core1Expired.equals(1))
            events.add("滤芯A到期");
        if (core2Expired != null && core2Expired.equals(1))
            events.add("滤芯B到期");
        if (core1EarlyWarning != null && core1EarlyWarning.equals(1))
            events.add("滤芯A到期预警");
        if (core2EarlyWarning != null && core2EarlyWarning.equals(1))
            events.add("滤芯B到期预警");
    }

    public Integer getCupFullWater() { return cupFullWater; }

    public void setCupFullWater(Integer cupFullWater) { this.cupFullWater = cupFullWater; }

    public Integer getTankFullWater() { return tankFullWater; }

    public void setTankFullWater(Integer tankFullWater) { this.tankFullWater = tankFullWater; }

    public Integer getCore1Expired() { return core1Expired; }

    public void setCore1Expired(Integer core1Expired) { this.core1Expired = core1Expired; }

    public Integer getCore2Expired() { return core2Expired; }

    public void setCore2Expired(Integer core2Expired) { this.core2Expired = core2Expired; }

    public Integer getCore1EarlyWarning() { return core1EarlyWarning; }

    public void setCore1EarlyWarning(Integer core1EarlyWarning) { this.core1EarlyWarning = core1EarlyWarning; }

    public Integer getCore2EarlyWarning() { return core2EarlyWarning; }

    public void setCore2EarlyWarning(Integer core2EarlyWarning) { this.core2EarlyWarning = core2EarlyWarning; }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }
}
