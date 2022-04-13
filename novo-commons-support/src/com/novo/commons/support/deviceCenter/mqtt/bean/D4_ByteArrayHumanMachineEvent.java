package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 人机事件（NOVO-BOT）
 */
public class D4_ByteArrayHumanMachineEvent {

    private List<String> events;

    public D4_ByteArrayHumanMachineEvent() {
    }

    public D4_ByteArrayHumanMachineEvent(byte[] bytes) {
        long b = ByteUtils.toUint32(bytes, ByteOrder.BIG_ENDIAN);
        int n = 0x01;
        events = new ArrayList<>();
        if ((b & n) != 0)
            events.add("投币成功（投币数等于套餐设置值）");
        n = n << 1;
        if ((b & n) != 0)
            events.add("投币失败（投币数小于套餐设置值）");
    }

    @Override
    public String toString() {
        return String.format("{events=%s}", events);
    }

    public List<String> getEvents() {
        return events;
    }
}
