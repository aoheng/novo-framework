package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_ByteArrayHardwareEvent {

    private List<String> events;

    /** 低液位触发（0：高于低水位，1：低水位） */
    private Integer lowWater;
    /** 制满水触发（0：未制满水，1：制满水） */
    private Integer fullWater;
    /** 滤芯A到期（0：未到期，1：到期） */
    private Integer core1Expired;
    /** 滤芯B到期（0：未到期，1：到期） */
    private Integer core2Expired;
    /** 滤芯C到期（0：未到期，1：到期） */
    private Integer core3Expired;
    /** 滤芯A到期预警（0：无预警，1：预警） */
    private Integer core1EarlyWarning;
    /** 滤芯B到期预警（0：无预警，1：预警） */
    private Integer core2EarlyWarning;
    /** 滤芯C到期预警（0：无预警，1：预警） */
    private Integer core3EarlyWarning;
    /** 超低流量（0：正常，1：低流量） */
    private Integer lowFlow;
    /** 超低流量（0：正常，1：超过5天未用水） */
    private Integer unusedLongTime;
    /** 制水（0：停止制水，1：开始制水） */
    private Integer produceWater;
    /** 水值到期（0：未到期，1：到期） */
    private Integer expired;
    /** 水杯低液位触发（0：高于低水位，1：低水位） */
    private Integer cupLowWater;
    /** 水杯高液位触发（0：低于高水位，1：高水位） */
    private Integer cupFullWater;

    public D1_ByteArrayHardwareEvent() {

    }

    public D1_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        lowWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        fullWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core3Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2EarlyWarning = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core3EarlyWarning = (b & n) != 0 ? 1 : 0;

        b = bytes[bytes.length - 2];
        n = 0x01;
        lowFlow = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        unusedLongTime = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        produceWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cupLowWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cupFullWater = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (lowWater != null && lowWater.equals(1))
            events.add("低水位");
        if (fullWater != null && fullWater.equals(1))
            events.add("制满水");
        if (core1Expired != null && core1Expired.equals(1))
            events.add("滤芯A到期");
        if (core2Expired != null && core2Expired.equals(1))
            events.add("滤芯B到期");
        if (core3Expired != null && core3Expired.equals(1))
            events.add("滤芯C到期");
        if (core1EarlyWarning != null && core1EarlyWarning.equals(1))
            events.add("滤芯A到期预警");
        if (core2EarlyWarning != null && core2EarlyWarning.equals(1))
            events.add("滤芯B到期预警");
        if (core3EarlyWarning != null && core3EarlyWarning.equals(1))
            events.add("滤芯C到期预警");
        if (lowFlow != null && lowFlow.equals(1))
            events.add("低流量");
        if (unusedLongTime != null && unusedLongTime.equals(1))
            events.add("超过5天未用水");
        if (produceWater != null && produceWater.equals(1))
            events.add("开始制水");
        if (expired != null && expired.equals(1))
            events.add("水值到期");
        if (cupLowWater != null && cupLowWater.equals(1))
            events.add("原水杯低液位");
        if (cupFullWater != null && cupFullWater.equals(1))
            events.add("原水杯高液位");
    }

    @Override
    public String toString() {
        return String.format("{lowWater=%s, fullWater=%s, core1Expired=%s, core2Expired=%s, core3Expired=%s, core1EarlyWarning=%s, core2EarlyWarning=%s, core3EarlyWarning=%s, lowFlow=%s, unusedLongTime=%s,produceWater=%s, expired=%s, cupLowWater=%s, cupFullWater=%s", lowWater, fullWater, core1Expired, core2Expired, core3Expired, core1EarlyWarning, core2EarlyWarning, core3EarlyWarning, lowFlow, unusedLongTime, produceWater, expired, cupLowWater, cupFullWater);
    }

    public Integer getExpired() { return expired; }

    public void setExpired(Integer expired) { this.expired = expired; }

    public Integer getProduceWater() { return produceWater; }

    public void setProduceWater(Integer produceWater) { this.produceWater = produceWater; }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }

    public Integer getLowWater() { return lowWater; }

    public void setLowWater(Integer lowWater) { this.lowWater = lowWater; }

    public Integer getUnusedLongTime() { return unusedLongTime; }

    public void setUnusedLongTime(Integer unusedLongTime) { this.unusedLongTime = unusedLongTime; }

    public Integer getFullWater() { return fullWater; }

    public void setFullWater(Integer fullWater) { this.fullWater = fullWater; }

    public Integer getCore1Expired() { return core1Expired; }

    public void setCore1Expired(Integer core1Expired) { this.core1Expired = core1Expired; }

    public Integer getCore2Expired() { return core2Expired; }

    public void setCore2Expired(Integer core2Expired) { this.core2Expired = core2Expired; }

    public Integer getCore3Expired() { return core3Expired; }

    public void setCore3Expired(Integer core3Expired) { this.core3Expired = core3Expired; }

    public Integer getCore1EarlyWarning() { return core1EarlyWarning; }

    public void setCore1EarlyWarning(Integer core1EarlyWarning) { this.core1EarlyWarning = core1EarlyWarning; }

    public Integer getCore2EarlyWarning() { return core2EarlyWarning; }

    public void setCore2EarlyWarning(Integer core2EarlyWarning) { this.core2EarlyWarning = core2EarlyWarning; }

    public Integer getCore3EarlyWarning() { return core3EarlyWarning; }

    public void setCore3EarlyWarning(Integer core3EarlyWarning) { this.core3EarlyWarning = core3EarlyWarning; }

    public Integer getLowFlow() { return lowFlow; }

    public void setLowFlow(Integer lowFlow) { this.lowFlow = lowFlow; }

    public Integer getCupLowWater() { return cupLowWater; }

    public void setCupLowWater(Integer cupLowWater) { this.cupLowWater = cupLowWater; }

    public Integer getCupFullWater() { return cupFullWater; }

    public void setCupFullWater(Integer cupFullWater) { this.cupFullWater = cupFullWater; }
}
