package com.novo.commons.support.deviceCenter.mqtt.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 改变连接服务器VO
 */
public class ChangeServerVO {

    private String imeiCode;
    private String host;
    private Long port;

    public ChangeServerVO() {

    }

    public ChangeServerVO(String imeiCode, String host, Long port) {
        this.imeiCode = imeiCode;
        this.host = host;
        this.port = port;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }
}
