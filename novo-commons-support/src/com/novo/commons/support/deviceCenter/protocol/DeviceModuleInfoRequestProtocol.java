package com.novo.commons.support.deviceCenter.protocol;


import com.novo.commons.support.deviceCenter.protocol.vo.DeviceHardwareVo;
import com.novo.framework.core.protocol.BaseRequestProtocol;

import java.util.List;

public class DeviceModuleInfoRequestProtocol extends BaseRequestProtocol {

    private List<DeviceHardwareVo> hardwares;
    private Long deviceId;

    public Long getDeviceId() { return deviceId; }

    public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }

    public List<DeviceHardwareVo> getHardwares() { return hardwares; }

    public void setHardwares(List<DeviceHardwareVo> hardwares) { this.hardwares = hardwares; }
}
