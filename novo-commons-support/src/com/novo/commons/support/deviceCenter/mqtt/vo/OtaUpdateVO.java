package com.novo.commons.support.deviceCenter.mqtt.vo;

/**
 * @author Aoheng on 2020/11/2.
 * OTA升级VO
 */
public class OtaUpdateVO {

    private String imeiCode;
    /** （0x00：通讯模块升级，0x01：控制板升级，0x02：显示板 ） */
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }
}
