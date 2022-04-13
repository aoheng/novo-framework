package com.novo.commons.support.organization.protocol;

import java.util.List;

import com.novo.commons.support.app.AppBase;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 2020-08-21 11:08:51
 */
public class AppVersionRequestProtocol extends PaginationRequestProtocol {

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

    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
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
}

	
