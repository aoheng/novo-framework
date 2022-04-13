package com.novo.commons.support.deviceCenter.vo;


import java.io.Serializable;

/**
 * @author MickeyChen
 * @date 2020/1/24
 */
public class OnlineStatusRabbitVO implements Serializable {

    private Integer serverSeed;
    private Integer onlineStatus;

    private MqttClientInfoVO mqttClientInfoVO;

    public OnlineStatusRabbitVO(Integer onlineStatus, Integer serverSeed, MqttClientInfoVO mqttClientInfoVO) {
        this.serverSeed = serverSeed;
        this.onlineStatus = onlineStatus;
        this.mqttClientInfoVO = mqttClientInfoVO;
    }

    public OnlineStatusRabbitVO() {
    }

    public Integer getServerSeed() {
        return serverSeed;
    }

    public void setServerSeed(Integer serverSeed) {
        this.serverSeed = serverSeed;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public MqttClientInfoVO getMqttClientInfoVO() {
        return mqttClientInfoVO;
    }

    public void setMqttClientInfoVO(MqttClientInfoVO mqttClientInfoVO) {
        this.mqttClientInfoVO = mqttClientInfoVO;
    }
}
