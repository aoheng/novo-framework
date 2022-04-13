package com.novo.commons.support.order.vo;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * TODO 在此加入类描述
 *
 * @author yqjp<Auto       generate>
 * @version 2020-08-21 14:59:29
 * @copyright yqjp
 * @see com.yqjp.business.order.vo.BusinessOrdersActivation
 */

public class DNOrdersActivationVo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer pageNo;//当前显示第几页
    private Integer pageSize;//每页显示多少条记录
    private Integer startIndex;//分页起始位置
    private String deviceBaseType;//设备类型
    private String operatorName;//运营商名称
    private String operatorNo;//运营商账号
    private String operatorMobile;//运营商联系电话

    public String getOperatorMobile() {
        return operatorMobile;
    }

    public void setOperatorMobile(String operatorMobile) {
        this.operatorMobile = operatorMobile;
    }

    private String fromTime;
    private String toTime;

    //columns START

    /**
     * 主键id
     */
    private Long id;


    /**
     * 设备编号
     */
    private String deviceSn;


    /**
     * IMEI编码
     */
    private String imeiCode;


    /**
     * 设备类型
     */
    private String deviceType;


    /**
     * 设备商品名称
     */
    private Long productId;

    private String productName;


    /**
     * 商品类型（0：租赁，1：售卖）
     */
    private Integer productType;


    /**
     * 客户id
     */
    private Long customerId;


    /**
     * 客户名称
     */
    private String customerName;


    /**
     * 联系电话
     */
    private String contactMobile;


    /**
     * 绑定时间
     */
    private String bindTime;


    /**
     * 激活时间
     */
    private String activationTime;


    /**
     * 到期时间
     */
    private String dueTime;


    /**
     * 绑定状态（0：已绑定，1：已解绑）
     */
    private Integer bindStatus;


    /**
     * 设备状态（0：已绑定，1：激活中，2：已激活，3：已解绑）
     */
    private Integer deviceStatus;


    /**
     * 是否在线（0：否，1：是）
     */
    private Integer onlineStatus;


    /**
     * 二维码路径
     */
    private String qrcodeUrl;


    /**
     * 支付url
     */
    private String payUrl;


    /**
     * 订单流水号
     */
    private String orderSerialno;


    /**
     * 订单子行流水号
     */
    private String orderLineSerialno;
    /**
     * 运营商id
     */
    private Long operatorId;
    /**
     * 地址编辑-省
     */
    private String province;
    /**
     * 地址编辑-市
     */
    private String city;
    /**
     * 地址编辑-区
     */
    private String area;
    /**
     * 地址编辑-详细地址
     */
    private String address;
    /**
     * 创建时间
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

    //columns END 数据库字段结束

    //concstructor
    public DNOrdersActivationVo() {
    }

    //get and set

    public String getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
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

    /**
     * 设备编号
     */
    public void setDeviceSn(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.deviceSn = value;
    }


    /**
     * 设备编号
     */

    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * IMEI编码
     */
    public void setImeiCode(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.imeiCode = value;
    }


    /**
     * IMEI编码
     */

    public String getImeiCode() {
        return this.imeiCode;
    }

    /**
     * 设备类型
     */
    public void setDeviceType(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.deviceType = value;
    }


    /**
     * 设备类型
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * 设备商品名称
     */
    public void setProductName(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.productName = value;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 设备商品名称
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * 商品类型（0：租赁，1：售卖）
     */
    public void setProductType(Integer value) {
        this.productType = value;
    }


    /**
     * 商品类型（0：租赁，1：售卖）
     */

    public Integer getProductType() {
        return this.productType;
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
     * 客户名称
     */
    public void setCustomerName(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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
     * 联系电话
     */
    public void setContactMobile(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.contactMobile = value;
    }


    /**
     * 联系电话
     */

    public String getContactMobile() {
        return this.contactMobile;
    }

    public String getBindTime() {
        return bindTime;
    }

    public void setBindTime(String bindTime) {
        this.bindTime = bindTime;
    }

    /**
     * 激活时间
     */
    public void setActivationTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.activationTime = value;
    }


    /**
     * 激活时间
     */

    public String getActivationTime() {
        return this.activationTime;
    }

    /**
     * 到期时间
     */
    public void setDueTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.dueTime = value;
    }


    /**
     * 到期时间
     */

    public String getDueTime() {
        return this.dueTime;
    }

    /**
     * 绑定状态（0：已绑定，1：已解绑）
     */
    public void setBindStatus(Integer value) {
        this.bindStatus = value;
    }


    /**
     * 绑定状态（0：已绑定，1：已解绑）
     */

    public Integer getBindStatus() {
        return this.bindStatus;
    }

    /**
     * 设备状态（0：已绑定，1：激活中，2：已激活，3：已解绑）
     */
    public void setDeviceStatus(Integer value) {
        this.deviceStatus = value;
    }


    /**
     * 设备状态（0：已绑定，1：激活中，2：已激活，3：已解绑）
     */

    public Integer getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * 是否在线（0：否，1：是）
     */
    public void setOnlineStatus(Integer value) {
        this.onlineStatus = value;
    }


    /**
     * 是否在线（0：否，1：是）
     */

    public Integer getOnlineStatus() {
        return this.onlineStatus;
    }

    /**
     * 二维码路径
     */
    public void setQrcodeUrl(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.qrcodeUrl = value;
    }


    /**
     * 二维码路径
     */

    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    /**
     * 支付url
     */
    public void setPayUrl(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.payUrl = value;
    }


    /**
     * 支付url
     */

    public String getPayUrl() {
        return this.payUrl;
    }

    /**
     * 订单流水号
     */
    public void setOrderSerialno(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.orderSerialno = value;
    }


    /**
     * 订单流水号
     */

    public String getOrderSerialno() {
        return this.orderSerialno;
    }

    /**
     * 订单子行流水号
     */
    public void setOrderLineSerialno(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.orderLineSerialno = value;
    }


    /**
     * 订单子行流水号
     */

    public String getOrderLineSerialno() {
        return this.orderLineSerialno;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.createTime = value;
    }


    /**
     * 创建时间
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * 修改时间
     */
    public void setUpdateTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeviceBaseType() {
        return deviceBaseType;
    }

    public void setDeviceBaseType(String deviceBaseType) {
        this.deviceBaseType = deviceBaseType;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

}

	




