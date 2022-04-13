package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;


public class DeviceHardwareVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String hardwareFirm;

    private String hardwareSn;

    /** */
    private Integer hardwareType;

    private String hardwareName;

    private Long deviceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }
}
