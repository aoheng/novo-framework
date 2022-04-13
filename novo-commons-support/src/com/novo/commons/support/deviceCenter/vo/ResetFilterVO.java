package com.novo.commons.support.deviceCenter.vo;

/**
 * @author MickeyChen
 * @date 2020/8/7
 */
public class ResetFilterVO {

    public static final String MY_FIELD_CORER1 = "coreR1";
    public static final String MY_FIELD_CORER2 = "coreR2";
    public static final String MY_FIELD_CORER3 = "coreR3";

    private String imeiCode;

    private String protocolVer;

    private Integer coreR1;
    private Integer coreR2;
    private Integer coreR3;

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getProtocolVer() {
        return protocolVer;
    }

    public void setProtocolVer(String protocolVer) {
        this.protocolVer = protocolVer;
    }

    public Integer getCoreR1() {
        return coreR1;
    }

    public void setCoreR1(Integer coreR1) {
        this.coreR1 = coreR1;
    }

    public Integer getCoreR2() {
        return coreR2;
    }

    public void setCoreR2(Integer coreR2) {
        this.coreR2 = coreR2;
    }

    public Integer getCoreR3() {
        return coreR3;
    }

    public void setCoreR3(Integer coreR3) {
        this.coreR3 = coreR3;
    }
}
