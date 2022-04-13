package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-06-26 11:15
 **/

public class BaseEnumVo implements Serializable {


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

    private List<BaseEnumValVo> valVoList;

    private  List<String> strList;

    //*****************************************************************************************************


    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public List<BaseEnumValVo> getValVoList() {
        return valVoList;
    }

    public void setValVoList(List<BaseEnumValVo> valVoList) {
        this.valVoList = valVoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
