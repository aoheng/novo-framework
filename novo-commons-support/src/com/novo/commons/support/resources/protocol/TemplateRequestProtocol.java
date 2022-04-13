package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-31 10:42
 **/

public class TemplateRequestProtocol  extends PaginationRequestProtocol {


    private Long   id;



    /**
     * 模板名称
     */
    private String tempName;


    /**
     * 模板类型(0:系统参数模板,1:平台模板)
     */
    private Integer tempType;

    /**
     * 关联资源id集合
     */
    private Long[] resourcesIds;


    private List<Long> treeIds;


    /**
     * 关系类型(0:参数_模板(),1:平台_模板(),2::参数_模板_组织,3:平台_模板_组织,)
     */
    private Integer relateType;


    //*****************************************************************************************************


    public Integer getRelateType() {
        return relateType;
    }

    public void setRelateType(Integer relateType) {
        this.relateType = relateType;
    }

    public Long[] getResourcesIds() {
        return resourcesIds;
    }

    public void setResourcesIds(Long[] resourcesIds) {
        this.resourcesIds = resourcesIds;
    }

    public List<Long> getTreeIds() {
        return treeIds;
    }

    public void setTreeIds(List<Long> treeIds) {
        this.treeIds = treeIds;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public Integer getTempType() {
        return tempType;
    }

    public void setTempType(Integer tempType) {
        this.tempType = tempType;
    }
}
