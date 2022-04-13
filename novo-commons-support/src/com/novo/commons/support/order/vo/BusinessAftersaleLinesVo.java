package com.novo.commons.support.order.vo;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 2020-06-20 16:30:07
 */
public class BusinessAftersaleLinesVo implements Serializable {

    private static final long serialVersionUID = 1L;


    //columns START

    /**
     * 主键id
     */
    private Long id;


    /**
     * 订单id
     */
    private Long orderId;


    /**
     * 订单子行流水号（规则：订单号-行号）
     */
    private String lineSerialno;


    /**
     * 商品id
     */
    private Long productId;


    /**
     * 商品名称
     */
    private String productName;


    /**
     * sku名称
     */
    private String skuName;


    /**
     * 规格型号
     */
    private String productModel;


    /**
     * 商品料号
     */
    private String productOutCode;


    /**
     * 数量
     */
    private Integer number;


    /**
     * 已使用天数
     */
    private Integer days;


    /**
     * 应退金额（分）
     */
    private Long amount;


    /**
     * 设备编号
     */
    private String deviceId;


    /**
     * 原因
     */
    private String reason;


    /**
     * 备注
     */
    private String remark;


    /**
     * 推送状态（0：待推送，1：已推送，2：不推送）
     */
    private Integer pushStatus;


    /**
     * 推送时间
     */
    private String pushTime;


    /**
     * 安装人姓名
     */
    private String installerName;


    /**
     * 安装人电话
     */
    private String installerMobile;


    /**
     * 安装师傅预约日期
     */
    private String installDate;


    /**
     * 浩泽/浩优开户单编号
     */
    private String billno;


    /**
     * 记录生成时间
     */
    private Date createTime;


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
     * 维修结果
     */
    private String repairResult;

    /**
     * 维修备注
     */
    private String repairNotes;

    private Integer serviceType;

    private List<String> picUrl;

    public List<String> getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(List<String> picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public String getRepairResult() {
        return repairResult;
    }

    public void setRepairResult(String repairResult) {
        this.repairResult = repairResult;
    }

    public String getRepairNotes() {
        return repairNotes;
    }

    public void setRepairNotes(String repairNotes) {
        this.repairNotes = repairNotes;
    }

    //columns END 数据库字段结束

    /**
     * 订单来源编号子行
     */
    private String orderLineSerialno;

    public String getOrderLineSerialno() {
        return orderLineSerialno;
    }

    public void setOrderLineSerialno(String orderLineSerialno) {
        this.orderLineSerialno = orderLineSerialno;
    }

    //concstructor
    public BusinessAftersaleLinesVo() {
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
     * 订单id
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }


    /**
     * 订单id
     */

    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * 订单子行流水号（规则：订单号-行号）
     */
    public void setLineSerialno(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.lineSerialno = value;
    }


    /**
     * 订单子行流水号（规则：订单号-行号）
     */

    public String getLineSerialno() {
        return this.lineSerialno;
    }

    /**
     * 商品id
     */
    public void setProductId(Long value) {
        this.productId = value;
    }


    /**
     * 商品id
     */

    public Long getProductId() {
        return this.productId;
    }

    /**
     * 商品名称
     */
    public void setProductName(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.productName = value;
    }


    /**
     * 商品名称
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * sku名称
     */
    public void setSkuName(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.skuName = value;
    }


    /**
     * sku名称
     */

    public String getSkuName() {
        return this.skuName;
    }

    /**
     * 规格型号
     */
    public void setProductModel(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.productModel = value;
    }


    /**
     * 规格型号
     */

    public String getProductModel() {
        return this.productModel;
    }

    /**
     * 商品料号
     */
    public void setProductOutCode(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.productOutCode = value;
    }


    /**
     * 商品料号
     */

    public String getProductOutCode() {
        return this.productOutCode;
    }

    /**
     * 数量
     */
    public void setNumber(Integer value) {
        this.number = value;
    }


    /**
     * 数量
     */

    public Integer getNumber() {
        return this.number;
    }

    /**
     * 已使用天数
     */
    public void setDays(Integer value) {
        this.days = value;
    }


    /**
     * 已使用天数
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * 应退金额（分）
     */
    public void setAmount(Long value) {
        this.amount = value;
    }


    /**
     * 应退金额（分）
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * 设备编号
     */
    public void setDeviceId(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.deviceId = value;
    }


    /**
     * 设备编号
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * 原因
     */
    public void setReason(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.reason = value;
    }


    /**
     * 原因
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * 备注
     */
    public void setRemark(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.remark = value;
    }


    /**
     * 备注
     */

    public String getRemark() {
        return this.remark;
    }

    /**
     * 推送状态（0：待推送，1：已推送，2：不推送）
     */
    public void setPushStatus(Integer value) {
        this.pushStatus = value;
    }


    /**
     * 推送状态（0：待推送，1：已推送，2：不推送）
     */

    public Integer getPushStatus() {
        return this.pushStatus;
    }

    /**
     * 推送时间
     */
    public void setPushTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.pushTime = value;
    }


    /**
     * 推送时间
     */

    public String getPushTime() {
        return this.pushTime;
    }

    /**
     * 安装人姓名
     */
    public void setInstallerName(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.installerName = value;
    }


    /**
     * 安装人姓名
     */

    public String getInstallerName() {
        return this.installerName;
    }

    /**
     * 安装人电话
     */
    public void setInstallerMobile(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.installerMobile = value;
    }


    /**
     * 安装人电话
     */

    public String getInstallerMobile() {
        return this.installerMobile;
    }

    /**
     * 安装师傅预约日期
     */
    public void setInstallDate(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.installDate = value;
    }


    /**
     * 安装师傅预约日期
     */

    public String getInstallDate() {
        return this.installDate;
    }

    /**
     * 浩泽/浩优开户单编号
     */
    public void setBillno(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.billno = value;
    }


    /**
     * 浩泽/浩优开户单编号
     */

    public String getBillno() {
        return this.billno;
    }

    /**
     * 记录生成时间
     */
    public void setCreateTime(Date value) {
        this.createTime = value;
    }


    /**
     * 记录生成时间
     */

    public Date getCreateTime() {
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


    @Override
    public String toString() {
        return new StringBuilder()
                .append("主键id[").append(getId()).append("],")
                .append("订单id[").append(getOrderId()).append("],")
                .append("订单子行流水号（规则：订单号-行号）[").append(getLineSerialno()).append("],")
                .append("商品id[").append(getProductId()).append("],")
                .append("商品名称[").append(getProductName()).append("],")
                .append("规格型号[").append(getProductModel()).append("],")
                .append("商品料号[").append(getProductOutCode()).append("],")
                .append("推送状态（0：待推送，1：已推送，2：不推送）[").append(getPushStatus()).append("],")
                .append("记录生成时间[").append(getCreateTime()).append("],")
                .append("修改时间[").append(getUpdateTime()).append("],")
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
        if (obj instanceof BusinessAftersaleLinesVo == false) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        BusinessAftersaleLinesVo other = (BusinessAftersaleLinesVo) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

	




