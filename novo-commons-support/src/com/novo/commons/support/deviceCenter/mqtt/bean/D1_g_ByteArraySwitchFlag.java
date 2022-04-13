package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（浩泽二代机）
 */
public class D1_g_ByteArraySwitchFlag {

    private List<String> events;
    /** 出水开关（0：关，1：开） */
    private Integer flowWaterSwitch;
    /** 电源开关（0：关，1：开） */
    private Integer powerSwitch;
    /** 加热开关（0：关，1：开） */
    private Integer heatingSwitch;
    /** 制冷开关（0：关，1：开） */
    private Integer coolingSwitch;
    /** 制水状态（0：停止制水，1：正在制水） */
    private Integer productWaterSwitch;
    /** 是否到期（0：未到期，1：到期） */
    private Integer expireStatus;

    public D1_g_ByteArraySwitchFlag() {
    }

    public D1_g_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        flowWaterSwitch = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        powerSwitch = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        heatingSwitch = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coolingSwitch = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        productWaterSwitch = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        expireStatus = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (flowWaterSwitch != null && flowWaterSwitch.equals(1))
            events.add("出水开");
        if (powerSwitch != null && powerSwitch.equals(1))
            events.add("电源开");
        if (heatingSwitch != null && heatingSwitch.equals(1))
            events.add("加热开");
        if (coolingSwitch != null && coolingSwitch.equals(1))
            events.add("制冷开");
        if (productWaterSwitch != null && expireStatus.equals(1))
            events.add("开始制水");
        if (expireStatus != null && expireStatus.equals(1))
            events.add("已到期");
    }

    @Override
    public String toString() {
        return String.format("{flowWaterSwitch=%s, powerSwitch=%s, " +
                        "heatingSwitch=%s, coolingSwitch=%s, productWaterSwitch=%s, expireStatus=%s}",
                flowWaterSwitch, powerSwitch, heatingSwitch, coolingSwitch, productWaterSwitch, expireStatus);
    }

    public List<String> getEvents() {
        return events;
    }

}
