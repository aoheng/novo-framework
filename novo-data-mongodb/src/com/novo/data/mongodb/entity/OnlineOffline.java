package com.novo.data.mongodb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Aoheng on 2021/01/30 2020/01/15.
 */
public class OnlineOffline extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 1:上线 2：离线 */
    private Integer type;
    private String clientId;
    private String username;
    private String ip;
    private Boolean cleanSession;
    private Integer protocol;
    private Integer connack;
    private Long ts;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date tt;
    private String offReason;

    public Integer getType() { return type; }

    public void setType(Integer type) { this.type = type; }

    public String getClientId() { return clientId; }

    public void setClientId(String clientId) { this.clientId = clientId; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getIp() { return ip; }

    public void setIp(String ip) { this.ip = ip; }

    public Boolean getCleanSession() { return cleanSession; }

    public void setCleanSession(Boolean cleanSession) { this.cleanSession = cleanSession; }

    public Integer getProtocol() { return protocol; }

    public void setProtocol(Integer protocol) { this.protocol = protocol; }

    public Integer getConnack() { return connack; }

    public void setConnack(Integer connack) { this.connack = connack; }

    public Long getTs() { return ts; }

    public void setTs(Long ts) { this.ts = ts; }

    public Date getTt() { return tt; }

    public void setTt(Date tt) { this.tt = tt; }

    public String getOffReason() { return offReason; }

    public void setOffReason(String offReason) { this.offReason = offReason; }
}
