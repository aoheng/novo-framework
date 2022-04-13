package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;
import java.util.Date;


public class DeviceQrcodeListVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String deviceSn;//设备编号
    private String deviceQrcode;//设备二维码
    private Integer printStatus;//打印状态
    private String orgCode;
    private Long creatorId;
    private Date createTime;
    private Date updateTime;
    private String deviceName;//产品名称
    private String typeName;//设备类型
    private String model;//型号
    private String payUrl;//系统参数


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getDeviceQrcode() {
        return deviceQrcode;
    }

    public void setDeviceQrcode(String deviceQrcode) {
        this.deviceQrcode = deviceQrcode;
    }

    public Integer getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(Integer printStatus) {
        this.printStatus = printStatus;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
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

    public String getDeviceName() { return deviceName;}

    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }

    public String getTypeName() { return typeName; }

    public void setTypeName(String typeName) {  this.typeName = typeName;  }

    public String getModel() {  return model; }

    public void setModel(String model) { this.model = model; }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }
}
