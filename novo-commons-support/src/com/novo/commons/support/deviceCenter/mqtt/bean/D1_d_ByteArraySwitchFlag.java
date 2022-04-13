package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（净水器）
 */
public class D1_d_ByteArraySwitchFlag {

    private List<String> events;
    /** 电源开关（0：关，1：开） */
    private Integer power;
    /** 锁机开关（0：关，1：开） */
    private Integer lockMachine;
    /** 加热开关（0：关，1：开） */
    private Integer heating;
    /** 加热状态（0：保温，1：加热） */
    private Integer heatingStatus;
    /** 热水开关（0：关，1：开） */
    private Integer hotWater;
    /** 冷水开关（0：关，1：开） */
    private Integer coolWater;

    public D1_d_ByteArraySwitchFlag() {}

    public D1_d_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        power = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        lockMachine = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        heating = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        heatingStatus = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        hotWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coolWater = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (power != null && power.equals(1))
            events.add("电源开");
        if (lockMachine != null && lockMachine.equals(1))
            events.add("锁机开");
        if (heating != null && heating.equals(1)) {
            events.add("加热开");
        }
        if (heating != null && heating.equals(1) && heatingStatus != null) {
            if (heatingStatus.equals(0)) {
                events.add("正在保温");
            } else if (heatingStatus.equals(1)) {
                events.add("正在加热");
            }
        }
        if (hotWater != null && hotWater.equals(1))
            events.add("热水开");
        if (coolWater != null && coolWater.equals(1))
            events.add("冷水开");
    }

    @Override
    public String toString() {
        return String.format("{power=%s, lockMachine=%s, heating=%s, heatingStatus=%s, hotWater=%s, coolWater=%s}", power, lockMachine, heating, heatingStatus, hotWater, coolWater);
    }

    public Integer getPower() { return power; }

    public void setPower(Integer power) { this.power = power; }

    public Integer getLockMachine() { return lockMachine; }

    public void setLockMachine(Integer lockMachine) { this.lockMachine = lockMachine; }

    public Integer getHeating() { return heating; }

    public void setHeating(Integer heating) { this.heating = heating; }

    public Integer getHeatingStatus() { return heatingStatus; }

    public void setHeatingStatus(Integer heatingStatus) { this.heatingStatus = heatingStatus; }

    public Integer getHotWater() { return hotWater; }

    public void setHotWater(Integer hotWater) { this.hotWater = hotWater; }

    public Integer getCoolWater() { return coolWater; }

    public void setCoolWater(Integer coolWater) { this.coolWater = coolWater; }

    public List<String> getEvents() {
        return events;
    }
}
