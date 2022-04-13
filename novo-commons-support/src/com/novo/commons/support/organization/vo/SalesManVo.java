package com.novo.commons.support.organization.vo;

import com.novo.commons.enums.OrgStatus;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 19:42 2020/1/18
 */
public class SalesManVo implements Serializable {

    private Long id;
    /**
     * 业务员身份证号
     */

    private String idCard;//身份证号码

    /**
     * 业务员姓名
     */
    private String realName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 业务员手机号
     */
    private String mobileNumber;

    /**
     * 业务员平台code
     */
    private String platformCode;

    private String platformName;

    /**
     * 业务员工作号
     */
    private String jobNumber;//工作号

    /**
     * 修改人
     */
    private Long modifierId;

    /**
     * 部门id
     */
    private Long deptmentId;

    private String deptmentName;

    /**
     * 组织
     */
    private String orgName;

    private String orgCode;

    private OrgStatus orgStatus;

    private Boolean dataStatus;

    private String email;

    private Date birthday;

    public String getDeptmentName() {
        return deptmentName;
    }

    public void setDeptmentName(String deptmentName) {
        this.deptmentName = deptmentName;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    public OrgStatus getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(OrgStatus orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(Long deptmentId) {
        this.deptmentId = deptmentId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }
}
