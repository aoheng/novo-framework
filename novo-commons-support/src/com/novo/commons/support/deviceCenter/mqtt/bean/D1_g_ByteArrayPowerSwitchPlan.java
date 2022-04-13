package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.commons.support.deviceCenter.vo.PowerSwitchPlanVO;
import com.novo.framework.core.util.ByteUtils;
import com.novo.framework.core.util.StringUtils;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MickeyChen
 * @date 2020/2/27
 */
public class D1_g_ByteArrayPowerSwitchPlan {

    private List<String> powerSwitchPlan = new ArrayList<>();
    private Integer powerSwitch;
    private Integer powerOnWeek;
    private Integer powerOnStartTimeHour;
    private Integer powerOnStartTimeMin;
    private Integer powerOffWeek;
    private Integer powerOffStartTimeHour;
    private Integer powerOffStartTimeMin;

    public D1_g_ByteArrayPowerSwitchPlan() {}

    public D1_g_ByteArrayPowerSwitchPlan(byte[] bytes) {
        if (bytes.length > 0) {
            for (int i=0;i<bytes.length;i=i+7) {
                powerSwitch = ByteUtils.toUint8(bytes[i]);
                powerOnWeek = ByteUtils.toUint8(bytes[i+1]);
                powerOnStartTimeHour = ByteUtils.toUint8(bytes[i+2]);
                powerOnStartTimeMin = ByteUtils.toUint8(bytes[i+3]);
                powerOffWeek = ByteUtils.toUint8(bytes[i+4]);
                powerOffStartTimeHour = ByteUtils.toUint8(bytes[i+5]);
                powerOffStartTimeMin = ByteUtils.toUint8(bytes[i+6]);
                String str = String.format("{powerSwitch=%s, powerOnWeek=%s, powerOnStartTime=%s:%s, " +
                                "powerOffWeek=%s, powerOffStartTime=%s:%s}",
                        powerSwitch, powerOnWeek, powerOnStartTimeHour, powerOnStartTimeMin, powerOffWeek, powerOffStartTimeHour, powerOffStartTimeMin);
                powerSwitchPlan.add(str);
            }
        }
    }

    public byte[] toBytes(List<PowerSwitchPlanVO> value) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if (value != null && value.size() > 0) {
            for (int i=0;i<value.size();i++) {
                baos.write(value.get(i).getPowerSwitch());
                baos.write(value.get(i).getPowerOnWeek());
                baos.write(Integer.parseInt(value.get(i).getPowerOnStartTime().split(":")[0]));
                baos.write(Integer.parseInt(value.get(i).getPowerOnStartTime().split(":")[1]));
                baos.write(value.get(i).getPowerOffWeek());
                baos.write(Integer.parseInt(value.get(i).getPowerOffStartTime().split(":")[0]));
                baos.write(Integer.parseInt(value.get(i).getPowerOffStartTime().split(":")[1]));
            }
        }
        return baos.toByteArray();
    }

    @Override
    public String toString() {
        if (powerSwitchPlan == null || powerSwitchPlan.size() == 0)
            return "NONE";
        else
            return StringUtils.join(powerSwitchPlan, "，");
    }

    public List<String> getPowerSwitchPlan() {
        return powerSwitchPlan;
    }

    public void setPowerSwitchPlan(List<String> powerSwitchPlan) {
        this.powerSwitchPlan = powerSwitchPlan;
    }

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

    public Integer getPowerOnStartTimeHour() {
        return powerOnStartTimeHour;
    }

    public void setPowerOnStartTimeHour(Integer powerOnStartTimeHour) {
        this.powerOnStartTimeHour = powerOnStartTimeHour;
    }

    public Integer getPowerOnStartTimeMin() {
        return powerOnStartTimeMin;
    }

    public void setPowerOnStartTimeMin(Integer powerOnStartTimeMin) {
        this.powerOnStartTimeMin = powerOnStartTimeMin;
    }

    public Integer getPowerOffWeek() {
        return powerOffWeek;
    }

    public void setPowerOffWeek(Integer powerOffWeek) {
        this.powerOffWeek = powerOffWeek;
    }

    public Integer getPowerOffStartTimeHour() {
        return powerOffStartTimeHour;
    }

    public void setPowerOffStartTimeHour(Integer powerOffStartTimeHour) {
        this.powerOffStartTimeHour = powerOffStartTimeHour;
    }

    public Integer getPowerOffStartTimeMin() {
        return powerOffStartTimeMin;
    }

    public void setPowerOffStartTimeMin(Integer powerOffStartTimeMin) {
        this.powerOffStartTimeMin = powerOffStartTimeMin;
    }
}
