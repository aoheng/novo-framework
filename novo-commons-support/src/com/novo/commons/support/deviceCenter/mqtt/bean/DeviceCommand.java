package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.novo.framework.core.util.JacksonUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Aoheng on 2021/01/31.
 */
public class DeviceCommand {

    private String imeiCode;
    private Long msgId;
    private String type;
    private Object data;

    public DeviceCommand() {

    }

    public DeviceCommand(Long msgId, String commandType, String imeiCode) {
        this.msgId = msgId;
        type = commandType;
        this.imeiCode = imeiCode;
    }

    public DeviceCommand(Long msgId, String commandType, String imeiCode, Object data) {
        this.msgId = msgId;
        type = commandType;
        this.imeiCode = imeiCode;
        this.data = data;
    }

    @JsonIgnore
    public <T> T getData(Class<T> clazz) {
        if (data == null)
            return null;

        if (data instanceof Map)
            return JacksonUtils.map2pojo((Map) data, clazz);

        return JacksonUtils.obj2pojo(data, clazz);
    }

    @JsonIgnore
    public <T> List<T> getDataAsList(Class<T> clazz) {
        if (data == null)
            return null;

        return JacksonUtils.json2list(JacksonUtils.obj2json(data), clazz);
    }

    @JsonIgnore
    public int getDataAsInteger() {
        if(data instanceof Integer)
            return (int)data;
        return Integer.parseInt(String.valueOf(data));
    }

    @JsonIgnore
    public long getDataAsLong() {
        if(data instanceof Long)
            return (long)data;
        return Long.parseLong(String.valueOf(data));
    }

    @JsonIgnore
    public String getDataAsString() { return (String) data; }

    @JsonIgnore
    public String getDataAsJson() {return JacksonUtils.obj2json(data);}

    @Override
    public String toString() {
        return "{" +
                "imeiCode='" + imeiCode + '\'' +
                ", msgId=" + msgId +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }

    public Long getMsgId() { return msgId; }

    public void setMsgId(Long msgId) { this.msgId = msgId; }
}
