package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;
import java.util.List;

/**
 * 消息类型
 * @author BinksRao on 2020/6/25
 */
public class ProtocolTokenVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
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
    private String fieldIds;
    /**token包含的字段*/
    private List<ProtocolWholeFieldVo> fieldVoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<ProtocolWholeFieldVo> getFieldVoList() {
        return fieldVoList;
    }

    public void setFieldVoList(List<ProtocolWholeFieldVo> fieldVoList) {
        this.fieldVoList = fieldVoList;
    }

    public Integer getFromWhole() {
        return fromWhole;
    }

    public void setFromWhole(Integer fromWhole) {
        this.fromWhole = fromWhole;
    }

    public String getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(String fieldIds) {
        this.fieldIds = fieldIds;
    }
}
