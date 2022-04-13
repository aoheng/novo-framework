package com.novo.commons.support.maintance.vo;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_b_ByteArraySwitchFlag;

/**
 * @author MickeyChen
 * @date 2020/01/11
 */
@Deprecated
public class OznerDeviceVo {

	private String deviceId;
    private String imeiCode;
    private String ccid;
    private String deviceName;
    @JsonIgnore
    private String protocolId;
    private String model;
	@JsonIgnore
    private String password;
	@JsonIgnore
    private String deviceStatus;
    private String latitude;
    private String longitude;
	@JsonIgnore
    private String areaCode;
	@JsonIgnore
    private String deivceDesc;
	@JsonIgnore
    private String orgCode;
    @JsonIgnore
    private String hardwareFirm;
    @JsonIgnore
    private String hardwareSn;
    @JsonIgnore
    private Integer hardwareType;
    private String protContent;
    private Long protType;
    private Long protVersion;
    @JsonIgnore
    private Long id;
    
    List<String> spigots;
    private String mainFirm;
    private String ctrlFirm;
    private String gsmFirm;
    private String consumabelFirm;

    private Boolean onlineStatus;
	@JsonIgnore
	private Integer proTypeCode;
	@JsonIgnore
	private Integer proCode;

	private Integer signal;

	private String errorCode;
	@JsonIgnore
	private Date expireTimeDate;

	private String expireStatus;

    private String expireTime;
	@JsonIgnore
    @Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createTime;
	@JsonIgnore
	@Column(name = "update_time")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updateTime;

	@JsonIgnore
	private Date startServeTime;

	private Integer serveNum;

	private Integer lastServeNum;

    private Integer waterStatus;


	/** 开关位 */
	private String switchFlag;
	/** 出水口 */
	private Integer outlet;
	/** 出水量（单位/毫升） */
	private Long flowWaterConsumption;
	/** 用户卡号 */
	private Long cardNum;
	/** 用户卡剩余水量（单位/毫升） */
	private Long cardRemain;
	/** 用户卡充值时间 */
	private Date cardRechargeTime;

	public String getSwitchFlag() {
		return switchFlag;
	}

	public void setSwitchFlag(String switchFlag) {
		this.switchFlag = switchFlag;
	}

	public Integer getOutlet() {
		return outlet;
	}

	public void setOutlet(Integer outlet) {
		this.outlet = outlet;
	}

	public Long getFlowWaterConsumption() {
		return flowWaterConsumption;
	}

	public void setFlowWaterConsumption(Long flowWaterConsumption) {
		this.flowWaterConsumption = flowWaterConsumption;
	}

	public Long getCardNum() {
		return cardNum;
	}

	public void setCardNum(Long cardNum) {
		this.cardNum = cardNum;
	}

	public Long getCardRemain() {
		return cardRemain;
	}

	public void setCardRemain(Long cardRemain) {
		this.cardRemain = cardRemain;
	}

	public Date getCardRechargeTime() {
		return cardRechargeTime;
	}

	public void setCardRechargeTime(Date cardRechargeTime) {
		this.cardRechargeTime = cardRechargeTime;
	}

	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getImeiCode() {
		return imeiCode;
	}
	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}
	public String getCcid() {
		return ccid;
	}
	public void setCcid(String ccid) {
		this.ccid = ccid;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getProtocolId() {
		return protocolId;
	}
	public void setProtocolId(String protocolId) {
		this.protocolId = protocolId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeviceStatus() {
		return deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getDeivceDesc() {
		return deivceDesc;
	}
	public void setDeivceDesc(String deivceDesc) {
		this.deivceDesc = deivceDesc;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getHardwareFirm() {
		return hardwareFirm;
	}
	public void setHardwareFirm(String hardwareFirm) {
		this.hardwareFirm = hardwareFirm;
	}
	public String getHardwareSn() {
		return hardwareSn;
	}
	public void setHardwareSn(String hardwareSn) {
		this.hardwareSn = hardwareSn;
	}
	public Integer getHardwareType() {
		return hardwareType;
	}
	public void setHardwareType(Integer hardwareType) {
		this.hardwareType = hardwareType;
	}
	public String getProtContent() {
		return protContent;
	}
	public void setProtContent(String protContent) {
		this.protContent = protContent;
	}
	public Long getProtType() {
		return protType;
	}
	public void setProtType(Long protType) {
		this.protType = protType;
	}
	public Long getProtVersion() {
		return protVersion;
	}
	public void setProtVersion(Long protVersion) {
		this.protVersion = protVersion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<String> getSpigots() {
		return spigots;
	}
	public void setSpigots(List<String> spigots) {
		this.spigots = spigots;
	}
	public String getMainFirm() {
		return mainFirm;
	}
	public void setMainFirm(String mainFirm) {
		this.mainFirm = mainFirm;
	}
	public String getCtrlFirm() {
		return ctrlFirm;
	}
	public void setCtrlFirm(String ctrlFirm) {
		this.ctrlFirm = ctrlFirm;
	}
	public String getGsmFirm() {
		return gsmFirm;
	}
	public void setGsmFirm(String gsmFirm) {
		this.gsmFirm = gsmFirm;
	}
	public String getConsumabelFirm() {
		return consumabelFirm;
	}
	public void setConsumabelFirm(String consumabelFirm) {
		this.consumabelFirm = consumabelFirm;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(Boolean onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public Integer getProTypeCode() {
		return proTypeCode;
	}

	public void setProTypeCode(Integer proTypeCode) {
		this.proTypeCode = proTypeCode;
	}

	public Integer getSignal() {
		return signal;
	}

	public void setSignal(Integer signal) {
		this.signal = signal;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public String getExpireStatus() {
		return expireStatus;
	}

	public void setExpireStatus(String expireStatus) {
		this.expireStatus = expireStatus;
	}

	public Date getStartServeTime() {
		return startServeTime;
	}

	public void setStartServeTime(Date startServeTime) {
		this.startServeTime = startServeTime;
	}

	public Integer getServeNum() {
		return serveNum;
	}

	public void setServeNum(Integer serveNum) {
		this.serveNum = serveNum;
	}

	public Integer getLastServeNum() {
		return lastServeNum;
	}

	public void setLastServeNum(Integer lastServeNum) {
		this.lastServeNum = lastServeNum;
	}

	public Date getExpireTimeDate() {
		return expireTimeDate;
	}

	public void setExpireTimeDate(Date expireTimeDate) {
		this.expireTimeDate = expireTimeDate;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

    public Integer getWaterStatus() {
        return waterStatus;
    }

    public void setWaterStatus(Integer waterStatus) {
        this.waterStatus = waterStatus;
    }

	public Integer getProCode() {
		return proCode;
	}

	public void setProCode(Integer proCode) {
		this.proCode = proCode;
	}
}
