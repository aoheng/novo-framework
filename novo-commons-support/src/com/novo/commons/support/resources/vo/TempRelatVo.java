package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-31 10:48
 **/

public class TempRelatVo implements Serializable {

    private Long id;

    /**
     * 模板id
     */
    private Long tempId;


    /**
     * 关联系统参数id
     */
    private Long paramId;


    /**
     * 关联资源id
     */
    private Long resId;


    /**
     * 关联组织code
     */
    private String relateOrgCode;

    /**
     * 关系类型(0:参数_模板(),1:平台_模板(),2::参数_模板_组织,3:平台_模板_组织,)
     */
    private Integer relateType;

    private List<Map<String,Object>> list;


    //*****************************************************************************************************


    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

    public Integer getRelateType() {
        return relateType;
    }

    public void setRelateType(Integer relateType) {
        this.relateType = relateType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTempId() {
        return tempId;
    }

    public void setTempId(Long tempId) {
        this.tempId = tempId;
    }

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getRelateOrgCode() {
        return relateOrgCode;
    }

    public void setRelateOrgCode(String relateOrgCode) {
        this.relateOrgCode = relateOrgCode;
    }
}
