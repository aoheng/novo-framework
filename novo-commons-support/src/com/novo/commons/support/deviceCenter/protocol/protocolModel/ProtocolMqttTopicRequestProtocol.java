package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * 协议主题
 * @author BinksRao on 2020/7/4
 */
public class ProtocolMqttTopicRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**主题名称*/
    private String topicName;
    /**主题描述*/
    private String topicDesc;
    /**主题所属协议id*/
    private Long protocolId;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }


}
