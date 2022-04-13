package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/06/08.
 */
public class CoolingSwitchVO {

    private String imeiCode;
    /** 开关状态（0：关闭 1：开启） */
    private Integer coolingStatus;

    public CoolingSwitchVO() {}

    public CoolingSwitchVO(String imeiCode, Integer coolingStatus) {
        this.imeiCode = imeiCode;
        this.coolingStatus = coolingStatus;
    }

    public Integer getCoolingStatus() { return coolingStatus; }

    public void setCoolingStatus(Integer coolingStatus) { this.coolingStatus = coolingStatus; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }
}
