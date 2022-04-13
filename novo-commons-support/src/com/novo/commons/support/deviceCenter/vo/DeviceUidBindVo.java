package com.novo.commons.support.deviceCenter.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class DeviceUidBindVo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String deviceSn;
	private String imeiCode;
	private String uid;
	private String batchNo;
	private String remark;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
	private Date updateTime;
	private String orgCode;
	private String productName;
	private String productCode;

	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	public String getDeviceSn() { return deviceSn; }

	public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }

	public String getImeiCode() { return imeiCode; }

	public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

	public String getUid() { return uid; }

	public void setUid(String uid) { this.uid = uid; }

	public String getBatchNo() { return batchNo; }

	public void setBatchNo(String batchNo) { this.batchNo = batchNo; }

	public String getRemark() { return remark; }

	public void setRemark(String remark) { this.remark = remark; }

	public Date getCreateTime() { return createTime; }

	public void setCreateTime(Date createTime) { this.createTime = createTime; }

	public Date getUpdateTime() { return updateTime; }

	public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }

	public String getOrgCode() { return orgCode; }

	public void setOrgCode(String orgCode) { this.orgCode = orgCode; }

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}