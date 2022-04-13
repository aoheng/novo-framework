package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.framework.core.util.ByteUtils;

import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 人机事件
 */
public class D1_g_ByteArrayHumanMachineEvent {

    private List<String> events;

    /** 制热温度设置（0℃-255°C） */
    private Integer heatingTemp;
    /** 制冷温度设置（0℃-255°C） */
    private Integer coolingTemp;


    public D1_g_ByteArrayHumanMachineEvent() {
    }

    public D1_g_ByteArrayHumanMachineEvent(byte[] bytes) {
        heatingTemp = ByteUtils.toUint8(bytes[0]);
        coolingTemp = ByteUtils.toUint8(bytes[1]);
    }

    @Override
    public String toString() {
        return String.format("{heatingTemp=%s, coolingTemp}", heatingTemp, coolingTemp);
    }

    public List<String> getEvents() {
        return events;
    }



}
