package com.novo.data.redis.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.novo.framework.core.util.JacksonUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Aoheng on 2021/01/30 2021/01/313.
 */
public class RedisObject implements Serializable {

    private static final long serialVersionUID = 1L;
    private String className;
    private Object data;

    public RedisObject() {

    }

    public RedisObject(Object data) {
        this.data = data;
        if (data instanceof String) {
            this.className = String.class.getName();
        } else if (data instanceof Byte) {
            this.className = Byte.class.getName();
        } else if (data instanceof Short) {
            this.className = Short.class.getName();
        } else if (data instanceof Integer) {
            this.className = Integer.class.getName();
        } else if (data instanceof Long) {
            this.className = Long.class.getName();
        } else if (data instanceof Double) {
            this.className = Double.class.getName();
        } else if (data instanceof Float) {
            this.className = Float.class.getName();
        } else if (data instanceof Boolean) {
            this.className = Boolean.class.getName();
        } else if (data != null) {
            this.className = data.getClass().getName();
        }
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
        if(data instanceof Integer) {
            return (int)data;
        }
        return Integer.parseInt(String.valueOf(data));
    }

    @JsonIgnore
    public long getDataAsLong() {
        if(data instanceof Long) {
            return (long)data;
        }
        return Long.parseLong(String.valueOf(data));
    }

    @JsonIgnore
    public String getDataAsString() { return (String) data; }

    @JsonIgnore
    public String getDataAsJson() {return JacksonUtils.obj2json(data);}

    //只有GET防止改写className
    public String getClassName() { return className; }

    //只有GET防止改写data
    public Object getData() { return data; }
}
