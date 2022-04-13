package com.novo.commons.support.deviceCenter.mqtt.bean;


import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 人机事件
 */
public class D1_f_ByteArrayHumanMachineEvent {

    private List<String> events;


    public D1_f_ByteArrayHumanMachineEvent() {
    }

    public D1_f_ByteArrayHumanMachineEvent(byte[] bytes) {

    }


    public List<String> getEvents() {
        return events;
    }

}
