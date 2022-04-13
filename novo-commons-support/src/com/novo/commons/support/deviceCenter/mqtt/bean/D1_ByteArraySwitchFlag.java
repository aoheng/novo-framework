package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（净水器）
 */
public class D1_ByteArraySwitchFlag {

    private List<String> events;
    /** 出水开关（0：关，1：开） */
    private Integer flowWater;
    /** 电源开关（0：关，1：开） */
    private Integer power;
    /** 加热开关（0：关，1：开） */
    private Integer heating;
    /** 制冷开关（0：关，1：开） */
    private Integer cooling;
    /** 臭氧开关（0：关，1：开） */
    private Integer ozone;
    /** 制水（0：停止制水，1：开始制水） */
    private Integer produceWater;
    /** 水值到期（0：未到期，1：到期） */
    private Integer expired;
    public D1_ByteArraySwitchFlag() {
    }

    public D1_ByteArraySwitchFlag(byte[] bytes) {
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
        ozone = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        produceWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        expired = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (flowWater != null && flowWater.equals(1))
            events.add("出水开");
        if (power != null && power.equals(1))
            events.add("电源开");
        if (heating != null && heating.equals(1))
            events.add("加热开");
        if (cooling != null && cooling.equals(1))
            events.add("制冷开");
        if (ozone != null && ozone.equals(1))
            events.add("臭氧开");
        if (produceWater != null && produceWater.equals(1))
            events.add("开始制水");
        if (expired != null && expired.equals(1))
            events.add("到期");
    }

    @Override
    public String toString() {
        return String.format("{flowWater=%s, power=%s, heating=%s, cooling=%s, ozone=%s, produceWater=%s, expired=%s}", flowWater, power, heating, cooling, ozone, produceWater, expired);
    }

    public Integer getFlowWater() { return flowWater; }

    public void setFlowWater(Integer flowWater) { this.flowWater = flowWater; }

    public Integer getPower() { return power; }

    public void setPower(Integer power) { this.power = power; }

    public Integer getHeating() { return heating; }

    public void setHeating(Integer heating) { this.heating = heating; }

    public Integer getCooling() { return cooling; }

    public void setCooling(Integer cooling) { this.cooling = cooling; }

    public Integer getOzone() { return ozone; }

    public void setOzone(Integer ozone) { this.ozone = ozone; }

    public Integer getProduceWater() { return produceWater; }

    public void setProduceWater(Integer produceWater) { this.produceWater = produceWater; }

    public Integer getExpired() { return expired; }

    public void setExpired(Integer expired) { this.expired = expired; }

    public List<String> getEvents() {
        return events;
    }
}
