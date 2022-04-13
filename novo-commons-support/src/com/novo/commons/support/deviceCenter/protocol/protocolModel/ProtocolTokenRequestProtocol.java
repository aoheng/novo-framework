package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * 协议消息类型
 * @author BinksRao on 2020/7/4
 */
public class ProtocolTokenRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**token名称*/
    private String tokenName;
    /**token消息类型码*/
    private String tokenCode;
    /**token归属主题id*/
    private Long topicId;
    /**token描述*/
    private String tokenDesc;
    /**token解析字段是否从全量字段表匹配(默认0：是，1：否)*/
    private Integer fromWhole;
    /**token下属协议字段id集合*/
    private List<Long> fieldIdList;
    /**token下属协议字段id集合*/
    private String fieldIds;

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTokenDesc() {
        return tokenDesc;
    }

    public void setTokenDesc(String tokenDesc) {
        this.tokenDesc = tokenDesc;
    }

    public Integer getFromWhole() {
        return fromWhole;
    }

    public void setFromWhole(Integer fromWhole) {
        this.fromWhole = fromWhole;
    }

    public List<Long> getFieldIdList() {
        return fieldIdList;
    }

    public void setFieldIdList(List<Long> fieldIdList) {
        this.fieldIdList = fieldIdList;
    }

    public String getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(String fieldIds) {
        this.fieldIds = fieldIds;
    }
}
