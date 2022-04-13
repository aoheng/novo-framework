package com.novo.commons.support.operator.request;


import com.novo.framework.core.protocol.PaginationRequestProtocol;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class OperatorRebateRequestProtocol extends PaginationRequestProtocol {



	private static final long serialVersionUID = 1L;

	public static final String MY_FIELD_ID="id";

	public static final String MY_FIELD_CODE="code";

	public static final String MY_FIELD_DEVICE_CODE="deviceCode";
	
	public static final String MY_FIELD_IMEI_CODE="imeiCode";

	public static final String MY_FIELD_PRODUCT_TYPE="productType";

	public static final String MY_FIELD_TYPE="type";


	public static final String MY_FIELD_RESET_STATUS="resetStatus";


	public static final String MY_FIELD_CUSTOMER_ID="customerId";


	public static final String MY_FIELD_REBATE_STATUS="rebateStatus";

	public static final String MY_FIELD_SOURCE_TYPE="sourceType";



	public static final String MY_FIELD_CREATE_TIME="createTime";

	public static final String MY_FIELD_UPDATE_TIME="updateTime";

	public static final String MY_FIELD_FILTER_SN="filterSn";
	
	public static final String MY_FIELD_FILTER_OPERATOR="filterOperator";


	private String imeiCode;//imeiCode
	private Long channelId;//代理商id

	//columns START

	/**
	 * 主键id
	 */
	private Long id;


	/**
	 * 耗材编码
	 */
	private String code;


	/**
	 * 设备编号
	 */
	private String deviceCode;

	/**
	 * filterOperator返利商城代码
	 */
	private Integer filterOperator;

	/**
	 * 商品类型(0：净水器，1：洗碗机，2：空净)
	 */
	private Integer productType;


	/**
	 * 耗材类型（0：PPF，1：RO，2：CC，3：净水芯，4：软水芯，5：净洁芯，6：亮洁芯，7：清洗剂，8：快干剂）
	 */
	private String type;


	/**
	 * 耗材值
	 */
	private Integer number;


	/**
	 * 复位情况(0：未复位，1：已复位)
	 */
	private Integer resetStatus;


	/**
	 * 复位时间
	 */
	private String resetTime;


	/**
	 * 返利时间
	 */
	private String rebateTime;


	/**
	 * 客户id
	 */
	private Long customerId;

	/**
	 * 客户电话
	 */
	private String customerMobile;


	/**
	 * 运营商id
	 */
	private Long operatorId;


	/**
	 * 返利状态(0：待返利，1：已返利)
	 */
	private Integer rebateStatus;


	/**
	 * 来源类型（0：商家，1：非商家）
	 */
	private Integer sourceType;


	/**
	 * 来源平台编码
	 */
	private String platformCode;


	/**
	 * 来源平台名称
	 */
	private String platformName;


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
	private Integer deleteStatus;


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

	/**
	 * 订单流水号
	 */
	private String serialno;

	//columns END 数据库字段结束

	//承载滤芯二维码
	private String filterSn;
	
	private Long operatorIdentity;
	
	private String loginName;
	
	private String operatorName;
	
	private String orderSerialno;
 
	private String deviceId;

	private String exportStartTime;

	private String exportEndTime;

	private Long beRecommendId;




	public Long getBeRecommendId() {
		return beRecommendId;
	}

	public void setBeRecommendId(Long beRecommendId) {
		this.beRecommendId = beRecommendId;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getFilterSn() {
		return filterSn;
	}

	public void setFilterSn(String filterSn) {
		this.filterSn = filterSn;
	}

	//concstructor
	public OperatorRebateRequestProtocol(){
	}
	
	//get and set


	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getRebateTime() {
		return rebateTime;
	}

	public void setRebateTime(String rebateTime) {
		this.rebateTime = rebateTime;
	}

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


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
		 * 设备编号
		 */
	public void setDeviceCode(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.deviceCode = value;
	}
	
	
	
	/**
	 * 设备编号
	 */

	public String getDeviceCode() {
		return this.deviceCode;
	}


		/**
		 * 商品类型(0：净水器，1：洗碗机，2：空净)
		 */
	public void setProductType(Integer value) {
		this.productType = value;
	}
	
	
	
	/**
	 * 商品类型(0：净水器，1：洗碗机，2：空净)
	 */

	public Integer getProductType() {
		return this.productType;
	}


		/**
		 * 耗材类型（0：PPF，1：RO，2：CC，3：净洁芯，3：光洁芯）
		 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 耗材类型（0：PPF，1：RO，2：CC，3：净洁芯，3：光洁芯）
	 */

	public String getType() {
		return type;
	}


	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}


	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
		 * 耗材值
		 */
	public void setNumber(Integer value) {
		this.number = value;
	}
	
	
	
	/**
	 * 耗材值
	 */

	public Integer getNumber() {
		return this.number;
	}


		/**
		 * 复位情况(0：未复位，1：已复位)
		 */
	public void setResetStatus(Integer value) {
		this.resetStatus = value;
	}
	
	
	
	/**
	 * 复位情况(0：未复位，1：已复位)
	 */

	public Integer getResetStatus() {
		return this.resetStatus;
	}


		/**
		 * 复位时间
		 */
	public void setResetTime(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.resetTime = value;
	}
	
	
	
	/**
	 * 复位时间
	 */

	public String getResetTime() {
		return this.resetTime;
	}


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
		 * 运营商id
		 */
	public void setOperatorId(Long value) {
		this.operatorId = value;
	}
	
	
	
	/**
	 * 运营商id
	 */

	public Long getOperatorId() {
		return this.operatorId;
	}


		/**
		 * 返利状态(0：待返利，1：已返利)
		 */
	public void setRebateStatus(Integer value) {
		this.rebateStatus = value;
	}
	
	
	
	/**
	 * 返利状态(0：待返利，1：已返利)
	 */

	public Integer getRebateStatus() {
		return this.rebateStatus;
	}


		/**
		 * 来源类型（0：商家，1：非商家）
		 */
	public void setSourceType(Integer value) {
		this.sourceType = value;
	}
	
	
	
	/**
	 * 来源类型（0：商家，1：非商家）
	 */

	public Integer getSourceType() {
		return this.sourceType;
	}


		/**
		 * 来源平台编码
		 */
	public void setPlatformCode(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.platformCode = value;
	}
	
	
	
	/**
	 * 来源平台编码
	 */

	public String getPlatformCode() {
		return this.platformCode;
	}


		/**
		 * 来源平台名称
		 */
	public void setPlatformName(String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.platformName = value;
	}
	
	
	
	/**
	 * 来源平台名称
	 */

	public String getPlatformName() {
		return this.platformName;
	}


		/**
		 * 删除标记位(0未删除，1已删除)
		 */
	public void setDeleteStatus(Integer value) {
		this.deleteStatus = value;
	}
	
	
	
	/**
	 * 删除标记位(0未删除，1已删除)
	 */

	public Integer getDeleteStatus() {
		return this.deleteStatus;
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
	


	public String getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}

//	@Override
//	public String toString() {
//		return new StringBuilder()
//			.append("主键id[").append(getId()).append("],")
//			.append("耗材编码[").append(getCode()).append("],")
//			.append("设备编号[").append(getDeviceCode()).append("],")
//			.append("商品类型(0：净水器，1：洗碗机，2：空净)[").append(getProductType()).append("],")
//			.append("耗材类型（0：PPF，1：RO，2：CC，3：净洁芯，3：光洁芯）[").append(getType()).append("],")
//			.append("耗材值[").append(getNumber()).append("],")
//			.append("复位情况(0：未复位，1：已复位)[").append(getResetStatus()).append("],")
//			.append("复位时间[").append(getResetTime()).append("],")
//			.append("客户id[").append(getCustomerId()).append("],")
//			.append("运营商id[").append(getOperatorId()).append("],")
//			.append("返利状态(0：待返利，1：已返利)[").append(getRebateStatus()).append("],")
//			.append("来源类型（0：商家，1：非商家）[").append(getSourceType()).append("],")
//			.append("来源平台编码[").append(getPlatformCode()).append("],")
//			.append("来源平台名称[").append(getPlatformName()).append("],")
//			.append("记录生成时间[").append(getCreateTime()).append("],")
//			.append("修改时间[").append(getUpdateTime()).append("],")
//			.append("删除标记位(0未删除，1已删除)[").append(getDeleteStatus()).append("],")
//			.append("创建人id(用户Id )[").append(getCreatorId()).append("],")
//			.append("修改人id(用户Id )[").append(getModifierId()).append("],")
//			.append("版本号[").append(getVersion()).append("],")
//			.append("组织代码[").append(getOrgCode()).append("],")
//			.append("排序号[").append(getDataSort()).append("],")
//			.toString();
//	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof OperatorRebateRequestProtocol == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		OperatorRebateRequestProtocol other = (OperatorRebateRequestProtocol)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}


	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}


	public Long getOperatorIdentity() {
		return operatorIdentity;
	}

	public void setOperatorIdentity(Long operatorIdentity) {
		this.operatorIdentity = operatorIdentity;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOrderSerialno() {
		return orderSerialno;
	}

	public void setOrderSerialno(String orderSerialno) {
		this.orderSerialno = orderSerialno;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	
	
	public String getExportStartTime() {
		return exportStartTime;
	}

	public void setExportStartTime(String exportStartTime) {
		this.exportStartTime = exportStartTime;
	}

	public String getExportEndTime() {
		return exportEndTime;
	}

	public void setExportEndTime(String exportEndTime) {
		this.exportEndTime = exportEndTime;
	}

	@Override
	public String toString() {
		return "OperatorRebateRequestProtocol{" +
				"imeiCode='" + imeiCode + '\'' +
				", channelId=" + channelId +
				", id=" + id +
				", code=" + code +
				", deviceCode='" + deviceCode + '\'' +
				", filterOperator=" + filterOperator +
				", productType=" + productType +
				", type='" + type + '\'' +
				", number=" + number +
				", resetStatus=" + resetStatus +
				", resetTime='" + resetTime + '\'' +
				", customerId=" + customerId +
				", operatorId=" + operatorId +
				", rebateStatus=" + rebateStatus +
				", sourceType=" + sourceType +
				", platformCode='" + platformCode + '\'' +
				", platformName='" + platformName + '\'' +
				", createTime='" + createTime + '\'' +
				", updateTime='" + updateTime + '\'' +
				", deleteStatus=" + deleteStatus +
				", creatorId=" + creatorId +
				", modifierId='" + modifierId + '\'' +
				", version=" + version +
				", orgCode='" + orgCode + '\'' +
				", dataSort=" + dataSort +
				", filterSn='" + filterSn + '\'' +
				'}';
	}

	public Integer getFilterOperator() {
		return filterOperator;
	}

	public void setFilterOperator(Integer filterOperator) {
		this.filterOperator = filterOperator;
	}
}
