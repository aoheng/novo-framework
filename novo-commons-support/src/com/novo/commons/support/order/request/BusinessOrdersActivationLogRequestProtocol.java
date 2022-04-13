package com.novo.commons.support.order.request;

import com.novo.commons.support.deviceCenter.vo.PpfResetVO;
import com.novo.framework.core.protocol.PaginationRequestProtocol;
import org.apache.commons.lang3.StringUtils;

/**
 * @author BinksRao on 2020/9/11
 */
public class BusinessOrdersActivationLogRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    public static final String MY_FIELD_ID="id";
    public static final String MY_FIELD_ACTIVATION_ID="activationId";
    public static final String MY_FIELD_DEIVICE_SN="deiviceSn";
    public static final String MY_FIELD_TYPE="type";
    public static final String MY_FIELD_CREATOR_NAME="creatorName";
    public static final String MY_FIELD_CREATE_TIME="createTime";
    public static final String MY_FIELD_UPDATE_TIME="updateTime";
    public static final String MY_FIELD_ORG_CODE="orgCode";


    //滤芯重置vo
    private PpfResetVO ppfResetVO;

    //columns START
    /**
     * 客户设备id
     */
    private Long activationId;
    /**
     * 设备编号
     */
    private String deiviceSn;
    /**
     * imei
     */
    private String imeiCode;
    /**
     * 操作类型（0：绑定，1：激活，2：续费，3：换绑，4：换芯，5：退机解绑，6：滤芯防伪复位）
     */
    private Integer type;
    /**
     * 备注
     */
    private String remark;
    /**
     * 操作人名称
     */
    private String creatorName;
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
    public BusinessOrdersActivationLogRequestProtocol(){
    }

    //get and set
    /**
     * 客户设备id
     */
    public void setActivationId(Long value) {
        this.activationId = value;
    }



    /**
     * 客户设备id
     */

    public Long getActivationId() {
        return this.activationId;
    }
    /**
     * 设备编号
     */
    public void setDeiviceSn(String value) {
        if(StringUtils.isNotBlank(value)){
            value=value.trim();
        }
        this.deiviceSn = value;
    }



    /**
     * 设备编号
     */

    public String getDeiviceSn() {
        return this.deiviceSn;
    }
    /**
     * 操作类型（0：绑定，1：激活，2：续费，3：换绑，4：换芯，5：退机解绑，6：滤芯防伪复位）
     */
    public void setType(Integer value) {
        this.type = value;
    }



    /**
     * 操作类型（0：绑定，1：激活，2：续费，3：换绑，4：换芯，5：退机解绑，6：滤芯防伪复位）
     */

    public Integer getType() {
        return this.type;
    }
    /**
     * 备注
     */
    public void setRemark(String value) {
        if(StringUtils.isNotBlank(value)){
            value=value.trim();
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
     * 操作人名称
     */
    public void setCreatorName(String value) {
        if(StringUtils.isNotBlank(value)){
            value=value.trim();
        }
        this.creatorName = value;
    }



    /**
     * 操作人名称
     */

    public String getCreatorName() {
        return this.creatorName;
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

    public PpfResetVO getPpfResetVO() {
        return ppfResetVO;
    }

    public void setPpfResetVO(PpfResetVO ppfResetVO) {
        this.ppfResetVO = ppfResetVO;
    }
}
