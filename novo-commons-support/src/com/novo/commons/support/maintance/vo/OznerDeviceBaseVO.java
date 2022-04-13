package com.novo.commons.support.maintance.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Aoheng on 2020/05/22.
 */
public class OznerDeviceBaseVO {

    /** 龙头 */
    List<String> spigots = new ArrayList<>();
    @JsonIgnore
    private Long id;
    private String deviceId;
    private String imeiCode;
    private String ccid;
    private String deviceName;
    private String model;
    @JsonIgnore
    private String password;
    private String latitude;
    private String longitude;
    @JsonIgnore
    private String orgCode;
    private String mainFirm;
    private String ctrlFirm;
    private String gsmFirm;
    private String consumabelFirm;
    @JsonIgnore
    private String deviceDesc;
    @JsonIgnore
    private String areaCode;
    @JsonIgnore
    private Date createTime;
    private Integer productTypeCode;
    private Integer productCode;
    private Boolean onlineStatus;
    @JsonIgnore
    private Date expireTimeDate;
    /** 到期状态（0-未到期 1-已到期） */
    private String expireStatus;
    /** 到期时间 */
    private Date expireTime;
    //    @JsonIgnore
    private Date startServeTime;
    private Date rechargeTime;
    /** 水值下发状态，0，未下发，1，已下发，2，下发异常 */
    private Integer status;
    /** 已服务天数 */
    private Integer serveNum;
    /** 剩余服务天数 */
    private Integer lastServeNum;

    /** 动态数据 */
    private Object dynamicData;

    public Object getDynamicData() { return dynamicData; }

    public void setDynamicData(Object dynamicData) { this.dynamicData = dynamicData; }

    public List<String> getSpigots() { return spigots; }

    public void setSpigots(List<String> spigots) { this.spigots = spigots; }

    public String getDeviceId() { return deviceId; }

    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getCcid() { return ccid; }

    public void setCcid(String ccid) { this.ccid = ccid; }

    public String getDeviceName() { return deviceName; }

    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }

    public String getOrgCode() { return orgCode; }

    public void setOrgCode(String orgCode) { this.orgCode = orgCode; }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getMainFirm() { return mainFirm; }

    public void setMainFirm(String mainFirm) { this.mainFirm = mainFirm; }

    public String getCtrlFirm() { return ctrlFirm; }

    public void setCtrlFirm(String ctrlFirm) { this.ctrlFirm = ctrlFirm; }

    public String getGsmFirm() { return gsmFirm; }

    public void setGsmFirm(String gsmFirm) { this.gsmFirm = gsmFirm; }

    public String getConsumabelFirm() { return consumabelFirm; }

    public void setConsumabelFirm(String consumabelFirm) { this.consumabelFirm = consumabelFirm; }

    public Integer getProductTypeCode() { return productTypeCode; }

    public void setProductTypeCode(Integer productTypeCode) { this.productTypeCode = productTypeCode; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public Boolean getOnlineStatus() { return onlineStatus; }

    public void setOnlineStatus(Boolean onlineStatus) { this.onlineStatus = onlineStatus; }

    public Date getExpireTimeDate() { return expireTimeDate; }

    public void setExpireTimeDate(Date expireTimeDate) { this.expireTimeDate = expireTimeDate; }

    public String getExpireStatus() { return expireStatus; }

    public void setExpireStatus(String expireStatus) { this.expireStatus = expireStatus; }


    public Date getStartServeTime() { return startServeTime; }

    public void setStartServeTime(Date startServeTime) { this.startServeTime = startServeTime; }

    public Integer getServeNum() { return serveNum; }

    public void setServeNum(Integer serveNum) { this.serveNum = serveNum; }

    public Integer getLastServeNum() { return lastServeNum; }

    public void setLastServeNum(Integer lastServeNum) { this.lastServeNum = lastServeNum; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
}
