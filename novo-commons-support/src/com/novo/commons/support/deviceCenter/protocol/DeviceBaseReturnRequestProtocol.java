package com.novo.commons.support.deviceCenter.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

public class DeviceBaseReturnRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

	public static final String DEVICE_SN = "deviceSn";

	public static final Integer RETURN_STATUS_CHANGE_IMEI = 0;

	public static final Integer RETURN_STATUS_RETURN_DEVICE = 1;

    private Integer returnStatus;

    private String password;

    private String model;

    private Long deviceStatus;

    private String deviceName;

    private String deivceDesc;

    private String imeiCode;

    private String deviceSn;

    private String protocolVer;

    private String ccid;

    private String latitude;

    private String longitude;

    private String areaCode;
    
    private Integer productCode;

    /** 通讯协议id */
    private Long protocolId;
    /** 重置滤芯类型集合 */
    private List<String> ppfTypeList;
    /** 产品名称 */
    private String productName;
    /** 分页起始索引 */
    private Integer startNum;

    private String typeName;

    private Integer printStatus;//打印状态

    private Boolean pageable;//是否分页


    public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Long deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeivceDesc() {
        return deivceDesc;
    }

    public void setDeivceDesc(String deivceDesc) {
        this.deivceDesc = deivceDesc;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getProtocolVer() {
		return protocolVer;
	}

	public void setProtocolVer(String protocolVer) {
		this.protocolVer = protocolVer;
	}

	public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
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

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public List<String> getPpfTypeList() {
        return ppfTypeList;
    }

    public void setPpfTypeList(List<String> ppfTypeList) {
        this.ppfTypeList = ppfTypeList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public String getTypeName() {  return typeName; }

    public void setTypeName(String typeName) { this.typeName = typeName; }

    public Integer getPrintStatus() { return printStatus; }

    public void setPrintStatus(Integer printStatus) { this.printStatus = printStatus; }

    public Boolean getPageable() { return pageable;  }

    public void setPageable(Boolean pageable) { this.pageable = pageable;  }

    public Integer getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Integer returnStatus) {
        this.returnStatus = returnStatus;
    }
}
