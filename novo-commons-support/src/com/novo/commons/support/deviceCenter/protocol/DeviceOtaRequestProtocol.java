package com.novo.commons.support.deviceCenter.protocol;

import java.io.Serializable;

public class DeviceOtaRequestProtocol implements Serializable {

    public static final String MY_FIELD_IMEICODE = "imeiCode";
    public static final String MY_FIELD_DEVICETYPE = "deviceType";
    public static final String MY_FIELD_MODEL = "model";
    public static final String MY_FIELD_FIRMWARETYPE = "firmwareType";

    public static final String MY_FIELD_LIMIT = "limit";
    public static final String MY_FIELD_PAGENO = "pageNo";

    private String imeiCode;

    private Integer deviceType;

    private Integer productCode;

    private Integer firmwareType;

    private Integer pageNo;

    private Integer onlineStatus;

    private Integer limit;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer model) {
        this.productCode = model;
    }

    public Integer getFirmwareType() {
        return firmwareType;
    }

    public void setFirmwareType(Integer firmwareType) {
        this.firmwareType = firmwareType;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }
}
