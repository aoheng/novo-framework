package com.novo.commons.support.organization.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 2020-08-21 11:08:51
 */
public class AppOrgDomainVo implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String MY_FIELD_ID = "id";
    public static final String MY_FIELD_ORG_ID = "orgId";
    public static final String MY_FIELD_ORG_NAME = "orgName";
    public static final String MY_FIELD_DOMAIN_URL = "domainUrl";
    public static final String MY_FIELD_SYSTEM_TYPE = "systemType";
    public static final String MY_FIELD_PUBLISH_STATUS = "publishStatus";
    public static final String MY_FIELD_CREATE_TIME = "createTime";
    public static final String MY_FIELD_UPDATE_TIME = "updateTime";
    public static final String MY_FIELD_ORG_CODE = "orgCode";

    private Long id;
    /**
     * 组织id
     */
    private Long orgId;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 域名地址
     */
    private String domainUrl;
    /**
     * C 端类型
     */
    private Integer cType;
    /**
     * 系统类型
     */
    private Integer systemType;
    /**
     * APP最新版本号
     */
    private String appVersion;
    /**
     * 描述说明
     */
    private String remark;
    /**
     * 发布时间
     */
    private Date publishTime;
    /**
     * 源码包创建时间
     */
    private Date dealTime;
    /**
     * 下载链接
     */
    private String downloadUrl;
    /**
     * 发布状态
     */
    private Integer publishStatus;

    private String orgCode;

    private Date createTime;

    public Integer getCType() {
        return cType;
    }

    public void setCType(Integer cType) {
        this.cType = cType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

	
