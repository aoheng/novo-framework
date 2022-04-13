package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.BaseRequestProtocol;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author MickeyChen
 * @date 2020/5/7
 */
public class NbiotDeviceRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 1L;

    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
