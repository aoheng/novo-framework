package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.RequestProtocol;

/**
 * @author RaoYongBin on 2020/5/4
 */
public class MqttDeviceProtocolQueryProtocol extends RequestProtocol {

    private static final long serialVersionUID = 1L;
    private String protVersion;
    private String orgCode;
    private String reserve;
    private Long protocolId;

    public String getProtVersion() {
        return protVersion;
    }

    public void setProtVersion(String protVersion) {
        this.protVersion = protVersion;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }
}
