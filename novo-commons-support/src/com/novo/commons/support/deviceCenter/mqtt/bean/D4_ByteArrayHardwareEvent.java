package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 硬件事件（NOVO-BOT）
 */
public class D4_ByteArrayHardwareEvent {

    private List<String> events;

    public D4_ByteArrayHardwareEvent() {

    }

    public D4_ByteArrayHardwareEvent(byte[] bytes) {
        long b = ByteUtils.toUint32(bytes, ByteOrder.BIG_ENDIAN);
        int n = 0x01;
        events = new ArrayList<>();
        if ((b & n) != 0)
            events.add("到期停止工作");
    }

    @Override
    public String toString() {
        return String.format("{events=%s}", events);
    }

    public List<String> getEvents() {
        return events;
    }
}
