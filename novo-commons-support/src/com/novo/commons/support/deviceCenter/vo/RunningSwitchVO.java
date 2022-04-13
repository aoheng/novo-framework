package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/04/12.
 * 运行开关VO
 */
public class RunningSwitchVO {

    private String imeiCode;

    /** 开关状态（0：休眠/暂停 1：运行） */
    private Integer runningStatus;

    public RunningSwitchVO() {}

    public RunningSwitchVO(String imeiCode, Integer runningStatus) {
        this.imeiCode = imeiCode;
        this.runningStatus = runningStatus;
    }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getRunningStatus() { return runningStatus; }

    public void setRunningStatus(Integer runningStatus) { this.runningStatus = runningStatus; }
}
