package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author BinksRao
 * @date 2020/6/12
 *
 * 事件
 */
public class DeviceEventRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    private String eventName;

    private String eventCode;

    private String eventField;

    private Long protocolId;

    private String transferType;

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventField() {
        return eventField;
    }

    public void setEventField(String eventField) {
        this.eventField = eventField;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }
}
