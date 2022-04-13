package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.io.ByteArrayOutputStream;

/**
 * @author Aoheng on 2020/11/2.
 * 臭氧
 */
public class D1_ByteArraySterilization {

   /* BYTE[0]：间隔定时杀菌间隔（单位：小时）
    BYTE[1]：间隔定时杀菌时长（单位：分钟）
    BYTE[3]:夜间定时杀菌时刻（时）
    BYTE[4]:夜间定时杀菌时刻（分）
    BYTE[5]:夜间定时杀菌总时长（单位：分钟）*/

    /** 间隔定时杀菌间隔（单位：小时） */
    private Integer workIntervalHours = 0;
    /** 间隔定时杀菌时长（单位：分钟） */
    private Integer workTotalMins = 0;
    /** 夜间定时杀菌时刻（时） */
    private Integer nightPlanHour = 0;
    /** 夜间定时杀菌时刻（分） */
    private Integer nightPlanMins = 0;
    /** 夜间定时杀菌总时长（单位：分钟） */
    private Integer nightTotalMins = 0;

    public D1_ByteArraySterilization() {}

    public D1_ByteArraySterilization(byte[] bytes) {
        workIntervalHours = ByteUtils.toUint8(bytes[0]);
        workTotalMins = ByteUtils.toUint8(bytes[1]);
        nightPlanHour = ByteUtils.toUint8(bytes[2]);
        nightPlanMins = ByteUtils.toUint8(bytes[3]);
        nightTotalMins = ByteUtils.toUint8(bytes[4]);
    }

    public byte[] toBytes() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(workIntervalHours);
        baos.write(workTotalMins);
        baos.write(nightPlanHour);
        baos.write(nightPlanMins);
        baos.write(nightTotalMins);
        return baos.toByteArray();
    }

    @Override
    public String toString() {
        return String.format("{workIntervalHours=%s, workTotalMins=%s, nightPlanHour=%s, nightPlanMins=%s, nightTotalMins=%s}", workIntervalHours, workTotalMins, nightPlanHour, nightPlanMins, nightTotalMins);
    }

    public Integer getWorkIntervalHours() { return workIntervalHours; }

    public void setWorkIntervalHours(Integer workIntervalHours) { this.workIntervalHours = workIntervalHours; }

    public Integer getWorkTotalMins() { return workTotalMins; }

    public void setWorkTotalMins(Integer workTotalMins) { this.workTotalMins = workTotalMins; }

    public Integer getNightPlanHour() { return nightPlanHour; }

    public void setNightPlanHour(Integer nightPlanHour) { this.nightPlanHour = nightPlanHour; }

    public Integer getNightPlanMins() { return nightPlanMins; }

    public void setNightPlanMins(Integer nightPlanMins) { this.nightPlanMins = nightPlanMins; }

    public Integer getNightTotalMins() { return nightTotalMins; }

    public void setNightTotalMins(Integer nightTotalMins) { this.nightTotalMins = nightTotalMins; }
}
