package com.novo.commons.support.commodityCenter.system.protocol.vo;

import com.novo.commons.enums.CategoryType;

import java.io.Serializable;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 15:04 2020/03/01
 */
public class CommodityCategoryVo implements Serializable {

    private Long id;
    /**
     * 商品类别名
     */
    private String name;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 描述说明
     */
    private String description;

    /**
     * 修改人id(用户Id )
     */
    private Long modifierId;

    /**
     * 是否已使用(true:使用。false:未使用)
     */
    private Boolean dataStatus;

    /**
     * 商品类别分类
     */
    private CategoryType categoryType;

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }
}