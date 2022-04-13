package com.novo.commons.support.organization.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 2020-08-21 11:08:51
 */
public class AppVersionVo implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String MY_FIELD_ID = "id";
    public static final String MY_FIELD_APP_VERSION = "appVersion";
    public static final String MY_FIELD_APP_NAME = "appName";
    public static final String MY_FIELD_APP_SYSTEM = "appSystem";
    public static final String MY_FIELD_DOWNLOAD_LINK = "downloadLink";
    public static final String MY_FIELD_UPDATE_STATUS = "updateStatus";
    public static final String MY_FIELD_CREATE_TIME = "createTime";
    public static final String MY_FIELD_UPDATE_TIME = "updateTime";
    public static final String MY_FIELD_ORG_CODE = "orgCode";

    private Long id;
    /**
     * 版本号
     */
    private Long appVersion;
    /**
     * 版本名称
     */
    private String appName;
    /**
     * 系统类型
     */
    private Integer appSystem;
    /**
     * APK链接地址
     */
    private String downloadLink;
    /**
     * 强制更新(0：否，1：是)
     */
    private Integer updateStatus;
    /**
     * 描述
     */
    private String remark;

    private String orgCode;

    private Date createTime;

    private Date updateTime;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Long appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getAppSystem() {
        return appSystem;
    }

    public void setAppSystem(Integer appSystem) {
        this.appSystem = appSystem;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public Integer getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}

	
