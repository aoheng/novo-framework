package com.novo.commons.support.organization.vo;

import java.util.Date;
import java.util.List;

import com.novo.commons.enums.OrgStatus;
import com.novo.commons.enums.OrgType;
import com.novo.commons.util.TreeNode;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 19:29 2020/1/15
 */
public class OrganizationTree extends TreeNode<OrganizationTree> {

    private String orgName;

    private String orgCode;

    private String representative;

    private OrgType orgType;

    private OrgStatus orgStatus;

    private String telNumber;

    private Long parentId;

    private String parentName;

    private Date createTime;

    private String orgDeviceCode;

    private String address;

    private List<OrganizationTree> children;

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public Long getParentId() {
        return parentId;
    }

    @Override
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentative() {
        return representative;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public OrgStatus getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(OrgStatus orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }

    @Override
	public List<OrganizationTree> getChildren() {
		return children;
	}

	@Override
	public void setChildren(List<OrganizationTree> children) {
		this.children = children;
	}

	@Override
	public void add(OrganizationTree node) {
		this.children.add(node);
	}
}
