package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.RequestProtocol;

/**
 * @author Aoheng on 2020/12/05.
 */
public class MqttDeviceKickProtocol extends RequestProtocol {

    private static final long serialVersionUID = 1L;
    private String imeiCode;
    /**
     * 0-厂测生产
     * 1-厂测测试
     * 2-厂测开发
     * 3-伊泉云生产
     * 4-伊泉云测试
     * 5-伊泉云开发
     * 6-公共云开发
     * 7-公共云测试
     * 8-公共云开发
     * 9-厂测预发布
     * a-伊泉云预发布
     * b-公共预发布
     */
    private String envCode;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getEnvCode() { return envCode; }

    public void setEnvCode(String envCode) { this.envCode = envCode; }
}
