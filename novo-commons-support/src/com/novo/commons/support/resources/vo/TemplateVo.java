package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-31 10:48
 **/

public class TemplateVo implements Serializable {

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
     * 系统参数对象集合
     */
    private List<SysconfigVo> paramList;

    /**
     * 平台资源id集合
     */
    private List<Long> resourcesIds;

    private List<Long> treeIds;

    /**
     * 平台模板资源是
     */
    private List<ResourcesTree> tree;

    private Boolean needTreeIds;

    //****************************************************************** ***********************************


    public Boolean getNeedTreeIds() {
        return needTreeIds;
    }

    public void setNeedTreeIds(Boolean needTreeIds) {
        this.needTreeIds = needTreeIds;
    }

    public List<Long> getTreeIds() {
        return treeIds;
    }

    public void setTreeIds(List<Long> treeIds) {
        this.treeIds = treeIds;
    }

    public List<SysconfigVo> getParamList() {
        return paramList;
    }

    public void setParamList(List<SysconfigVo> paramList) {
        this.paramList = paramList;
    }

    public List<Long> getResourcesIds() {
        return resourcesIds;
    }

    public void setResourcesIds(List<Long> resourcesIds) {
        this.resourcesIds = resourcesIds;
    }

    public List<ResourcesTree> getTree() {
        return tree;
    }

    public void setTree(List<ResourcesTree> tree) {
        this.tree = tree;
    }

    public Long getId() {
        return id;
    }

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
