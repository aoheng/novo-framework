package com.novo.commons.support.deviceCenter.vo.jsonVO;

/**
 * @author MickeyChen
 * @date 2020/6/8
 */
public class ActionHeatingPlanTimeVO {

    private Integer enable;

    private String startTime;

    private String endTime;

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
