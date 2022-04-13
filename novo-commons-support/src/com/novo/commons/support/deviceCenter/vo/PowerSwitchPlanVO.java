package com.novo.commons.support.deviceCenter.vo;

/**
 * @author MickeyChen
 * @date 2020/2/27
 */
public class PowerSwitchPlanVO {

    private Integer powerSwitch;
    private Integer powerOnWeek;
    private String powerOnStartTime;
    private Integer powerOffWeek;
    private String powerOffStartTime;

    public Integer getPowerSwitch() {
        return powerSwitch;
    }

    public void setPowerSwitch(Integer powerSwitch) {
        this.powerSwitch = powerSwitch;
    }

    public Integer getPowerOnWeek() {
        return powerOnWeek;
    }

    public void setPowerOnWeek(Integer powerOnWeek) {
        this.powerOnWeek = powerOnWeek;
    }

    public String getPowerOnStartTime() {
        return powerOnStartTime;
    }

    public void setPowerOnStartTime(String powerOnStartTime) {
        this.powerOnStartTime = powerOnStartTime;
    }

    public Integer getPowerOffWeek() {
        return powerOffWeek;
    }

    public void setPowerOffWeek(Integer powerOffWeek) {
        this.powerOffWeek = powerOffWeek;
    }

    public String getPowerOffStartTime() {
        return powerOffStartTime;
    }

    public void setPowerOffStartTime(String powerOffStartTime) {
        this.powerOffStartTime = powerOffStartTime;
    }
}
