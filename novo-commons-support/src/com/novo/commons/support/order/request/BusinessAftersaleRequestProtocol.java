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
	private String remark;//申请备注
	private String reason;//售后原因
	private String picIds;//图片id字符串，用于批量操作
	private String lineId;//售后子表主键id
	private String picUrl;//图片路径
	//columns START
	/**
	 * 客户id
	 */
	private Long customerId;
	/**
	 * 订单流水号
	 */
	private String serialno;
	/**
	 * 订单来源编号
	 */
	private String orderSerialno;
	/**
	 * 工单类型（退机（123000001），换机（123000002），移机（123000003），安装（123000006），维修（123000007），换芯（123000008）
	 */
	private String serviceitem;
	/**
	 * 订单状态(状态（0开立，1已审核，2已推送，3已发货，4已派单，5已结单，6无服务上门，7无服务未上门，10审核不通过，20.确认结单，30已撤单，31撤单中,50：已退款）)
	 */
	private Integer orderStatus;
	/**
	 * 订单来源类型(0：App，1微信公众号，2运营后台，3官网，4生活号）
	 */
	private Integer orderType;
	/**
	 * 服务方式（0：上门服务，1：自主安装，2：到期退机，3：退款退机）
	 */
	private Integer installType;
	/**
	 * 总数量
	 */
	private Integer number;
	/**
	 * 实付金额（分）
	 */
	private Long realAmount=0L;
	/**
	 * 优惠金额（分）
	 */
	private Long discountAmount=0L;
	/**
	 * 退款总金额(分)
	 */
	private Long refundAmount=0L;
	/**
	 * 联系人
	 */
	private String contactName;
	/**
	 * 联系人电话
	 */
	private String contactMobile;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 区
	 */
	private String area;
	/**
	 * 详细地址
	 */
	private String address;
	/**
	 * 客户预约时间
	 */
	private String orderedTime;
	/**
	 * 客户名称
	 */
	private String customerName;
	/**
	 * 客户电话
	 */
	private String customerMobile;
	/**
	 * 客户备注
	 */
	private String customerRemark;
	/**
	 * 运营备注
	 */
	private String consoleRemark;
	/**
	 * 审核备注
	 */
	private String auditRemark;
	/**
	 * 审核人
	 */
	private String auditName;
	/**
	 * 审核时间
	 */
	private String auditTime;
	/**
	 * 记录生成时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 创建人id(用户Id )
	 */
	private Long creatorId;
	/**
	 * 修改人id(用户Id )
	 */
	private String modifierId;
	/**
	 * 版本号
	 */
	private Integer version;
	/**
	 * 组织代码
	 */
	private String orgCode;
	/**
	 * 排序号
	 */
	private Long dataSort;

	private Long channelId;

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

//columns END 数据库字段结束

	/**
	 * ids
	 */
	private List<Long> ids;

	/**
	 * 售后订单子行
	 */
	private List<BusinessAftersaleLinesVo> linesVoList;

	/**
	 * 退款类型（0：否，1：是）
	 */
	private Integer refundType;

	//物流信息
	private String company;
	private String expressNo;

	//耗材类型
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
		 * 客户id
		 */
	public void setCustomerId(Long value) {
		this.customerId = value;
	}



	/**
	 * 客户id
	 */

	public Long getCustomerId() {
		return this.customerId;
	}
		/**
		 * 订单流水号
		 */
	public void setSerialno(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.serialno = value;
	}



	/**
	 * 订单流水号
	 */

	public String getSerialno() {
		return this.serialno;
	}
		/**
		 * 订单来源编号
		 */
	public void setOrderSerialno(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orderSerialno = value;
	}



	/**
	 * 订单来源编号
	 */

	public String getOrderSerialno() {
		return this.orderSerialno;
	}
		/**
		 * 工单类型（退机（123000001），换机（123000002），移机（123000003），安装（123000006），维修（123000007），换芯（123000008）
		 */
	public void setServiceitem(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.serviceitem = value;
	}



	/**
	 * 工单类型（退机（123000001），换机（123000002），移机（123000003），安装（123000006），维修（123000007），换芯（123000008）
	 */

	public String getServiceitem() {
		return this.serviceitem;
	}
		/**
		 * 订单状态(状态（0开立，1已审核，2已推送，3已发货，4已派单，5已结单，6无服务上门，7无服务未上门，10审核不通过，20.确认结单，30已撤单，31撤单中,50：已退款）)
		 */
	public void setOrderStatus(Integer value) {
		this.orderStatus = value;
	}



	/**
	 * 订单状态(状态（0开立，1已审核，2已推送，3已发货，4已派单，5已结单，6无服务上门，7无服务未上门，10审核不通过，20.确认结单，30已撤单，31撤单中,50：已退款）)
	 */

	public Integer getOrderStatus() {
		return this.orderStatus;
	}
		/**
		 * 订单来源类型(0：App，1微信公众号，2运营后台，3官网，4生活号）
		 */
	public void setOrderType(Integer value) {
		this.orderType = value;
	}



	/**
	 * 订单来源类型(0：App，1微信公众号，2运营后台，3官网，4生活号）
	 */

	public Integer getOrderType() {
		return this.orderType;
	}
		/**
		 * 服务方式（0：上门服务，1：自主安装，2：到期退机，3：退款退机）
		 */
	public void setInstallType(Integer value) {
		this.installType = value;
	}



	/**
	 * 服务方式（0：上门服务，1：自主安装，2：到期退机，3：退款退机）
	 */

	public Integer getInstallType() {
		return this.installType;
	}
		/**
		 * 总数量
		 */
	public void setNumber(Integer value) {
		this.number = value;
	}



	/**
	 * 总数量
	 */

	public Integer getNumber() {
		return this.number;
	}
		/**
		 * 实付金额（分）
		 */
	public void setRealAmount(Long value) {
		this.realAmount = value;
	}



	/**
	 * 实付金额（分）
	 */

	public Long getRealAmount() {
		return this.realAmount;
	}
		/**
		 * 优惠金额（分）
		 */
	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}



	/**
	 * 优惠金额（分）
	 */

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
		/**
		 * 退款总金额(分)
		 */
	public void setRefundAmount(Long value) {
		this.refundAmount = value;
	}



	/**
	 * 退款总金额(分)
	 */

	public Long getRefundAmount() {
		return this.refundAmount;
	}
		/**
		 * 联系人
		 */
	public void setContactName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactName = value;
	}



	/**
	 * 联系人
	 */

	public String getContactName() {
		return this.contactName;
	}
		/**
		 * 联系人电话
		 */
	public void setContactMobile(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.contactMobile = value;
	}



	/**
	 * 联系人电话
	 */

	public String getContactMobile() {
		return this.contactMobile;
	}
		/**
		 * 省
		 */
	public void setProvince(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.province = value;
	}



	/**
	 * 省
	 */

	public String getProvince() {
		return this.province;
	}
		/**
		 * 市
		 */
	public void setCity(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.city = value;
	}



	/**
	 * 市
	 */

	public String getCity() {
		return this.city;
	}
		/**
		 * 区
		 */
	public void setArea(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.area = value;
	}



	/**
	 * 区
	 */

	public String getArea() {
		return this.area;
	}
		/**
		 * 详细地址
		 */
	public void setAddress(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.address = value;
	}



	/**
	 * 详细地址
	 */

	public String getAddress() {
		return this.address;
	}
		/**
		 * 客户预约时间
		 */
	public void setOrderedTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.orderedTime = value;
	}



	/**
	 * 客户预约时间
	 */

	public String getOrderedTime() {
		return this.orderedTime;
	}
		/**
		 * 客户名称
		 */
	public void setCustomerName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerName = value;
	}



	/**
	 * 客户名称
	 */

	public String getCustomerName() {
		return this.customerName;
	}
		/**
		 * 客户电话
		 */
	public void setCustomerMobile(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerMobile = value;
	}



	/**
	 * 客户电话
	 */

	public String getCustomerMobile() {
		return this.customerMobile;
	}
		/**
		 * 客户备注
		 */
	public void setCustomerRemark(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.customerRemark = value;
	}



	/**
	 * 客户备注
	 */

	public String getCustomerRemark() {
		return this.customerRemark;
	}
		/**
		 * 运营备注
		 */
	public void setConsoleRemark(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.consoleRemark = value;
	}



	/**
	 * 运营备注
	 */

	public String getConsoleRemark() {
		return this.consoleRemark;
	}
		/**
		 * 审核备注
		 */
	public void setAuditRemark(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditRemark = value;
	}



	/**
	 * 审核备注
	 */

	public String getAuditRemark() {
		return this.auditRemark;
	}
		/**
		 * 审核人
		 */
	public void setAuditName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditName = value;
	}



	/**
	 * 审核人
	 */

	public String getAuditName() {
		return this.auditName;
	}
		/**
		 * 审核时间
		 */
	public void setAuditTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.auditTime = value;
	}



	/**
	 * 审核时间
	 */

	public String getAuditTime() {
		return this.auditTime;
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
		 * 修改人id(用户Id )
		 */
	public void setModifierId(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.modifierId = value;
	}



	/**
	 * 修改人id(用户Id )
	 */

	public String getModifierId() {
		return this.modifierId;
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

	/**
	 * 维修结果
	 */
	private String repairResult;

	/**
	 * 维修备注
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
			.append("主键id[").append(getId()).append("],")
			.append("客户id[").append(getCustomerId()).append("],")
			.append("订单流水号[").append(getSerialno()).append("],")
			.append("订单来源编号[").append(getOrderSerialno()).append("],")
			.append("工单类型（退机（123000001），换机（123000002），移机（123000003），安装（123000006），维修（123000007），换芯（123000008）[").append(getServiceitem()).append("],")
			.append("订单状态(状态（0开立，1已审核，2已推送，3已发货，4已派单，5已结单，6无服务上门，7无服务未上门，10审核不通过，20.确认结单，30已撤单，31撤单中,50：已退款）)[").append(getOrderStatus()).append("],")
			.append("订单来源类型(0：App，1微信公众号，2运营后台，3官网，4生活号）[").append(getOrderType()).append("],")
			.append("服务方式（0：上门服务，1：自主安装，2：到期退机，3：退款退机）[").append(getInstallType()).append("],")
			.append("总数量[").append(getNumber()).append("],")
			.append("实付金额（分）[").append(getRealAmount()).append("],")
			.append("优惠金额（分）[").append(getDiscountAmount()).append("],")
			.append("退款总金额(分)[").append(getRefundAmount()).append("],")
			.append("联系人[").append(getContactName()).append("],")
			.append("联系人电话[").append(getContactMobile()).append("],")
			.append("省[").append(getProvince()).append("],")
			.append("市[").append(getCity()).append("],")
			.append("区[").append(getArea()).append("],")
			.append("详细地址[").append(getAddress()).append("],")
			.append("客户预约时间[").append(getOrderedTime()).append("],")
			.append("客户名称[").append(getCustomerName()).append("],")
			.append("客户电话[").append(getCustomerMobile()).append("],")
			.append("客户备注[").append(getCustomerRemark()).append("],")
			.append("运营备注[").append(getConsoleRemark()).append("],")
			.append("审核备注[").append(getAuditRemark()).append("],")
			.append("审核人[").append(getAuditName()).append("],")
			.append("审核时间[").append(getAuditTime()).append("],")
			.append("记录生成时间[").append(getCreateTime()).append("],")
			.append("修改时间[").append(getUpdateTime()).append("],")
			.append("创建人id(用户Id )[").append(getCreatorId()).append("],")
			.append("修改人id(用户Id )[").append(getModifierId()).append("],")
			.append("版本号[").append(getVersion()).append("],")
			.append("组织代码[").append(getOrgCode()).append("],")
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
