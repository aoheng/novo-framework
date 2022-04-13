package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/06/08.
 */
public class HeatingSwitchVO {

    private String imeiCode;
    /** 开关状态（0：关闭 1：开启） */
    private Integer heatingStatus;

    public HeatingSwitchVO() {}

    public HeatingSwitchVO(String imeiCode, Integer heatingStatus) {
        this.imeiCode = imeiCode;
        this.heatingStatus = heatingStatus;
    }

    public Integer getHeatingStatus() { return heatingStatus; }

    public void setHeatingStatus(Integer heatingStatus) { this.heatingStatus = heatingStatus; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }
}
