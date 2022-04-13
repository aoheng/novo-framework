package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.RequestProtocol;

/**
 * @author BinksRao on 2020/7/18
 */
public class MqttProtocolWholeFieldQueryProtocol extends RequestProtocol {
    private static final long serialVersionUID = 1L;

    private Long protocolId;

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }
}
