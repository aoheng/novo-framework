package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;


public class DeviceUpgradeVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String imeiCode;

    private Long deviceId;

    private String productType;

    private Integer productCode;

    private String productName;

    private String mainFirm;

    private String mainSn;

    private String ctrlFirm;

    private String ctrlSn;

    private String screenFirm;

    private String screenSn;

    private String gsmFirm;

    private String gsmSn;

    private Integer deviceOnline;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCtrlFirm() {
        return ctrlFirm;
    }

    public void setCtrlFirm(String ctrlFirm) {
        this.ctrlFirm = ctrlFirm;
    }

    public String getCtrlSn() {
        return ctrlSn;
    }

    public void setCtrlSn(String ctrlSn) {
        this.ctrlSn = ctrlSn;
    }

    public String getGsmFirm() {
        return gsmFirm;
    }

    public void setGsmFirm(String gsmFirm) {
        this.gsmFirm = gsmFirm;
    }

    public String getGsmSn() {
        return gsmSn;
    }

    public void setGsmSn(String gsmSn) {
        this.gsmSn = gsmSn;
    }

    public String getMainFirm() {
        return mainFirm;
    }

    public void setMainFirm(String mainFirm) {
        this.mainFirm = mainFirm;
    }

    public String getMainSn() {
        return mainSn;
    }

    public void setMainSn(String mainSn) {
        this.mainSn = mainSn;
    }

    public Integer getDeviceOnline() {
        return deviceOnline;
    }

    public void setDeviceOnline(Integer deviceOnline) {
        this.deviceOnline = deviceOnline;
    }

    public String getScreenFirm() { return screenFirm; }

    public void setScreenFirm(String screenFirm) { this.screenFirm = screenFirm; }

    public String getScreenSn() { return screenSn; }

    public void setScreenSn(String screenSn) { this.screenSn = screenSn; }
}
