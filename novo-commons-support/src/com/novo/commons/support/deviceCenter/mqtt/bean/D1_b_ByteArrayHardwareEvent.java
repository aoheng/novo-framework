package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_b_ByteArrayHardwareEvent {

    private List<String> events;
    /** 水值到期（0：未到期，1：到期） */
    private Integer expired;
    /** 臭氧（0：关，1：开） */
    private Integer ozone;
    /** 加热（0：关，1：开） */
    private Integer heating;
    /** 滤芯A到期（0：未到期，1：到期） */
    private Integer core1Expired;
    /** 滤芯B到期（0：未到期，1：到期） */
    private Integer core2Expired;
    /** 滤芯C到期（0：未到期，1：到期） */
    private Integer core3Expired;
    /** 滤芯D到期（0：未到期，1：到期） */
    private Integer core4Expired;
    /** 滤芯E到期（0：未到期，1：到期） */
    private Integer core5Expired;
    /** 制水（0：停止制水，1：开始制水） */
    private Integer produceWater;
    /** 液位触发（0：低水位，2：中水位，3：高水位） */
    private Integer liquidLevel;
    /** 滤芯A到期预警（0：无预警，1：预警） */
    private Integer core1EarlyWarning;
    /** 滤芯B到期预警（0：无预警，1：预警） */
    private Integer core2EarlyWarning;
    /** 滤芯C到期预警（0：无预警，1：预警） */
    private Integer core3EarlyWarning;
    /** 滤芯D到期预警（0：无预警，1：预警） */
    private Integer core4EarlyWarning;
    /** 滤芯E到期预警（0：无预警，1：预警） */
    private Integer core5EarlyWarning;

    public D1_b_ByteArrayHardwareEvent() {

    }

    public D1_b_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        ozone = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        heating = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core3Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core4Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core5Expired = (b & n) != 0 ? 1 : 0;

        b = bytes[bytes.length - 2];
        n = 0x01;
        produceWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;

        if ((b & 0b0000110) == 0b0000110) {
            liquidLevel = 3;
        } else if ((b & 0b0000100) == 0b0000100) {
            liquidLevel = 2;
        } else if ((b & 0b0000010) == 0b0000010) {
            //排除01
        } else {
            liquidLevel = 0;
        }

        n = n << 2;
        core1EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core3EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core4EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core5EarlyWarning = (b & n) != 0 ? 1 : 0;


        events = new ArrayList<>();
        if (expired != null && expired.equals(1))
            events.add("水值到期");
        if (ozone != null && ozone.equals(1))
            events.add("臭氧开");
        if (heating != null && heating.equals(1))
            events.add("加热开");
        if (core1Expired != null && core1Expired.equals(1))
            events.add("滤芯A到期");
        if (core2Expired != null && core2Expired.equals(1))
            events.add("滤芯B到期");
        if (core3Expired != null && core3Expired.equals(1))
            events.add("滤芯C到期");
        if (core4Expired != null && core4Expired.equals(1))
            events.add("滤芯D到期");
        if (core5Expired != null && core5Expired.equals(1))
            events.add("滤芯E到期");
        if (produceWater != null && produceWater.equals(1))
            events.add("开始制水");
        if (liquidLevel != null) {
            if (liquidLevel.equals(3)) {
                events.add("高水位");
            } else if (liquidLevel.equals(2)) {
                events.add("中水位");
            } else {
                events.add("低水位");
            }
        }
        if (core1EarlyWarning != null && core1EarlyWarning.equals(1))
            events.add("滤芯A到期预警");
        if (core2EarlyWarning != null && core2EarlyWarning.equals(1))
            events.add("滤芯B到期预警");
        if (core3EarlyWarning != null && core3EarlyWarning.equals(1))
            events.add("滤芯C到期预警");
        if (core4EarlyWarning != null && core4EarlyWarning.equals(1))
            events.add("滤芯D到期预警");
        if (core5EarlyWarning != null && core5EarlyWarning.equals(1))
            events.add("滤芯E到期预警");
    }

    @Override
    public String toString() {
        return String.format("{expired=%s, ozone=%s, heating=%s, core1Expired=%s, core2Expired=%s, core3Expired=%s, core4Expired=%s, core5Expired=%s, produceWater=%s, liquidLevel=%s, core1EarlyWarning=%s, core2EarlyWarning=%s, core3EarlyWarning=%s, core4EarlyWarning=%s, core5EarlyWarning=%s}", expired, ozone, heating, core1Expired, core2Expired, core3Expired, core4Expired, core5Expired, produceWater, liquidLevel, core1EarlyWarning, core2EarlyWarning, core3EarlyWarning, core4EarlyWarning, core5EarlyWarning);
    }

    public Integer getExpired() { return expired; }

    public void setExpired(Integer expired) { this.expired = expired; }

    public Integer getOzone() { return ozone; }

    public void setOzone(Integer ozone) { this.ozone = ozone; }

    public Integer getHeating() { return heating; }

    public void setHeating(Integer heating) { this.heating = heating; }

    public Integer getCore1Expired() { return core1Expired; }

    public void setCore1Expired(Integer core1Expired) { this.core1Expired = core1Expired; }

    public Integer getCore2Expired() { return core2Expired; }

    public void setCore2Expired(Integer core2Expired) { this.core2Expired = core2Expired; }

    public Integer getCore3Expired() { return core3Expired; }

    public void setCore3Expired(Integer core3Expired) { this.core3Expired = core3Expired; }

    public Integer getCore4Expired() { return core4Expired; }

    public void setCore4Expired(Integer core4Expired) { this.core4Expired = core4Expired; }

    public Integer getCore5Expired() { return core5Expired; }

    public void setCore5Expired(Integer core5Expired) { this.core5Expired = core5Expired; }

    public Integer getProduceWater() { return produceWater; }

    public void setProduceWater(Integer produceWater) { this.produceWater = produceWater; }

    public Integer getLiquidLevel() { return liquidLevel; }

    public void setLiquidLevel(Integer liquidLevel) { this.liquidLevel = liquidLevel; }

    public Integer getCore1EarlyWarning() { return core1EarlyWarning; }

    public void setCore1EarlyWarning(Integer core1EarlyWarning) { this.core1EarlyWarning = core1EarlyWarning; }

    public Integer getCore2EarlyWarning() { return core2EarlyWarning; }

    public void setCore2EarlyWarning(Integer core2EarlyWarning) { this.core2EarlyWarning = core2EarlyWarning; }

    public Integer getCore3EarlyWarning() { return core3EarlyWarning; }

    public void setCore3EarlyWarning(Integer core3EarlyWarning) { this.core3EarlyWarning = core3EarlyWarning; }

    public Integer getCore4EarlyWarning() { return core4EarlyWarning; }

    public void setCore4EarlyWarning(Integer core4EarlyWarning) { this.core4EarlyWarning = core4EarlyWarning; }

    public Integer getCore5EarlyWarning() { return core5EarlyWarning; }

    public void setCore5EarlyWarning(Integer core5EarlyWarning) { this.core5EarlyWarning = core5EarlyWarning; }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }
}
