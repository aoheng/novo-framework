package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author RaoYongBin on 2020/5/30
 */
public class OnlineOfflineVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @FieldDetail(name = "clientId",fieldName = "clientId")
    private String clientId;

    @FieldDetail(name = "IP",fieldName = "ip")
    private String ip;

    /**
     * 1:上线 2：离线
     */
    @FieldDetail(name = "上线/下线",fieldName = "type")
    private Integer type;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上线时间",fieldName = "onlineTime")
    private Date onlineTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "下线时间",fieldName = "offlineTime")
    private Date offlineTime;

    @FieldDetail(name = "下线原因",fieldName = "offReason")
    private String offReason;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getOffReason() {
        return offReason;
    }

    public void setOffReason(String offReason) {
        this.offReason = offReason;
    }
}
