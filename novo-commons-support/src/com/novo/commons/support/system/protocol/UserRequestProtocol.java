package com.novo.commons.support.system.protocol;

import com.novo.commons.enums.UserType;
import com.novo.commons.support.system.protocol.vo.UserVo;
import com.novo.framework.core.protocol.DefinitionDataScope;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.Date;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO 用户请求协议
 * @date created in 2020/1/14 22:31
 **/

public class UserRequestProtocol extends PaginationRequestProtocol {


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
     * 旧密码
     */
    private String oldPassword;

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


    private UserVo vo;
    /**
     * 部门id(组织id)
     */
    private Long deptmentId;


    /**
     * 用户和角色关系
     */
    private List<Long> roleId;


    private String orgCode;


    private String platformCode;


    private Boolean dataStatus;

    /**
     * 用户id集合
     */
    private List<Long> userIds;

    private Integer dataType;

    private  String orgName;


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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public Integer getDataType() {
		return dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public List<Long> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Long> roleId) {
        this.roleId = roleId;
    }

    public Long getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(Long deptmentId) {
        this.deptmentId = deptmentId;
    }

    public UserVo getVo() {
        return vo;
    }

    public void setVo(UserVo vo) {
        this.vo = vo;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
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

    @Override
    public DefinitionDataScope getDataScope() {
        return dataScope;
    }

    @Override
    public void setDataScope(DefinitionDataScope dataScope) {
        this.dataScope = dataScope;
    }
}
