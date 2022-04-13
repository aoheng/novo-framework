package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（浩泽二代机）
 */
public class D1_f_ByteArraySwitchFlag {

    private List<String> events;
    /** 电源状态（开） */
    private Integer powerSwitchOpen;
    /** 电源状态（关） */
    private Integer powerSwitchClose;
    /** 制冷状态（开） */
    private Integer coolingSwitchOpen;
    /** 制冷状态（关） */
    private Integer coolingSwitchClose;
    /** 杀菌状态（开） */
    private Integer sterilizationSwitchOpen;
    /** 杀菌状态（关） */
    private Integer sterilizationSwitchClose;
    /** 制水状态（开） */
    private Integer produceWaterSwitchOpen;
    /** 制水状态（关） */
    private Integer produceWaterSwitchClose;
    /** 热水出水开关（开） */
    private Integer hotWaterSwitchOpen;
    /** 热水出水开关（关） */
    private Integer hotWaterSwitchClose;
    /** 其他水开关（开） */
    private Integer otherWaterSwitchOpen;
    /** 其他水开关（关） */
    private Integer otherWaterSwitchClose;

    public D1_f_ByteArraySwitchFlag() {
    }

    public D1_f_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        powerSwitchOpen = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        powerSwitchClose = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coolingSwitchOpen = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coolingSwitchClose = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        sterilizationSwitchOpen = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        sterilizationSwitchClose = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        produceWaterSwitchOpen = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        produceWaterSwitchClose = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        hotWaterSwitchOpen = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        hotWaterSwitchClose = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        otherWaterSwitchOpen = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        otherWaterSwitchClose = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (powerSwitchOpen != null && powerSwitchOpen.equals(1)) {
            events.add("电源开");
        }
        if (powerSwitchClose != null && powerSwitchClose.equals(1)) {
            events.add("电源关");
        }
        if (coolingSwitchOpen != null && coolingSwitchOpen.equals(1)) {
            events.add("制冷开");
        }
        if (coolingSwitchClose != null && coolingSwitchClose.equals(1)) {
            events.add("制冷关");
        }
        if (sterilizationSwitchOpen != null && sterilizationSwitchOpen.equals(1)) {
            events.add("杀菌开");
        }
        if (sterilizationSwitchClose != null && sterilizationSwitchClose.equals(1)) {
            events.add("杀菌关");
        }
        if (produceWaterSwitchOpen != null && produceWaterSwitchOpen.equals(1)) {
            events.add("制冷开");
        }
        if (produceWaterSwitchClose != null && produceWaterSwitchClose.equals(1)) {
            events.add("制冷关");
        }
        if (hotWaterSwitchOpen != null && hotWaterSwitchOpen.equals(1)) {
            events.add("热水出水开");
        }
        if (hotWaterSwitchClose != null && hotWaterSwitchClose.equals(1)) {
            events.add("热水出水关");
        }
        if (otherWaterSwitchOpen != null && otherWaterSwitchOpen.equals(1)) {
            events.add("其他水出水开");
        }
        if (otherWaterSwitchClose != null && otherWaterSwitchClose.equals(1)) {
            events.add("其他水出水关");
        }
    }

    @Override
    public String toString() {
//        return String.format("{powerSwitchClose=%s, powerSwitchClose=%s, coolingSwitchOpen=%s, coolingSwitchClose=%s, " +
//                        "sterilizationSwitchOpen=%s, sterilizationSwitchClose=%s, produceWaterSwitchOpen=%s, produceWaterSwitchClose=%s, " +
//                        "hotWaterSwitchOpen=%s, hotWaterSwitchClose=%s, otherWaterSwitchOpen=%s, otherWaterSwitchClose=%s}",
//                powerSwitchClose, powerSwitchClose, coolingSwitchOpen, coolingSwitchClose,
//                sterilizationSwitchOpen, sterilizationSwitchClose, produceWaterSwitchOpen, produceWaterSwitchClose,
//                hotWaterSwitchOpen, hotWaterSwitchClose, otherWaterSwitchOpen, otherWaterSwitchClose);
        return String.format("{events=%s}", events);
    }

    public List<String> getEvents() {
        return events;
    }


}
