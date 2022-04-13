package com.novo.commons.support.deviceCenter.protocol;

import java.io.Serializable;

/**
 * 计量模式
 * @Author:kemingheng
 * @Date:2020/9/9
 */
public class DeviceChargeModeRequestProtocol implements Serializable {

    private static final long serialVersionUID = -1L;

    private String orgCode;
    private String deviceSn;
    private Integer mode;   //0：时间，5：壶数


    public String getOrgCode() {
        return orgCode;
    }

    public DeviceChargeModeRequestProtocol setOrgCode(String orgCode) {
        this.orgCode = orgCode;
        return this;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public DeviceChargeModeRequestProtocol setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }


    public Integer getMode() {
        return mode;
    }

    public DeviceChargeModeRequestProtocol setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
}
