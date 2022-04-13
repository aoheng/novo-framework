package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;


public class DeviceInterfaceVo implements Serializable {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    private Long id;

    private String inteDesc;

    private String inteName;

    private Long inteType;

    private String token;
    private String topic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInteDesc() {
        return inteDesc;
    }

    public void setInteDesc(String inteDesc) {
        this.inteDesc = inteDesc;
    }

    public String getInteName() {
        return inteName;
    }

    public void setInteName(String inteName) {
        this.inteName = inteName;
    }

    public Long getInteType() {
        return inteType;
    }

    public void setInteType(Long inteType) {
        this.inteType = inteType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


}
