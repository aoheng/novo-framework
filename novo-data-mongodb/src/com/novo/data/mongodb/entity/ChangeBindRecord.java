package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author MickeyChen
 * @date 2020/3/30
 */
public class ChangeBindRecord extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceSn;
    private String oldImeiCode;
    private String newImeiCode;
    private Long deviceId;

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getOldImeiCode() {
        return oldImeiCode;
    }

    public void setOldImeiCode(String oldImeiCode) {
        this.oldImeiCode = oldImeiCode;
    }

    public String getNewImeiCode() {
        return newImeiCode;
    }

    public void setNewImeiCode(String newImeiCode) {
        this.newImeiCode = newImeiCode;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

}
