package com.novo.commons.support.deviceCenter.protocol;

/**
 * @author MickeyChen
 * @date 2020/1/4
 */
public class DeviceRebateRequestProtocol {

    public static final String TK_EXAMPLE_KEY_TYPE = "type";
    public static final String TK_EXAMPLE_KEY_FILTERSN = "filterSn";
    public static final String TK_EXAMPLE_KEY_FILTEROPERATOR = "filterOperator";
    public static final String TK_EXAMPLE_KEY_DEVICEID = "deviceId";
    public static final String TK_EXAMPLE_KEY_ORGCODE = "orgCode";
    public static final String TK_EXAMPLE_KEY_REBATESTATUS = "rebateStatus";

    private String type;

    private String filterSn;

    private Integer filterOperator;

    private Long deviceId;

    private Integer rebateStatus;

    private String imeiCode;

    private Long id;

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

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getRebateStatus() {
        return rebateStatus;
    }

    public void setRebateStatus(Integer rebateStatus) {
        this.rebateStatus = rebateStatus;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
