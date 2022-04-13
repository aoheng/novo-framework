package com.novo.commons.support.deviceCenter.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class DeviceHardwareRequestProtocol extends PaginationRequestProtocol {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    private String hardwareFirm;

    private String hardwareSn;

    private Integer hardwareType;

    private Long deviceId;


    public String getHardwareFirm() {
        return hardwareFirm;
    }

    public void setHardwareFirm(String hardwareFirm) {
        this.hardwareFirm = hardwareFirm;
    }

    public String getHardwareSn() {
        return hardwareSn;
    }

    public void setHardwareSn(String hardwareSn) {
        this.hardwareSn = hardwareSn;
    }

    public Integer getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(Integer hardwareType) {
        this.hardwareType = hardwareType;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

}
