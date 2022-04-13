package com.novo.commons.support.deviceCenter.mqtt.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 可用时间充值VO
 */
public class RechargeTimeVO {

    private String imeiCode;
    private Integer days;

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
