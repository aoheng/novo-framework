package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（净水器）
 */
public class D1_c_ByteArraySwitchFlag {

    private List<String> events;
    /** 电源开关（0：关，1：开） */
    private Integer power;
    /** 制水开关（0：关，1：开） */
    private Integer productWater;
    /** 补水开关（0：关，1：开） */
    private Integer replenishWater;
    /** 热水开关（0：关，1：开） */
    private Integer hotWater;
    /** 温水开关（0：关，1：开） */
    private Integer warmWater;
    /** 冷水开关（0：关，1：开） */
    private Integer coolWater;
    /** 臭氧开关（0：关，1：开） */
    private Integer ozone;
    /** 制冷开关（0：关，1：开） */
    private Integer cooling;
    /** 加热开关（0：关，1：开） */
    private Integer heating;

    public D1_c_ByteArraySwitchFlag() {}

    public D1_c_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        power = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        productWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        replenishWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        hotWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        warmWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coolWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        ozone = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cooling = (b & n) != 0 ? 1 : 0;

        b = bytes[bytes.length - 2];
        n = 0x01;
        heating = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (power != null && power.equals(1))
            events.add("电源开");
        if (productWater != null && productWater.equals(1))
            events.add("制水开");
        if (replenishWater != null && replenishWater.equals(1))
            events.add("补水开");
        if (hotWater != null && hotWater.equals(1))
            events.add("热水开");
        if (warmWater != null && warmWater.equals(1))
            events.add("温水开");
        if (coolWater != null && coolWater.equals(1))
            events.add("冷水开");
        if (ozone != null && ozone.equals(1))
            events.add("臭氧开");
        if (cooling != null && cooling.equals(1))
            events.add("制冷开");
        if (heating != null && heating.equals(1))
            events.add("加热开");
    }

    @Override
    public String toString() {
        return String.format("{power=%s, productWater=%s, replenishWater=%s, hotWater=%s, warmWater=%s, coolWater=%s, ozone=%s, heating=%s, cooling=%s}", power, productWater, replenishWater, hotWater, warmWater, coolWater, ozone, heating, cooling);
    }

    public Integer getPower() { return power; }

    public void setPower(Integer power) { this.power = power; }

    public Integer getProductWater() { return productWater; }

    public void setProductWater(Integer productWater) { this.productWater = productWater; }

    public Integer getReplenishWater() { return replenishWater; }

    public void setReplenishWater(Integer replenishWater) { this.replenishWater = replenishWater; }

    public Integer getHotWater() { return hotWater; }

    public void setHotWater(Integer hotWater) { this.hotWater = hotWater; }

    public Integer getWarmWater() { return warmWater; }

    public void setWarmWater(Integer warmWater) { this.warmWater = warmWater; }

    public Integer getCoolWater() { return coolWater; }

    public void setCoolWater(Integer coolWater) { this.coolWater = coolWater; }

    public Integer getOzone() { return ozone; }

    public void setOzone(Integer ozone) { this.ozone = ozone; }

    public Integer getHeating() { return heating; }

    public void setHeating(Integer heating) { this.heating = heating; }

    public Integer getCooling() { return cooling; }

    public void setCooling(Integer cooling) { this.cooling = cooling; }

    public List<String> getEvents() {
        return events;
    }
}
