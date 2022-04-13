package com.novo.commons.support.system.protocol.vo;

import com.novo.commons.enums.OrgStatus;
import com.novo.commons.enums.UserType;
import com.novo.framework.core.protocol.DefinitionDataScope;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserVo implements Serializable {

    private Long id;
    /**
     * 组织id
     */
    private Long orgId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 登录用户名
     */
    private String loginName;
    /**
     * 工号
     */
    private String jobNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String mobileNumber;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 身份证码
     */
    private String idCard;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别
     */
    private String gender;
    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;
    /**
     * 区域码
     */
    private String areaCode;
    /**
     * 用户类型
     */
    private UserType userType;


    /**
     * 用户数据权限类型
     */
    private DefinitionDataScope dataScope;


    private Boolean dataStatus;

    /**
     * 查询用户是连同角色一同查询
     */
    private List roleId;

    /**
     * 部门id
     */
    private Long deptmentId;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织码
     */
    private String orgCode;

    /**
     * 组织状态
     */
    private OrgStatus orgDataStatus;

    /**
     * 平台状态
     */
    private Boolean platDataStatus;


    /**
     * 用户id集合
     */
    private List<Long> userIds;

    /**
     * 部门名称
     */
    private String deptmentName;

    /**
     * 创建人姓名
     */
    private String creatorName;

    /**
     * 创建人id
     */
    private Long creatorId;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    //*****************************************************************************************************


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

    public String getCreatorName() {
        return creatorName;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getDeptmentName() {
        return deptmentName;
    }

    public void setDeptmentName(String deptmentName) {
        this.deptmentName = deptmentName;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public Boolean getPlatDataStatus() {
        return platDataStatus;
    }

    public void setPlatDataStatus(Boolean platDataStatus) {
        this.platDataStatus = platDataStatus;
    }

    public OrgStatus getOrgDataStatus() {
        return orgDataStatus;
    }

    public void setOrgDataStatus(OrgStatus orgDataStatus) {
        this.orgDataStatus = orgDataStatus;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Long getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(Long deptmentId) {
        this.deptmentId = deptmentId;
    }

    public List getRoleId() {
        return roleId;
    }

    public void setRoleId(List roleId) {
        this.roleId = roleId;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public DefinitionDataScope getDataScope() {
        return dataScope;
    }

    public void setDataScope(DefinitionDataScope dataScope) {
        this.dataScope = dataScope;
    }

}
