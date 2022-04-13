package com.novo.data.rabbitMq.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.novo.framework.core.util.JacksonUtils;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Aoheng on 2021/01/30 2020/03/06.
 */
public class MqMessage {

    private String id;
    private Long time;
    private Object data;

    public static MqMessage createNew(Object data) {
        MqMessage msg = new MqMessage();
        msg.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        msg.setTime(System.currentTimeMillis());
        msg.setData(data);
        return msg;
    }

    @JsonIgnore
    public <T> T getData(Class<T> clazz) {
        if (data == null) {
            return null;
        }
        if (data instanceof Map) {
            return JacksonUtils.map2pojo((Map) data, clazz);
        }

        return JacksonUtils.obj2pojo(data, clazz);
    }

    @JsonIgnore
    public <T> List<T> getDataAsList(Class<T> clazz) {
        if (data == null) {
            return null;
        }

        return JacksonUtils.json2list(JacksonUtils.obj2json(data), clazz);
    }

    @JsonIgnore
    public int getDataAsInteger() {
        if (data instanceof Integer) {
            return (int) data;
        }
        return Integer.parseInt(String.valueOf(data));
    }

    @JsonIgnore
    public long getDataAsLong() {
        if (data instanceof Long) {
            return (long) data;
        }
        return Long.parseLong(String.valueOf(data));
    }

    @JsonIgnore
    public String getDataAsString() { return (String) data; }

    @JsonIgnore
    public String getDataAsJson() {return JacksonUtils.obj2json(data);}

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public Long getTime() { return time; }

    public void setTime(Long time) { this.time = time; }
}

