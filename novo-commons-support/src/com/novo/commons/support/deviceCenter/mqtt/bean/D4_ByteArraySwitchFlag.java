package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（NOVO-BOT）
 */
public class D4_ByteArraySwitchFlag {

    private List<String> events;

    /** 开始运行状态 */
    private Integer startWorkStatus;
    /** 停止运行状态 */
    private Integer stopWorkStatus;

    public D4_ByteArraySwitchFlag() {}

    public D4_ByteArraySwitchFlag(byte[] bytes) {
        events = new ArrayList();
        byte b = bytes[bytes.length-1];
        int n = 0x01;
        startWorkStatus = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        stopWorkStatus = (b & n) != 0 ? 1 : 0;
        if (startWorkStatus!= null && startWorkStatus.equals(1))
            events.add("开始运行");
        if (stopWorkStatus!= null && stopWorkStatus.equals(1))
            events.add("停止运行");


    }

    @Override
    public String toString() {
        return String.format("{events=%s}", events);
    }

    public List<String> getEvents() {
        return events;
    }
}
