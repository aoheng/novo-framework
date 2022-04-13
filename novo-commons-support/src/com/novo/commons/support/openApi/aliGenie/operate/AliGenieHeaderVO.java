package com.novo.commons.support.openApi.aliGenie.operate;

/**
 * @author MickeyChen
 * @date 2020/12/11
 */
public class AliGenieHeaderVO {

    private String namespace;
    private String name;
    private String messageId;
    private Integer payLoadVersion;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Integer getPayLoadVersion() {
        return payLoadVersion;
    }

    public void setPayLoadVersion(Integer payLoadVersion) {
        this.payLoadVersion = payLoadVersion;
    }
}
