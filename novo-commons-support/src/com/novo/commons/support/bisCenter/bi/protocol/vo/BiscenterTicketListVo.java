package com.novo.commons.support.bisCenter.bi.protocol.vo;


import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

/**
 * 领券名单Vo
 */
public class BiscenterTicketListVo  implements Serializable {
	
	private static final long serialVersionUID = 1L;


	
	//columns START

	/**
	 * 主键id
	 */
	private Long id;


	/**
	 * 客户手机号
	 */
	private String customerMobile;


	/**
	 * 领券状态（0：未领，1：已领）
	 */
	private Integer couponStatus;


	/**
	 * 兑换码
	 */
	private String couponCode;


	/**
	 * 短信发送次数
	 */
	private Integer messageNumber;

	/**
	 * 领券通知次数（最大2条）
	 */
	private Integer notifyNumber;
	/**
	 * 短信内容
	 */
	private String messageContent;


	/**
	 * 领取时间
	 */
	private String pickupTime;


	/**
	 * 截止时间
	 */
	private String dueTime;


	/**
	 * 记录生成时间
	 */
	private String createTime;


	/**
	 * 修改时间
	 */
	private String updateTime;


	/**
	 * 删除标记位(0未删除，1已删除)
	 */
	private Boolean deleteStatus;


	/**
	 * 组织代码
	 */
	private String orgCode;


	/**
	 * 创建人id(用户Id )
	 */
	private Long creatorId;


	/**
	 * 版本号
	 */
	private Integer version;


	/**
	 * 数据状态
	 */
	private Boolean dataStatus;


	/**
	 * 排序号
	 */
	private Long dataSort;

	//columns END 数据库字段结束
	
	//concstructor
		public BiscenterTicketListVo(){
		}

	//get and set
		/**
		 * 主键id
		 */
	public void setId(Long value) {
		this.id = value;
	}
	
	
	
	/**
	 * 主键id
	 */

	public Long getId() {
		return this.id;
	}
		/**
		 * 客户手机号
		 */
	public void setCustomerMobile(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerMobile = value;
	}
	
	
	
	/**
	 * 客户手机号
	 */

	public String getCustomerMobile() {
		return this.customerMobile;
	}
		/**
		 * 领券状态（0：未领，1：已领）
		 */
	public void setCouponStatus(Integer value) {
		this.couponStatus = value;
	}
	
	
	
	/**
	 * 领券状态（0：未领，1：已领）
	 */

	public Integer getCouponStatus() {
		return this.couponStatus;
	}
		/**
		 * 兑换码
		 */
	public void setCouponCode(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.couponCode = value;
	}
	
	
	
	/**
	 * 兑换码
	 */

	public String getCouponCode() {
		return this.couponCode;
	}
		/**
		 * 短信发送次数
		 */
	public void setMessageNumber(Integer value) {
		this.messageNumber = value;
	}
	
	
	
	/**
	 * 短信发送次数
	 */

	public Integer getMessageNumber() {
		return this.messageNumber;
	}
		/**
		 * 短信内容
		 */
	public void setMessageContent(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.messageContent = value;
	}
	
	
	
	/**
	 * 短信内容
	 */

	public String getMessageContent() {
		return this.messageContent;
	}
		/**
		 * 领取时间
		 */
	public void setPickupTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.pickupTime = value;
	}
	
	
	
	/**
	 * 领取时间
	 */

	public String getPickupTime() {
		return this.pickupTime;
	}
		/**
		 * 截止时间
		 */
	public void setDueTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.dueTime = value;
	}
	
	
	
	/**
	 * 截止时间
	 */

	public String getDueTime() {
		return this.dueTime;
	}
		/**
		 * 记录生成时间
		 */
	public void setCreateTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.createTime = value;
	}
	
	
	
	/**
	 * 记录生成时间
	 */

	public String getCreateTime() {
		return this.createTime;
	}
		/**
		 * 修改时间
		 */
	public void setUpdateTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.updateTime = value;
	}
	
	
	
	/**
	 * 修改时间
	 */

	public String getUpdateTime() {
		return this.updateTime;
	}
		/**
		 * 删除标记位(0未删除，1已删除)
		 */
	public void setDeleteStatus(Boolean value) {
		this.deleteStatus = value;
	}
	
	
	
	/**
	 * 删除标记位(0未删除，1已删除)
	 */

	public Boolean getDeleteStatus() {
		return this.deleteStatus;
	}
		/**
		 * 组织代码
		 */
	public void setOrgCode(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orgCode = value;
	}
	
	
	
	/**
	 * 组织代码
	 */

	public String getOrgCode() {
		return this.orgCode;
	}
		/**
		 * 创建人id(用户Id )
		 */
	public void setCreatorId(Long value) {
		this.creatorId = value;
	}
	
	
	
	/**
	 * 创建人id(用户Id )
	 */

	public Long getCreatorId() {
		return this.creatorId;
	}
		/**
		 * 版本号
		 */
	public void setVersion(Integer value) {
		this.version = value;
	}
	
	
	
	/**
	 * 版本号
	 */

	public Integer getVersion() {
		return this.version;
	}
		/**
		 * 数据状态
		 */
	public void setDataStatus(Boolean value) {
		this.dataStatus = value;
	}
	
	
	
	/**
	 * 数据状态
	 */

	public Boolean getDataStatus() {
		return this.dataStatus;
	}
		/**
		 * 排序号
		 */
	public void setDataSort(Long value) {
		this.dataSort = value;
	}
	
	
	
	/**
	 * 排序号
	 */

	public Long getDataSort() {
		return this.dataSort;
	}


	public Integer getNotifyNumber() {
		return notifyNumber;
	}

	public BiscenterTicketListVo setNotifyNumber(Integer notifyNumber) {
		this.notifyNumber = notifyNumber;
		return this;
	}

	@Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("客户手机号[").append(getCustomerMobile()).append("],")
			.append("领券状态（0：未领，1：已领）[").append(getCouponStatus()).append("],")
			.append("记录生成时间[").append(getCreateTime()).append("],")
			.append("修改时间[").append(getUpdateTime()).append("],")
			.append("删除标记位(0未删除，1已删除)[").append(getDeleteStatus()).append("],")
			.toString();
	}


}

	




