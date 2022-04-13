package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class DeviceUidBindRequestProtocol extends PaginationRequestProtocol {
	private static final long serialVersionUID = 1L;

	public static final String my_field_uid = "uid";
	public static final String my_field_batchNo = "batchNo";

	/** 分页起始索引 */
	private Integer startNum;

	public String getUid() { return uid; }

	public void setUid(String uid) { this.uid = uid; }

	public String getDeviceSn() { return deviceSn; }

	public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }

	public String getImeiCode() { return imeiCode; }

	public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

	public String getBatchNo() { return batchNo; }

	public void setBatchNo(String batchNo) { this.batchNo = batchNo; }

	public String getRemark() { return remark; }

	public void setRemark(String remark) { this.remark = remark; }

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	private String uid;
	private String deviceSn;
	private String imeiCode;
	private String batchNo;
	private String remark;
}