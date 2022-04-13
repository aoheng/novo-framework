package com.novo.commons.support.deviceCenter.protocol.vo;

/**
 * @author MickeyChen
 * @date 2020/1/4
 */
public class DeviceRebateVo {

    private String type;

    private String filterSn;

    private Integer filterOperator;

    private Integer rebateStatus;

    private Long id;

    private String imeiCode;

    private String deviceCode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilterSn() {
        return filterSn;
    }

    public void setFilterSn(String filterSn) {
        this.filterSn = filterSn;
    }

    public Integer getFilterOperator() {
        return filterOperator;
    }

    public void setFilterOperator(Integer filterOperator) {
        this.filterOperator = filterOperator;
    }

    public Integer getRebateStatus() {
        return rebateStatus;
    }

    public void setRebateStatus(Integer rebateStatus) {
        this.rebateStatus = rebateStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
}
