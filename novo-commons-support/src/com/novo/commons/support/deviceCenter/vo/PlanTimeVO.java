package com.novo.commons.support.deviceCenter.vo;

import com.novo.commons.support.deviceCenter.mqtt.bean.ByteArrayPlanTime;

/**
 * @author Aoheng on 2020/06/07.
 */
public class PlanTimeVO {

    private String imeiCode;
    /** 定时开关 */
    private Integer enable = 0;
    /** 定时开始、结束时间（仅用于定时） */
    private ByteArrayPlanTime planTime;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getEnable() { return enable; }

    public void setEnable(Integer enable) { this.enable = enable; }

    public ByteArrayPlanTime getPlanTime() { return planTime; }

    public void setPlanTime(ByteArrayPlanTime planTime) { this.planTime = planTime; }
}
