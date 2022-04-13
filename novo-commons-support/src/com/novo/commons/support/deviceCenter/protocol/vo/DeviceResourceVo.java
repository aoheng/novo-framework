package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/1/11
 */
public class DeviceResourceVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String orgCode;

    /**
     * 设备编号
     */
    private String deviceSn;

    /**
     * 引用id
     */
    private Long targetId;

    /**
     * 资源类型(0:续费二维码)
     */
    private Integer resourceType;

    /**
     * 下载地址
     */
    private String url;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件扩展名
     */
    private String extName;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 校验类型（0：CRC32 1：MD5）
     */
    private Integer checkType;

    /**
     * 校验码
     */
    private String checkCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
