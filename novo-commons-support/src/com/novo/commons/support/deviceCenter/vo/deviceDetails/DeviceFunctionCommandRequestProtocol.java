package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;
import java.util.List;

/**
 * @author BinksRao on 2020/8/8
 */
public class DeviceFunctionCommandRequestProtocol implements Serializable {
    private static final long serialVersionUID = 1L;

    private String deviceSn;
    private String imeiCode;
    private Long protocolId;
    private List<DeviceFunctionDetailVo> details;

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public List<DeviceFunctionDetailVo> getDetails() {
        return details;
    }

    public void setDetails(List<DeviceFunctionDetailVo> details) {
        this.details = details;
    }


}
