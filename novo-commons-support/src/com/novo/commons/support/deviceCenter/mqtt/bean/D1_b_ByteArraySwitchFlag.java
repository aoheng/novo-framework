package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（净水器）
 */
public class D1_b_ByteArraySwitchFlag {

    private List<String> events;

    /** 出水开关（0：关，1：开） */
    private Integer flowWater;
    /** 电源开关（0：关，1：开） */
    private Integer power;
    /** 加热开关（0：关，1：开） */
    private Integer heating;
    /** 制冷开关（0：关，1：开） */
    private Integer cooling;
    /** 热水开关（0：关，1：开） */
    private Integer hotWater;
    /** 冷水开关（0：关，1：开） */
    private Integer coolWater;
    /** 刷卡（0：关，1：开） */
    private Integer swipe;
    public D1_b_ByteArraySwitchFlag() {
    }

    public D1_b_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        flowWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        power = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        heating = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cooling = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        hotWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coolWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        swipe = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (flowWater != null && flowWater.equals(1))
            events.add("出水开");
        if (power != null && power.equals(1))
            events.add("电源开");
        if (heating != null && heating.equals(1))
            events.add("加热开");
        if (cooling != null && cooling.equals(1))
            events.add("制冷开");
        if (hotWater != null && hotWater.equals(1))
            events.add("热水开");
        if (coolWater != null && coolWater.equals(1))
            events.add("冷水开");
        if (swipe != null && swipe.equals(1))
            events.add("刷卡开");
    }

    @Override
    public String toString() {
        return String.format("{flowWater=%s, power=%s, heating=%s, cooling=%s, hotWater=%s, coolWater=%s, swipe=%s}", flowWater, power, heating, cooling, hotWater, coolWater, swipe);
    }

    public Integer getFlowWater() { return flowWater; }

    public void setFlowWater(Integer flowWater) { this.flowWater = flowWater; }

    public Integer getPower() { return power; }

    public void setPower(Integer power) { this.power = power; }

    public Integer getHeating() { return heating; }

    public void setHeating(Integer heating) { this.heating = heating; }

    public Integer getCooling() { return cooling; }

    public void setCooling(Integer cooling) { this.cooling = cooling; }

    public Integer getHotWater() { return hotWater; }

    public void setHotWater(Integer hotWater) { this.hotWater = hotWater; }

    public Integer getCoolWater() { return coolWater; }

    public void setCoolWater(Integer coolWater) { this.coolWater = coolWater; }

    public Integer getSwipe() { return swipe; }

    public void setSwipe(Integer swipe) { this.swipe = swipe; }

    public List<String> getEvents() {
        return events;
    }
}
