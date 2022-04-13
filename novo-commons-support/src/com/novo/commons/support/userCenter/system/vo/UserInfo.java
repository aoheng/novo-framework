package com.novo.commons.support.userCenter.system.vo;

import com.novo.commons.enums.UserType;
import com.novo.commons.support.organization.vo.OrganizationVo;
import com.novo.commons.support.resources.vo.ResourcesTree;
import com.novo.framework.core.protocol.DefinitionDataScope;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/***
 * 用户登录响应信息
 * @ClassName: UserLoginInfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年1月30日 下午2:48:01
 *
 */
public class UserInfo implements Serializable {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    
    private int loginErrorCount;
    /**
     * 用户id
     */
    private Long id;
    /**
     * 组织id
     */
    private OrganizationVo org;

    private List<ResourcesTree> resources;

    /**
     * 平台相关联的资源ids
     */
    private List<Long> resourceIds;
    //    private Long[] resourceIds;
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
    private Long jobNumber;
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


    private String orgCode;

    /**
     * 登录平台名称
     */
    private String platform;

    private String platformCode;

    private Long deptmentId;

    private String platTypeEnum;


    /**
     * 渠道商id
     */
    private Long operatorId;


    //*****************************************************************************************************


    public String getPlatTypeEnum() {
        return platTypeEnum;
    }

    public void setPlatTypeEnum(String platTypeEnum) {
        this.platTypeEnum = platTypeEnum;
    }

    public int getLoginErrorCount() {
		return loginErrorCount;
	}

	public void setLoginErrorCount(int loginErrorCount) {
		this.loginErrorCount = loginErrorCount;
	}


    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public List<Long> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<Long> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public Long getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(Long deptmentId) {
        this.deptmentId = deptmentId;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrganizationVo getOrg() {
        return org;
    }

    public void setOrg(OrganizationVo org) {
        this.org = org;
    }

    public List<ResourcesTree> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesTree> resources) {
        this.resources = resources;
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

    public Long getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Long jobNumber) {
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
