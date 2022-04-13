package com.novo.commons.support.deviceCenter.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @author Aoheng on 2020/12/19.
 */
public class FirmwareVO {

    /** 产品代码 */
    private Integer productCode;
    /** 设备类型 */
    private Integer deviceType;
    /** 设备型号 */
    private String model;
    /** 设备通讯协议类型 */
    private String protocolVer;
    /** 更新部件（0：通讯主板 1：控制版  2：显示板） */
    private Integer firmwareType;
    /** 校验方式（0：CRC32 1：MD5） */
    private Integer checkType;
    /** 下载方式（0：FTP 1：HTTP） */
    private Integer downloadType;
    /** ftp路径 */
    private String ftpPath;
    /** 固件文件名1 */
    private String firmwareName1;
    /** 固件字节数组1 */
    @JsonIgnore
    private byte[] firmwareBytes1;
    /** 固件版本号1 */
    private String firmwareVer1;
    /** 固件大小1 */
    private Long firmwareSize1;
    /** 校验码1 */
    private String checkCode1;
    /** http下载地址1 */
    private String httpUrl1;
    /** 固件文件名2 */
    private String firmwareName2;
    /** 固件字节数组2 */
    @JsonIgnore
    private byte[] firmwareBytes2;
    /** 固件版本号2 */
    private String firmwareVer2;
    /** 固件大小2 */
    private Long firmwareSize2;
    /** 校验码2 */
    private String checkCode2;
    /** http下载地址2 */
    private String httpUrl2;
    /** 描述 */
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date updateTime;


    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public Integer getDeviceType() { return deviceType; }

    public void setDeviceType(Integer deviceType) { this.deviceType = deviceType; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getProtocolVer() { return protocolVer; }

    public void setProtocolVer(String protocolVer) { this.protocolVer = protocolVer; }

    public Integer getFirmwareType() { return firmwareType; }

    public void setFirmwareType(Integer firmwareType) { this.firmwareType = firmwareType; }

    public Integer getCheckType() { return checkType; }

    public void setCheckType(Integer checkType) { this.checkType = checkType; }

    public Integer getDownloadType() { return downloadType; }

    public void setDownloadType(Integer downloadType) { this.downloadType = downloadType; }

    public String getFtpPath() { return ftpPath; }

    public void setFtpPath(String ftpPath) { this.ftpPath = ftpPath; }

    public String getFirmwareName1() { return firmwareName1; }

    public void setFirmwareName1(String firmwareName1) { this.firmwareName1 = firmwareName1; }

    public byte[] getFirmwareBytes1() { return firmwareBytes1; }

    public void setFirmwareBytes1(byte[] firmwareBytes1) { this.firmwareBytes1 = firmwareBytes1; }

    public String getFirmwareVer1() { return firmwareVer1; }

    public void setFirmwareVer1(String firmwareVer1) { this.firmwareVer1 = firmwareVer1; }

    public Long getFirmwareSize1() { return firmwareSize1; }

    public void setFirmwareSize1(Long firmwareSize1) { this.firmwareSize1 = firmwareSize1; }

    public String getCheckCode1() { return checkCode1; }

    public void setCheckCode1(String checkCode1) { this.checkCode1 = checkCode1; }

    public String getHttpUrl1() { return httpUrl1; }

    public void setHttpUrl1(String httpUrl1) { this.httpUrl1 = httpUrl1; }

    public String getFirmwareName2() { return firmwareName2; }

    public void setFirmwareName2(String firmwareName2) { this.firmwareName2 = firmwareName2; }

    public byte[] getFirmwareBytes2() { return firmwareBytes2; }

    public void setFirmwareBytes2(byte[] firmwareBytes2) { this.firmwareBytes2 = firmwareBytes2; }

    public String getFirmwareVer2() { return firmwareVer2; }

    public void setFirmwareVer2(String firmwareVer2) { this.firmwareVer2 = firmwareVer2; }

    public Long getFirmwareSize2() { return firmwareSize2; }

    public void setFirmwareSize2(Long firmwareSize2) { this.firmwareSize2 = firmwareSize2; }

    public String getCheckCode2() { return checkCode2; }

    public void setCheckCode2(String checkCode2) { this.checkCode2 = checkCode2; }

    public String getHttpUrl2() { return httpUrl2; }

    public void setHttpUrl2(String httpUrl2) { this.httpUrl2 = httpUrl2; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Date getCreateTime() { return createTime; }

    public void setCreateTime(Date createTime) { this.createTime = createTime; }

    public Date getUpdateTime() { return updateTime; }

    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
}
