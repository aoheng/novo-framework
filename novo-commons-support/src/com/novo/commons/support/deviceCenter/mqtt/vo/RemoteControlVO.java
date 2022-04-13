package com.novo.commons.support.deviceCenter.mqtt.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 远程控制VO
 */
public class RemoteControlVO {

    private String imeiCode;
    private String type;
    private Object value;

    public Object getValue() { return value; }

    public void setValue(Object value) { this.value = value; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }
}
