package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/06/07.
 * 杀菌设置
 */
public class SetSterilizationVO {

    private String imeiCode;
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

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

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
