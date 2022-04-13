package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.RequestProtocol;

/**
 * @author Aoheng on 2020/12/05.
 */
public class MqttDeviceQueryProtocol extends RequestProtocol {

    private static final long serialVersionUID = 1L;
    private String imeiCode;
    private String deviceSn;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getDeviceSn() { return deviceSn; }

    public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }
}
