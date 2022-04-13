package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（净水器）
 */
public class D3_ByteArraySwitchFlag {

    private List<String> events;
    /** 电源开关（0：关，1：开） */
    private Integer power;

    public D3_ByteArraySwitchFlag() {}

    public D3_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        power = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (power != null && power.equals(1))
            events.add("电源开");
    }

    @Override
    public String toString() {
        return String.format("{power=%s}", power);
    }

    public Integer getPower() { return power; }

    public void setPower(Integer power) { this.power = power; }

    public List<String> getEvents() {
        return events;
    }
}
