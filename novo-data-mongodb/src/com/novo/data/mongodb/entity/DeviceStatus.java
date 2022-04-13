package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/30 2020/09/07.
 */
public class DeviceStatus extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String latitude;
    private String longitude;
    private Integer temperature;
    private Integer tds;
    private Integer batPercentage;

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }

    public Integer getTemperature() { return temperature; }

    public void setTemperature(Integer temperature) { this.temperature = temperature; }

    public Integer getTds() { return tds; }

    public void setTds(Integer tds) { this.tds = tds; }

    public Integer getBatPercentage() { return batPercentage; }

    public void setBatPercentage(Integer batPercentage) { this.batPercentage = batPercentage; }
}
