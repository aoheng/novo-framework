package com.novo.commons.support.deviceCenter.mqtt.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 测试状态VO
 **/
public class TestStatusVO {

    private String imeiCode;
    private Integer status;

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
