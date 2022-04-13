package com.novo.commons.support.deviceCenter.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author aoheng on 2021/01/315.
 */
public class DeviceVO implements Serializable {

    private Long id;
    /** 设备生产管理号 */
    private String deviceSn;
    /** 设备名称 */
    private String deviceName;
    /** IMEI */
    private String imeiCode;
    /** 产品代码 */
    private Integer productCode;
    /** 机器型号 */
    private String model;
    /** CCID */
    private String ccid;
    /** 通讯协议版本 */
    private String protocolVer;
    /** 经纬度 */
    private String latitude;
    private String longitude;
    /** 最后一次在线时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date lastOnlineTime;
    /** 在线状态 */
    private Integer onlineStatus;
    /** 通讯协议id */
    private Long protocolId;

    private String mainFirm;
    private String mainSn;

    public String getMainFirm() { return mainFirm; }

    public void setMainFirm(String mainFirm) { this.mainFirm = mainFirm; }

    public String getMainSn() { return mainSn; }

    public void setMainSn(String mainSn) { this.mainSn = mainSn; }

    /*********************** T1 ************************/
    /** 鉴权码(随机数生成，0-9加a-z) */
    private String akey;
    private String msgId;
    private String msgTime;
    private String msgNo;
    private String msgAttr;
    private String msgBody;
    private String checksum;
    private Serializable data;//承载数据体
    private Map<String, Object> msgBodyMap;
    private String flgValue;

    public String getAkey() { return akey; }

    public void setAkey(String akey) { this.akey = akey; }

    public String getMsgId() { return msgId; }

    public void setMsgId(String msgId) { this.msgId = msgId; }

    public String getMsgTime() { return msgTime; }

    public void setMsgTime(String msgTime) { this.msgTime = msgTime; }

    public String getMsgNo() { return msgNo; }

    public void setMsgNo(String msgNo) { this.msgNo = msgNo; }

    public String getMsgAttr() { return msgAttr; }

    public void setMsgAttr(String msgAttr) { this.msgAttr = msgAttr; }

    public String getMsgBody() { return msgBody; }

    public void setMsgBody(String msgBody) { this.msgBody = msgBody; }

    public String getChecksum() { return checksum; }

    public void setChecksum(String checksum) { this.checksum = checksum; }

    public Serializable getData() { return data; }

    public void setData(Serializable data) { this.data = data; }

    public Map<String, Object> getMsgBodyMap() { return msgBodyMap; }

    public void setMsgBodyMap(Map<String, Object> msgBodyMap) { this.msgBodyMap = msgBodyMap; }

    public String getFlgValue() { return flgValue; }

    public void setFlgValue(String flgValue) { this.flgValue = flgValue; }

    /*****************************************************************/

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDeviceSn() { return deviceSn; }

    public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }

    public String getDeviceName() { return deviceName; }

    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getCcid() { return ccid; }

    public void setCcid(String ccid) { this.ccid = ccid; }

    public String getProtocolVer() { return protocolVer; }

    public void setProtocolVer(String protocolVer) { this.protocolVer = protocolVer; }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }

    public Date getLastOnlineTime() { return lastOnlineTime; }

    public void setLastOnlineTime(Date lastOnlineTime) { this.lastOnlineTime = lastOnlineTime; }

    public Integer getOnlineStatus() { return onlineStatus; }

    public void setOnlineStatus(Integer onlineStatus) { this.onlineStatus = onlineStatus; }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }
}
