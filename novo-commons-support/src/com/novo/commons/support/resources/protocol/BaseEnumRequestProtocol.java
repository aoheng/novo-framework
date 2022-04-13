package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author of Aoheng
 * @TODO 数据字典---枚举请求协议
 * @date 2020-06-26 11:15
 **/

public class BaseEnumRequestProtocol extends PaginationRequestProtocol {
    /**
     * 默认parentId
     */
    public static final Long ROOT_PARENT_ID = -1L;


    private Long id;

    /**
     * 枚举编码
     */
    private Integer enumCode;
    /**
     * 枚举名称
     */
    private String enumName;
    /**
     * 修改人id
     */
    private Long modifierId;
    /**
     * 是否有效(0：无效，1：有效)
     */
    private Integer validStatus;

    /**
     * 注释
     */
    private String remark;

    /**
     * 枚举名称集合
     */
    private List<String> enumNameList;

    //*****************************************************************************************************


    public List<String> getEnumNameList() {
        return enumNameList;
    }

    public void setEnumNameList(List<String> enumNameList) {
        this.enumNameList = enumNameList;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(Integer enumCode) {
        this.enumCode = enumCode;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public Integer getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }
}
