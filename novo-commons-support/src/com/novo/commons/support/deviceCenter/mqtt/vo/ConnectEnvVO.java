package com.novo.commons.support.deviceCenter.mqtt.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 接入环境VO
 **/
public class ConnectEnvVO {

    private String imeiCode;
    /** 0：测试环境 1：生产环境 */
    private Integer env;

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getEnv() { return env; }

    public void setEnv(Integer env) { this.env = env;}
}
