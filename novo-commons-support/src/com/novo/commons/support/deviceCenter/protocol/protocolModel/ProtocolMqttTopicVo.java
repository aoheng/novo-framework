package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;
import java.util.List;

/**
 * 协议主题
 * @author BinksRao on 2020/6/25
 */
public class ProtocolMqttTopicVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**主题名称*/
    private String topicName;
    /**主题描述*/
    private String topicDesc;
    /**主题所属协议id*/
    private Long protocolId;
    /**主题包含的token*/
    private List<ProtocolTokenVo> tokenVoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<ProtocolTokenVo> getTokenVoList() {
        return tokenVoList;
    }

    public void setTokenVoList(List<ProtocolTokenVo> tokenVoList) {
        this.tokenVoList = tokenVoList;
    }
}
