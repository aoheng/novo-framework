package com.novo.commons.support.order.request;

import com.novo.commons.support.order.vo.BusinessAftersaleLinesVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

public class BusinessAftersaleRequestProtocol extends PaginationRequestProtocol {
	private static final long serialVersionUID = 1L;
	
	public static final String MY_FIELD_ID="id";
	
	public static final String MY_FIELD_IDS="ids";
	
	public static final String MY_FIELD_AUDITIDS="auditIds";
	
	public static final String MY_FIELD_CUSTOMER_ID="customerId";
	
	public static final String MY_FIELD_SERIALNO="serialno";
	
	public static final String MY_FIELD_ORDER_SERIALNO="orderSerialno";
	
	public static final String MY_FIELD_SERVICEITEM="serviceitem";
	
	public static final String MY_FIELD_ORDER_STATUS="orderStatus";
	
	public static final String MY_FIELD_ORDER_TYPE="orderType";
	
	public static final String MY_FIELD_INSTALL_TYPE="installType";
	
	public static final String MY_FIELD_NUMBER="number";
	
	public static final String MY_FIELD_REAL_AMOUNT="realAmount";
	
	public static final String MY_FIELD_DISCOUNT_AMOUNT="discountAmount";
	
	public static final String MY_FIELD_REFUND_AMOUNT="refundAmount";
	
	public static final String MY_FIELD_CONTACT_NAME="contactName";
	
	public static final String MY_FIELD_CONTACT_MOBILE="contactMobile";
	
	public static final String MY_FIELD_PROVINCE="province";
	
	public static final String MY_FIELD_CITY="city";
	
	public static final String MY_FIELD_AREA="area";
	
	public static final String MY_FIELD_ADDRESS="address";
	
	public static final String MY_FIELD_ORDERED_TIME="orderedTime";
	
	public static final String MY_FIELD_CUSTOMER_NAME="customerName";
	
	public static final String MY_FIELD_CUSTOMER_MOBILE="customerMobile";
	
	public static final String MY_FIELD_CREATE_TIME="createTime";
	
	public static final String MY_FIELD_UPDATE_TIME="updateTime";
	
	private String auditIds;
	private String remark;//????????????
	private String reason;//????????????
	private String picIds;//??????id??????????????????????????????
	private String lineId;//??????????????????id
	private String picUrl;//????????????
	//columns START
	/**
	 * ??????id
	 */
	private Long customerId;
	/**
	 * ???????????????
	 */
	private String serialno;
	/**
	 * ??????????????????
	 */
	private String orderSerialno;
	/**
	 * ????????????????????????123000001???????????????123000002???????????????123000003???????????????123000006???????????????123000007???????????????123000008???
	 */
	private String serviceitem;
	/**
	 * ????????????(?????????0?????????1????????????2????????????3????????????4????????????5????????????6??????????????????7?????????????????????10??????????????????20.???????????????30????????????31?????????,50???????????????)
	 */
	private Integer orderStatus;
	/**
	 * ??????????????????(0???App???1??????????????????2???????????????3?????????4????????????
	 */
	private Integer orderType;
	/**
	 * ???????????????0??????????????????1??????????????????2??????????????????3??????????????????
	 */
	private Integer installType;
	/**
	 * ?????????
	 */
	private Integer number;
	/**
	 * ?????????????????????
	 */
	private Long realAmount=0L;
	/**
	 * ?????????????????????
	 */
	private Long discountAmount=0L;
	/**
	 * ???????????????(???)
	 */
	private Long refundAmount=0L;
	/**
	 * ?????????
	 */
	private String contactName;
	/**
	 * ???????????????
	 */
	private String contactMobile;
	/**
	 * ???
	 */
	private String province;
	/**
	 * ???
	 */
	private String city;
	/**
	 * ???
	 */
	private String area;
	/**
	 * ????????????
	 */
	private String address;
	/**
	 * ??????????????????
	 */
	private String orderedTime;
	/**
	 * ????????????
	 */
	private String customerName;
	/**
	 * ????????????
	 */
	private String customerMobile;
	/**
	 * ????????????
	 */
	private String customerRemark;
	/**
	 * ????????????
	 */
	private String consoleRemark;
	/**
	 * ????????????
	 */
	private String auditRemark;
	/**
	 * ?????????
	 */
	private String auditName;
	/**
	 * ????????????
	 */
	private String auditTime;
	/**
	 * ??????????????????
	 */
	private String createTime;
	/**
	 * ????????????
	 */
	private String updateTime;
	/**
	 * ?????????id(??????Id )
	 */
	private Long creatorId;
	/**
	 * ?????????id(??????Id )
	 */
	private String modifierId;
	/**
	 * ?????????
	 */
	private Integer version;
	/**
	 * ????????????
	 */
	private String orgCode;
	/**
	 * ?????????
	 */
	private Long dataSort;

	private Long channelId;

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

//columns END ?????????????????????

	/**
	 * ids
	 */
	private List<Long> ids;

	/**
	 * ??????????????????
	 */
	private List<BusinessAftersaleLinesVo> linesVoList;

	/**
	 * ???????????????0?????????1?????????
	 */
	private Integer refundType;

	//????????????
	private String company;
	private String expressNo;

	//????????????
	private Integer cc;
	private Integer ro;
	private Integer ppf;

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

	public Integer getRo() {
		return ro;
	}

	public void setRo(Integer ro) {
		this.ro = ro;
	}

	public Integer getPpf() {
		return ppf;
	}

	public void setPpf(Integer ppf) {
		this.ppf = ppf;
	}

	private String deviceSn;

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Integer getRefundType() {
		return refundType;
	}

	public void setRefundType(Integer refundType) {
		this.refundType = refundType;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public List<BusinessAftersaleLinesVo> getLinesVoList() {
		return linesVoList;
	}

	public void setLinesVoList(List<BusinessAftersaleLinesVo> linesVoList) {
		this.linesVoList = linesVoList;
	}

	//concstructor
	public BusinessAftersaleRequestProtocol(){
	}

	//get and set
		/**
		 * ??????id
		 */
	public void setCustomerId(Long value) {
		this.customerId = value;
	}



	/**
	 * ??????id
	 */

	public Long getCustomerId() {
		return this.customerId;
	}
		/**
		 * ???????????????
		 */
	public void setSerialno(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.serialno = value;
	}



	/**
	 * ???????????????
	 */

	public String getSerialno() {
		return this.serialno;
	}
		/**
		 * ??????????????????
		 */
	public void setOrderSerialno(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orderSerialno = value;
	}



	/**
	 * ??????????????????
	 */

	public String getOrderSerialno() {
		return this.orderSerialno;
	}
		/**
		 * ????????????????????????123000001???????????????123000002???????????????123000003???????????????123000006???????????????123000007???????????????123000008???
		 */
	public void setServiceitem(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.serviceitem = value;
	}



	/**
	 * ????????????????????????123000001???????????????123000002???????????????123000003???????????????123000006???????????????123000007???????????????123000008???
	 */

	public String getServiceitem() {
		return this.serviceitem;
	}
		/**
		 * ????????????(?????????0?????????1????????????2????????????3????????????4????????????5????????????6??????????????????7?????????????????????10??????????????????20.???????????????30????????????31?????????,50???????????????)
		 */
	public void setOrderStatus(Integer value) {
		this.orderStatus = value;
	}



	/**
	 * ????????????(?????????0?????????1????????????2????????????3????????????4????????????5????????????6??????????????????7?????????????????????10??????????????????20.???????????????30????????????31?????????,50???????????????)
	 */

	public Integer getOrderStatus() {
		return this.orderStatus;
	}
		/**
		 * ??????????????????(0???App???1??????????????????2???????????????3?????????4????????????
		 */
	public void setOrderType(Integer value) {
		this.orderType = value;
	}



	/**
	 * ??????????????????(0???App???1??????????????????2???????????????3?????????4????????????
	 */

	public Integer getOrderType() {
		return this.orderType;
	}
		/**
		 * ???????????????0??????????????????1??????????????????2??????????????????3??????????????????
		 */
	public void setInstallType(Integer value) {
		this.installType = value;
	}



	/**
	 * ???????????????0??????????????????1??????????????????2??????????????????3??????????????????
	 */

	public Integer getInstallType() {
		return this.installType;
	}
		/**
		 * ?????????
		 */
	public void setNumber(Integer value) {
		this.number = value;
	}



	/**
	 * ?????????
	 */

	public Integer getNumber() {
		return this.number;
	}
		/**
		 * ?????????????????????
		 */
	public void setRealAmount(Long value) {
		this.realAmount = value;
	}



	/**
	 * ?????????????????????
	 */

	public Long getRealAmount() {
		return this.realAmount;
	}
		/**
		 * ?????????????????????
		 */
	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}



	/**
	 * ?????????????????????
	 */

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
		/**
		 * ???????????????(???)
		 */
	public void setRefundAmount(Long value) {
		this.refundAmount = value;
	}



	/**
	 * ???????????????(???)
	 */

	public Long getRefundAmount() {
		return this.refundAmount;
	}
		/**
		 * ?????????
		 */
	public void setContactName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactName = value;
	}



	/**
	 * ?????????
	 */

	public String getContactName() {
		return this.contactName;
	}
		/**
		 * ???????????????
		 */
	public void setContactMobile(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactMobile = value;
	}



	/**
	 * ???????????????
	 */

	public String getContactMobile() {
		return this.contactMobile;
	}
		/**
		 * ???
		 */
	public void setProvince(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.province = value;
	}



	/**
	 * ???
	 */

	public String getProvince() {
		return this.province;
	}
		/**
		 * ???
		 */
	public void setCity(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.city = value;
	}



	/**
	 * ???
	 */

	public String getCity() {
		return this.city;
	}
		/**
		 * ???
		 */
	public void setArea(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.area = value;
	}



	/**
	 * ???
	 */

	public String getArea() {
		return this.area;
	}
		/**
		 * ????????????
		 */
	public void setAddress(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.address = value;
	}



	/**
	 * ????????????
	 */

	public String getAddress() {
		return this.address;
	}
		/**
		 * ??????????????????
		 */
	public void setOrderedTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orderedTime = value;
	}



	/**
	 * ??????????????????
	 */

	public String getOrderedTime() {
		return this.orderedTime;
	}
		/**
		 * ????????????
		 */
	public void setCustomerName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerName = value;
	}



	/**
	 * ????????????
	 */

	public String getCustomerName() {
		return this.customerName;
	}
		/**
		 * ????????????
		 */
	public void setCustomerMobile(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerMobile = value;
	}



	/**
	 * ????????????
	 */

	public String getCustomerMobile() {
		return this.customerMobile;
	}
		/**
		 * ????????????
		 */
	public void setCustomerRemark(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerRemark = value;
	}



	/**
	 * ????????????
	 */

	public String getCustomerRemark() {
		return this.customerRemark;
	}
		/**
		 * ????????????
		 */
	public void setConsoleRemark(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.consoleRemark = value;
	}



	/**
	 * ????????????
	 */

	public String getConsoleRemark() {
		return this.consoleRemark;
	}
		/**
		 * ????????????
		 */
	public void setAuditRemark(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditRemark = value;
	}



	/**
	 * ????????????
	 */

	public String getAuditRemark() {
		return this.auditRemark;
	}
		/**
		 * ?????????
		 */
	public void setAuditName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditName = value;
	}



	/**
	 * ?????????
	 */

	public String getAuditName() {
		return this.auditName;
	}
		/**
		 * ????????????
		 */
	public void setAuditTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditTime = value;
	}



	/**
	 * ????????????
	 */

	public String getAuditTime() {
		return this.auditTime;
	}

		/**
		 * ?????????id(??????Id )
		 */
	public void setCreatorId(Long value) {
		this.creatorId = value;
	}



	/**
	 * ?????????id(??????Id )
	 */

	public Long getCreatorId() {
		return this.creatorId;
	}
		/**
		 * ?????????id(??????Id )
		 */
	public void setModifierId(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.modifierId = value;
	}



	/**
	 * ?????????id(??????Id )
	 */

	public String getModifierId() {
		return this.modifierId;
	}
		/**
		 * ?????????
		 */
	public void setVersion(Integer value) {
		this.version = value;
	}



	/**
	 * ?????????
	 */

	public Integer getVersion() {
		return this.version;
	}
		/**
		 * ????????????
		 */
	public void setOrgCode(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orgCode = value;
	}



	/**
	 * ????????????
	 */

	public String getOrgCode() {
		return this.orgCode;
	}
		/**
		 * ?????????
		 */
	public void setDataSort(Long value) {
		this.dataSort = value;
	}



	/**
	 * ?????????
	 */

	public Long getDataSort() {
		return this.dataSort;
	}

	/**
	 * ????????????
	 */
	private String repairResult;

	/**
	 * ????????????
	 */
	private String repairNotes;

	public String getRepairResult() {
		return repairResult;
	}

	public void setRepairResult(String value) {
		if (StringUtils.isNotBlank(value)) {
			value = value.trim();
		}
		this.repairResult = value;
	}

	public String getRepairNotes() {
		return repairNotes;
	}

	public void setRepairNotes(String value) {
		if (StringUtils.isNotBlank(value)) {
			value = value.trim();
		}
		this.repairNotes = value;
	}


	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getPicIds() {
		return picIds;
	}

	public void setPicIds(String picIds) {
		this.picIds = picIds;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAuditIds() {
		return auditIds;
	}

	public void setAuditIds(String auditIds) {
		this.auditIds = auditIds;
	}

	@Override
	public String toString() {
		return new StringBuilder()
			.append("??????id[").append(getId()).append("],")
			.append("??????id[").append(getCustomerId()).append("],")
			.append("???????????????[").append(getSerialno()).append("],")
			.append("??????????????????[").append(getOrderSerialno()).append("],")
			.append("????????????????????????123000001???????????????123000002???????????????123000003???????????????123000006???????????????123000007???????????????123000008???[").append(getServiceitem()).append("],")
			.append("????????????(?????????0?????????1????????????2????????????3????????????4????????????5????????????6??????????????????7?????????????????????10??????????????????20.???????????????30????????????31?????????,50???????????????)[").append(getOrderStatus()).append("],")
			.append("??????????????????(0???App???1??????????????????2???????????????3?????????4????????????[").append(getOrderType()).append("],")
			.append("???????????????0??????????????????1??????????????????2??????????????????3??????????????????[").append(getInstallType()).append("],")
			.append("?????????[").append(getNumber()).append("],")
			.append("?????????????????????[").append(getRealAmount()).append("],")
			.append("?????????????????????[").append(getDiscountAmount()).append("],")
			.append("???????????????(???)[").append(getRefundAmount()).append("],")
			.append("?????????[").append(getContactName()).append("],")
			.append("???????????????[").append(getContactMobile()).append("],")
			.append("???[").append(getProvince()).append("],")
			.append("???[").append(getCity()).append("],")
			.append("???[").append(getArea()).append("],")
			.append("????????????[").append(getAddress()).append("],")
			.append("??????????????????[").append(getOrderedTime()).append("],")
			.append("????????????[").append(getCustomerName()).append("],")
			.append("????????????[").append(getCustomerMobile()).append("],")
			.append("????????????[").append(getCustomerRemark()).append("],")
			.append("????????????[").append(getConsoleRemark()).append("],")
			.append("????????????[").append(getAuditRemark()).append("],")
			.append("?????????[").append(getAuditName()).append("],")
			.append("????????????[").append(getAuditTime()).append("],")
			.append("??????????????????[").append(getCreateTime()).append("],")
			.append("????????????[").append(getUpdateTime()).append("],")
			.append("?????????id(??????Id )[").append(getCreatorId()).append("],")
			.append("?????????id(??????Id )[").append(getModifierId()).append("],")
			.append("?????????[").append(getVersion()).append("],")
			.append("????????????[").append(getOrgCode()).append("],")
			.append("?????????[").append(getDataSort()).append("],")
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
		if(obj instanceof BusinessAftersaleRequestProtocol == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		BusinessAftersaleRequestProtocol other = (BusinessAftersaleRequestProtocol)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
