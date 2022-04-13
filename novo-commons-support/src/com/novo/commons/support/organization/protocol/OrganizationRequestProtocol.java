package com.novo.commons.support.organization.protocol;

import com.novo.commons.enums.OrgStatus;
import com.novo.commons.enums.OrgType;
import com.novo.commons.support.resources.vo.SysconfigVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @Author: duanwenyou
 * @Description: 组织协议
 * @Date: Created in 15:16 2020/1/9
 */
public class OrganizationRequestProtocol extends PaginationRequestProtocol{

    /**
     * 初始化,默认parentId
     */
    public static Long ROOT_PARENT_ID = -1L;

    public static final String COMPANY_ORG_TYPE = "公司";

    public static final String DEPT_ORG_TYPE = "部门";

    private Long id;

    private String orgName;

    private String address;

    private String representative;

    private String telNumber;

    private Long parentId;

    private OrgType orgType;

    private String orgCode;

    private OrgStatus orgStatus;

    private Long modifierId;//修改者Id

    private String orgDeviceCode;

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

    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;


    /**
     * 系统参数集合
     */
    private List<SysconfigVo> sysconfigList;

    //private String sessionId;

    //*****************************************************************************************************


    @Override
    public String getSessionId() {
        return sessionId;
    }

    @Override
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgDeviceCode() {
        return orgDeviceCode;
    }

    public void setOrgDeviceCode(String orgDeviceCode) {
        this.orgDeviceCode = orgDeviceCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
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
