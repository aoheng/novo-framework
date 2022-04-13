package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件
 */
public class D1_g_ByteArrayHardwareEvent {

    private List<String> events;
    /** 低液位触发（0：未触发，1：触发） */
    private Integer lowLiquid;
    /** 高液位触发（0：未触发，1：触发） */
    private Integer highLiquid;
    /** 滤芯A到期 */
    private Integer core1Expired;
    /** 滤芯B到期 */
    private Integer core2Expired;
    /** 滤芯C到期 */
    private Integer core3Expired;
    /** 滤芯D到期 */
    private Integer core4Expired;
    /** 滤芯A预警 */
    private Integer core1EarlyWarning;
    /** 滤芯B预警 */
    private Integer core2EarlyWarning;
    /** 滤芯C预警 */
    private Integer core3EarlyWarning;
    /** 滤芯D预警 */
    private Integer core4EarlyWarning;
    /** 超低流量触发 */
    private Integer lowFlow;
    /** 制水状态 */
    private Integer productWaterStatus;
    /** 是否到期 */
    private Integer expireStatus;
    /** 原水杯低液位 */
    private Integer cupLowLiquid;
    /** 原水杯高液位 */
    private Integer cupHighLiquid;
    /** 压力开关 */
    private Integer pressurePotSwitch;

    public D1_g_ByteArrayHardwareEvent() {

    }

    public D1_g_ByteArrayHardwareEvent(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        lowLiquid = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        highLiquid = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core1Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        core2Expired = (b & n) != 0 ? 1 : 0;
        n = n << 1;
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
        n = n << 1;
        lowFlow = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        productWaterStatus = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        expireStatus = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cupLowLiquid = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cupHighLiquid = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        pressurePotSwitch = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (lowLiquid != null && lowLiquid.equals(1))
            events.add("低液位触发");
        if (highLiquid != null && highLiquid.equals(1))
            events.add("高液位触发");
        if (core1Expired != null && core1Expired.equals(1))
            events.add("滤芯A到期");
        if (core2Expired != null && core2Expired.equals(1))
            events.add("滤芯B到期");
        if (core3Expired != null && core3Expired.equals(1))
            events.add("滤芯C到期");
        if (core4Expired != null && core4Expired.equals(1))
            events.add("滤芯D到期");
        if (core1EarlyWarning != null && core1EarlyWarning.equals(1))
            events.add("滤芯A预警");
        if (core2EarlyWarning != null && core2EarlyWarning.equals(1))
            events.add("滤芯B预警");
        if (core3EarlyWarning != null && core3EarlyWarning.equals(1))
            events.add("滤芯C预警");
        if (core4EarlyWarning != null && core4EarlyWarning.equals(1))
            events.add("滤芯D预警");
        if (lowFlow != null && lowFlow.equals(1))
            events.add("超低流量触发");
        if (productWaterStatus != null && productWaterStatus.equals(1))
            events.add("停止制水");
        if (expireStatus != null && expireStatus.equals(1))
            events.add("水值到期");
        if (cupLowLiquid != null && cupLowLiquid.equals(1))
            events.add("原水杯液位低");
        if (cupHighLiquid != null && cupHighLiquid.equals(1))
            events.add("原水杯液位高");
        if (pressurePotSwitch != null && pressurePotSwitch.equals(1))
            events.add("压力罐满");


    }

    @Override
    public String toString() {
        return String.format("{lowLiquid=%s, highLiquid=%s, core1Expired=%s, core2Expired=%s, core3Expired=%s, core4Expired=%s" +
                        ", core1EarlyWarning=%s, core2EarlyWarning=%s, core3EarlyWarning=%s, core4EarlyWarning=%s, lowFlow=%s, productWaterStatus=%s" +
                        ", expireStatus=%s, cupLowLiquid=%s, cupHighLiquid=%s, pressurePotSwitch=%s}",
                lowLiquid, highLiquid, core1Expired, core2Expired, core3Expired, core4Expired, core1EarlyWarning, core2EarlyWarning
                , core3EarlyWarning, core4EarlyWarning, lowFlow, productWaterStatus, expireStatus, cupLowLiquid, cupHighLiquid, pressurePotSwitch);
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

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

    public Integer getCore1Expired() {
        return core1Expired;
    }

    public void setCore1Expired(Integer core1Expired) {
        this.core1Expired = core1Expired;
    }

    public Integer getCore2Expired() {
        return core2Expired;
    }

    public void setCore2Expired(Integer core2Expired) {
        this.core2Expired = core2Expired;
    }

    public Integer getCore3Expired() {
        return core3Expired;
    }

    public void setCore3Expired(Integer core3Expired) {
        this.core3Expired = core3Expired;
    }

    public Integer getCore4Expired() {
        return core4Expired;
    }

    public void setCore4Expired(Integer core4Expired) {
        this.core4Expired = core4Expired;
    }

    public Integer getCore1EarlyWarning() {
        return core1EarlyWarning;
    }

    public void setCore1EarlyWarning(Integer core1EarlyWarning) {
        this.core1EarlyWarning = core1EarlyWarning;
    }

    public Integer getCore2EarlyWarning() {
        return core2EarlyWarning;
    }

    public void setCore2EarlyWarning(Integer core2EarlyWarning) {
        this.core2EarlyWarning = core2EarlyWarning;
    }

    public Integer getCore3EarlyWarning() {
        return core3EarlyWarning;
    }

    public void setCore3EarlyWarning(Integer core3EarlyWarning) {
        this.core3EarlyWarning = core3EarlyWarning;
    }

    public Integer getCore4EarlyWarning() {
        return core4EarlyWarning;
    }

    public void setCore4EarlyWarning(Integer core4EarlyWarning) {
        this.core4EarlyWarning = core4EarlyWarning;
    }

    public Integer getLowFlow() {
        return lowFlow;
    }

    public void setLowFlow(Integer lowFlow) {
        this.lowFlow = lowFlow;
    }

    public Integer getProductWaterStatus() {
        return productWaterStatus;
    }

    public void setProductWaterStatus(Integer productWaterStatus) {
        this.productWaterStatus = productWaterStatus;
    }

    public Integer getExpireStatus() {
        return expireStatus;
    }

    public void setExpireStatus(Integer expireStatus) {
        this.expireStatus = expireStatus;
    }

    public Integer getCupLowLiquid() {
        return cupLowLiquid;
    }

    public void setCupLowLiquid(Integer cupLowLiquid) {
        this.cupLowLiquid = cupLowLiquid;
    }

    public Integer getCupHighLiquid() {
        return cupHighLiquid;
    }

    public void setCupHighLiquid(Integer cupHighLiquid) {
        this.cupHighLiquid = cupHighLiquid;
    }

    public Integer getPressurePotSwitch() {
        return pressurePotSwitch;
    }

    public void setPressurePotSwitch(Integer pressurePotSwitch) {
        this.pressurePotSwitch = pressurePotSwitch;
    }
}
