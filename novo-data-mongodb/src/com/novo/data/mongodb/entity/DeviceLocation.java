package com.novo.data.mongodb.entity;


import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/30 2020/01/15.
 */
public class DeviceLocation extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 类型：0-经纬度信息 1-基站信息 */
    private Integer locationType;
    private Long longitude;
    private Long latitude;
    private Integer stationCount;
    private Integer mcc;
    private Integer mnc;
    private Integer rxlev;
    private Integer lac;
    private Integer cellid;

    public Integer getLocationType() { return locationType; }

    public void setLocationType(Integer locationType) { this.locationType = locationType; }

    public Long getLongitude() { return longitude; }

    public void setLongitude(Long longitude) { this.longitude = longitude; }

    public Long getLatitude() { return latitude; }

    public void setLatitude(Long latitude) { this.latitude = latitude; }

    public Integer getStationCount() { return stationCount; }

    public void setStationCount(Integer stationCount) { this.stationCount = stationCount; }

    public Integer getMcc() { return mcc; }

    public void setMcc(Integer mcc) { this.mcc = mcc; }

    public Integer getMnc() { return mnc; }

    public void setMnc(Integer mnc) { this.mnc = mnc; }

    public Integer getRxlev() { return rxlev; }

    public void setRxlev(Integer rxlev) { this.rxlev = rxlev; }

    public Integer getLac() { return lac; }

    public void setLac(Integer lac) { this.lac = lac; }

    public Integer getCellid() { return cellid; }

    public void setCellid(Integer cellid) { this.cellid = cellid; }
}
