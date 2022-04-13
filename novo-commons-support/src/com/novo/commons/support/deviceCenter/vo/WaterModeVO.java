package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/04/12.
 * 水量模式
 */
public class WaterModeVO {

    private String imeiCode;

    /**
     * 水量模式
     * MiniM4（0-连续 1-200ML 2-330ML 4-500ML）
     */
    private Integer mode;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getMode() { return mode; }

    public void setMode(Integer mode) { this.mode = mode; }
}
