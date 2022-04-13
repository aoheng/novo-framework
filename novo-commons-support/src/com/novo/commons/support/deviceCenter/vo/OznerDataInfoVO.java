package com.novo.commons.support.deviceCenter.vo;

/**
 * @author MickeyChen
 * @date 2020/4/23
 */
public class OznerDataInfoVO {

    private String deviceId;

    public OznerDataInfoVO(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
