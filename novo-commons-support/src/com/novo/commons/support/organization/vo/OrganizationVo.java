package com.novo.commons.support.organization.vo;

import com.novo.commons.enums.OrgStatus;
import com.novo.commons.enums.OrgType;
import com.novo.commons.support.resources.vo.SysconfigVo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 20:39 2020/1/17
 */
public class OrganizationVo implements Serializable {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    private Long id;

    private String orgName;

    private String address;

    private String representative;

    private String telNumber;

    private Long parentId;

    private String parentName;

    private OrgType orgType;

    private OrgStatus orgStatus;

    private String orgCode;

    private Date createTime;

    private Long modifierId;//修改者Id

    private String orgDeviceCode;

    private LinkedList<Long> ids;

    private LinkedList<String> orgCodes;

    private List<OrganizationVo> children;

    /**
     * 执行环节
     */
    private String linkName;

    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;

    /**
     * 系统参数集合
     */
    private List<SysconfigVo> sysconfigList;

    /**
     * 向导id
     */
    private Long guideId;


    //*****************************************************************************************************


    public Long getGuideId() {
        return guideId;
    }

    public void setGuideId(Long guideId) {
        this.guideId = guideId;
    }

    public List<SysconfigVo> getSysconfigList() {
        return sysconfigList;
    }

    public void setSysconfigList(List<SysconfigVo> sysconfigList) {
        this.sysconfigList = sysconfigList;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * 组织logo
     */
    private String logo;

    /**
     * 组织域名
     */
    private String realm;

    /**
     * 登录页logo
     */
    private String loginLogo;

    /**
     * 登录页背景
     */
    private String loginBackgroud;

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getLoginLogo() {
        return loginLogo;
    }

    public void setLoginLogo(String loginLogo) {
        this.loginLogo = loginLogo;
    }

    public String getLoginBackgroud() {
        return loginBackgroud;
    }

    public void setLoginBackgroud(String loginBackgroud) {
        this.loginBackgroud = loginBackgroud;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public LinkedList<String> getOrgCodes() {
        return orgCodes;
    }

    public void setOrgCodes(LinkedList<String> orgCodes) {
        this.orgCodes = orgCodes;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<OrganizationVo> getChildren() {
        return children;
    }

    public void setChildren(List<OrganizationVo> children) {
        this.children = children;
    }

    public LinkedList<Long> getIds() {
        return ids;
    }

    public void setIds(LinkedList<Long> ids) {
        this.ids = ids;
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

    public String getOrgDeviceCode() {
        return orgDeviceCode;
    }

    public void setOrgDeviceCode(String orgDeviceCode) {
        this.orgDeviceCode = orgDeviceCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }

    public OrgStatus getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(OrgStatus orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }


}

