package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.JacksonUtils;

import java.util.Map;

/**
 * @author Aoheng on 2021/01/31.
 */
public class DeviceWarning {

    private String imeiCode;
    private String type;
    private Object data;

    public DeviceWarning() {

    }

    public DeviceWarning(String imeiCode, String warningType) {
        type = warningType;
        this.imeiCode = imeiCode;
    }

    public DeviceWarning(String imeiCode, String warningType, Object data) {
        type = warningType;
        this.imeiCode = imeiCode;
        this.data = data;
    }

    public <T> T getData(Class<T> clazz) {
        if (data == null)
            return null;

        if (data instanceof Map)
            return JacksonUtils.map2pojo((Map) data, clazz);

        try {
            return JacksonUtils.obj2pojo(data, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "imeiCode='" + imeiCode + '\'' +
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
}
