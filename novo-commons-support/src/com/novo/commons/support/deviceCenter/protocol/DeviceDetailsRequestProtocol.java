package com.novo.commons.support.deviceCenter.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.Date;

/**
 * 设备协议
 * @author mark_lu
 * 2020年1月24日
 */
public class DeviceDetailsRequestProtocol extends PaginationRequestProtocol {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    private Integer productCode;
    
    private String imeiCode;

	private String colection;

	/**按起止时间条件查询*/
	private Date startTime;
	private Date endTime;

	public String getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getColection() {
		return colection;
	}

	public void setColection(String colection) {
		this.colection = colection;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
