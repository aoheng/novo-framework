package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 设置计费模式VO
 */
public class SetChargeModeVO {

    private String imeiCode;
    private Integer mode;

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }
}
