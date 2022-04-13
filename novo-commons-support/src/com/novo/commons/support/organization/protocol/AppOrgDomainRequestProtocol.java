package com.novo.commons.support.organization.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;
import com.novo.framework.core.protocol.PaginationResponseProtocol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 2020-08-21 11:08:51
 */
public class AppOrgDomainRequestProtocol extends PaginationRequestProtocol {

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
     * 新增接收系统类型
     */
    private String appType;
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

    private List<Long> ids;

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Integer getCType() {
        return cType;
    }

    public void setCType(Integer cType) {
        this.cType = cType;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
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
}

	
