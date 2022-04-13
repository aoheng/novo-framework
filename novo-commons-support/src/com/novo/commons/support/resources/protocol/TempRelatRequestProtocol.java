package com.novo.commons.support.resources.protocol;

import com.novo.commons.enums.ValueType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-31 10:44
 **/

public class TempRelatRequestProtocol  extends PaginationRequestProtocol {



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
     * 相关资源id集合
     */
    //private List<Long> resourcesIds;
    private Long[] resourcesIds;

    /**
     * 关联参数id集合
     */
//    private List<Long>  paramIds;
    private Long[]  paramIds;

    /**
     * 系统参数对象
     */
    private SysconfigRequestProtocol sysconfigRequestProtocol;





    //******************************************SysconfigRequestProtocol对象参数***********************************************************




    private Long sysId;

    private String name;//名称

    private String keyName;
    /**
     * 配置值
     */
    private String value;

    /**
     * 值类型
     */
    private ValueType valueType;

    /**
     * 参数描述
     */
    private String sysDesc;

    public Long getSysId() {
        return sysId;
    }

    public void setSysId(Long sysId) {
        this.sysId = sysId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }


    //*******************************************SysconfigRequestProtocol对象参数**********************************************************



    /**
     * 关系类型(0:参数_模板(),1:平台_模板(),2::参数_模板_组织,3:平台_模板_组织,)
     */
    private Integer relateType;


    //*****************************************************************************************************


    public Long[] getResourcesIds() {
        return resourcesIds;
    }

    public void setResourcesIds(Long[] resourcesIds) {
        this.resourcesIds = resourcesIds;
    }

    public Long[] getParamIds() {
        return paramIds;
    }

    public void setParamIds(Long[] paramIds) {
        this.paramIds = paramIds;
    }

    public Integer getRelateType() {
        return relateType;
    }

    public void setRelateType(Integer relateType) {
        this.relateType = relateType;
    }

    public SysconfigRequestProtocol getSysconfigRequestProtocol() {
        return sysconfigRequestProtocol;
    }

    public void setSysconfigRequestProtocol(SysconfigRequestProtocol sysconfigRequestProtocol) {
        this.sysconfigRequestProtocol = sysconfigRequestProtocol;
    }



    @Override
    public Long getId() {
        return id;
    }

    @Override
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
