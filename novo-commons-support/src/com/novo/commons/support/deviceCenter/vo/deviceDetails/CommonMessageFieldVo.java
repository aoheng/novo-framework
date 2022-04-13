package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.novo.commons.support.deviceCenter.mqtt.constant.ByteOptResultType;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/7/24
 */
public class CommonMessageFieldVo  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer valueType;
    private String msgToken;
    private byte[] bytes;
    private Object value;
    private String desc;
    private ByteOptResultType optResultType;

    public ByteOptResultType getOptResultType() {
        return optResultType;
    }

    public void setOptResultType(ByteOptResultType optResultType) {
        this.optResultType = optResultType;
    }

    public String getMsgToken() {
        return msgToken;
    }

    public void setMsgToken(String msgToken) {
        this.msgToken = msgToken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
