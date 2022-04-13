package com.novo.commons.support.operator.vo;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * TODO 在此加入类描述
 * @author yqjp<Auto                               generate>
 * @version 2020-07-02 10:12:50
 * @copyright yqjp
 */

public class OperatorRebateVo implements Serializable {

    private static final long serialVersionUID = 1L;


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
     * 商品类型(0：净水器，1：洗碗机，2：空净)
     */
    private Integer productType;

    /**
     * 商品类型(0：净水器，1：洗碗机，2：空净)
     */
    private String productName;




    /**
     * 耗材类型（0：PPF，1：RO，2：CC，3：净洁芯，3：光洁芯）
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
     * 返利时间
     */
    private String rebateName;


    /**
     * 客户id
     */
    private Long customerId;


    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户电话
     */
    private String mobile;


    /**
     * 运营商id
     */
    private Long operatorId;

    /**
     * 所属运营商
     */
    private String operatorName;


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
    private Date createTime;


    /**
     * 修改时间
     */
    private Date updateTime;


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

    //*****************************************************************************************************


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRebateName() {
        return rebateName;
    }

    public void setRebateName(String rebateName) {
        this.rebateName = rebateName;
    }

    public String getRebateTime() {
        return rebateTime;
    }

    public void setRebateTime(String rebateTime) {
        this.rebateTime = rebateTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    //concstructor
    public OperatorRebateVo() {
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
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
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
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.platformName = value;
    }


    /**
     * 来源平台名称
     */

    public String getPlatformName() {
        return this.platformName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
                .append("耗材编码[").append(getCode()).append("],")
                .append("设备编号[").append(getDeviceCode()).append("],")
                .append("商品类型(0：净水器，1：洗碗机，2：空净)[").append(getProductType()).append("],")
                .append("耗材类型（0：PPF，1：RO，2：CC，3：净洁芯，3：光洁芯）[").append(getType()).append("],")
                .append("复位情况(0：未复位，1：已复位)[").append(getResetStatus()).append("],")
                .append("客户id[").append(getCustomerId()).append("],")
                .append("返利状态(0：待返利，1：已返利)[").append(getRebateStatus()).append("],")
                .append("来源类型（0：商家，1：非商家）[").append(getSourceType()).append("],")
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
        if (obj instanceof OperatorRebateVo == false) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        OperatorRebateVo other = (OperatorRebateVo) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

	




