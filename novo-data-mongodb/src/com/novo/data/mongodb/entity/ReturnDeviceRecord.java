package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author MickeyChen
 * @date 2020/9/30
 */
public class ReturnDeviceRecord extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceSn;

    private Long modifierId;

    public ReturnDeviceRecord(String deviceSn, String imeiCode, Long modifierId) {
        this.deviceSn = deviceSn;
        this.imeiCode = imeiCode;
        this.modifierId = modifierId;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }
}
