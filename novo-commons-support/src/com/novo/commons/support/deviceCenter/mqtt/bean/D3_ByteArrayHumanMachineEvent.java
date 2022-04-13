package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 人机事件
 */
public class D3_ByteArrayHumanMachineEvent {

    private List<String> events;


    public D3_ByteArrayHumanMachineEvent() {
    }

    public D3_ByteArrayHumanMachineEvent(byte[] bytes) {
        events = new ArrayList<>();
    }

    public List<String> getEvents() {
        return events;
    }
}
