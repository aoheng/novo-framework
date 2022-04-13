package com.novo.commons.support.bisCenter.bi.protocol;

import com.novo.commons.support.bisCenter.bi.protocol.vo.BiTicketListImportVo;
import com.novo.commons.support.bisCenter.bi.protocol.vo.BiscenterTicketListVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;
import java.util.List;

public class BiscenterTicketListRequestProtocol extends PaginationRequestProtocol {

	private static final long serialVersionUID = 1L;
	
	public static final String MY_FIELD_ID="id";
	
	public static final String MY_FIELD_CUSTOMER_MOBILE="customerMobile";
	
	public static final String MY_FIELD_COUPON_STATUS="couponStatus";
	
	public static final String MY_FIELD_CREATE_TIME="createTime";
	
	public static final String MY_FIELD_UPDATE_TIME="updateTime";
	
	public static final String MY_FIELD_DELETE_STATUS="deleteStatus";

	public static final String MY_FIELD_DUE_TIME="dueTime";

    public static final String MY_FIELD_SMS_CODE="smsCode";

	public static final String MY_FIELD_VO_LIST="voList";

	List<BiTicketListImportVo> voList;  //vo列表
	private String smsCode;              //手机短信认证码
	
	//columns START
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
	 * 短信内容
	 */
	private String messageContent;
    /**
     * 领券通知次数（最大2条）
     */
    private Integer notifyNumber;
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
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
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
	public BiscenterTicketListRequestProtocol(){
	}
	
	//get and set
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
	@Override
	public void setOrgCode(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orgCode = value;
	}
	
	
	
	/**
	 * 组织代码
	 */

	@Override
	public String getOrgCode() {
		return this.orgCode;
	}
		/**
		 * 创建人id(用户Id )
		 */
	@Override
	public void setCreatorId(Long value) {
		this.creatorId = value;
	}
	
	
	
	/**
	 * 创建人id(用户Id )
	 */

	@Override
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

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public BiscenterTicketListRequestProtocol setSmsCode(String smsCode) {
        this.smsCode = smsCode;
        return this;
    }

    public Integer getNotifyNumber() {
        return notifyNumber;
    }

    public BiscenterTicketListRequestProtocol setNotifyNumber(Integer notifyNumber) {
        this.notifyNumber = notifyNumber;
        return this;
    }

    @Override
	public String toString() {
		return new StringBuilder()
			.append("主键id[").append(getId()).append("],")
			.append("客户手机号[").append(getCustomerMobile()).append("],")
			.append("领券状态（0：未领，1：已领）[").append(getCouponStatus()).append("],")
			.append("兑换码[").append(getCouponCode()).append("],")
			.append("短信发送次数[").append(getMessageNumber()).append("],")
			.append("短信内容[").append(getMessageContent()).append("],")
			.append("领取时间[").append(getPickupTime()).append("],")
			.append("截止时间[").append(getDueTime()).append("],")
			.append("记录生成时间[").append(getCreateTime()).append("],")
			.append("修改时间[").append(getUpdateTime()).append("],")
			.append("删除标记位(0未删除，1已删除)[").append(getDeleteStatus()).append("],")
			.append("组织代码[").append(getOrgCode()).append("],")
			.append("创建人id(用户Id )[").append(getCreatorId()).append("],")
			.append("版本号[").append(getVersion()).append("],")
			.append("数据状态[").append(getDataStatus()).append("],")
			.append("排序号[").append(getDataSort()).append("],")
			.toString();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BiscenterTicketListRequestProtocol == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		BiscenterTicketListRequestProtocol other = (BiscenterTicketListRequestProtocol)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public List<BiTicketListImportVo> getVoList() {
		return voList;
	}

	public BiscenterTicketListRequestProtocol setVoList(List<BiTicketListImportVo> voList) {
		this.voList = voList;
		return this;
	}
}
