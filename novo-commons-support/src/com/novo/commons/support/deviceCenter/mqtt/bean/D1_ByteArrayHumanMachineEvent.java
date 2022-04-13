package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.framework.core.util.ByteUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 人机事件
 */
public class D1_ByteArrayHumanMachineEvent {

    private List<String> events;

    /** 加热温度（0℃-255°C） */
    private Integer heatingTempSet;
    /** 制冷温度（0℃-255°C） */
    private Integer coolingTempSet;

    public D1_ByteArrayHumanMachineEvent() {
    }

    public D1_ByteArrayHumanMachineEvent(byte[] bytes) {
        heatingTempSet = ByteUtils.toUint8(bytes[0]);
        coolingTempSet = ByteUtils.toUint8(bytes[1]);

        events = new ArrayList<>();
        if (heatingTempSet != null)
            events.add(String.format("加热温度[%s]", heatingTempSet));
        if (coolingTempSet != null)
            events.add(String.format("制冷温度[%s]", coolingTempSet));
    }

    @Override
    public String toString() {
        return String.format("{heatingTempSet=%s, coolingTempSet=%s}", heatingTempSet, coolingTempSet);
    }

    public List<String> getEvents() {
        return events;
    }

    public Integer getHeatingTempSet() { return heatingTempSet; }

    public void setHeatingTempSet(Integer heatingTempSet) { this.heatingTempSet = heatingTempSet; }

    public Integer getCoolingTempSet() { return coolingTempSet; }

    public void setCoolingTempSet(Integer coolingTempSet) { this.coolingTempSet = coolingTempSet; }
}
