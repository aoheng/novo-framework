package com.novo.commons.support.deviceCenter.vo;

import com.novo.commons.support.deviceCenter.mqtt.bean.ByteArrayPlanTime;

/**
 * @author Aoheng on 2020/04/12.
 * 电源开关VO
 */
public class PowerSwitchVO {

    private String imeiCode;

    /** 开关状态（0：关闭 1：开启） */
    private Integer powerStatus;

    public PowerSwitchVO() {}

    public PowerSwitchVO(String imeiCode, Integer powerStatus) {
        this.imeiCode = imeiCode;
        this.powerStatus = powerStatus;
    }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getPowerStatus() { return powerStatus; }

    public void setPowerStatus(Integer powerStatus) { this.powerStatus = powerStatus; }
}
