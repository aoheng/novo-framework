package com.novo.commons.support.commodityCenter.system.protocol;

import com.novo.commons.enums.CategoryType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 15:07 2020/03/01
 */
public class CommodityCategoryRequestProtocol extends PaginationRequestProtocol{

    /**
     * 初始化,默认parentId
     */
    public static Long ROOT_PARENT_ID = -1L;

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

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }
}