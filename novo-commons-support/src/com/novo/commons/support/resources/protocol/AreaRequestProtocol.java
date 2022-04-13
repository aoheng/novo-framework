package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 地区管理协议
 * @date 2020-01-31 15:52
 **/

public class AreaRequestProtocol extends PaginationRequestProtocol {

    /**
     * 默认parentId
     */
    public static Long ROOT_PARENT_ID = -1L;

    private Long id;

    /**
     * 区 code
     */
    private Long areaid;

    /**
     * 区/县 名称
     */
    private String area;
    /**
     * 父id
     */
    private Long father;

    //*****************************************************************************************************


    public static Long getRootParentId() {
        return ROOT_PARENT_ID;
    }

    public static void setRootParentId(Long rootParentId) {
        ROOT_PARENT_ID = rootParentId;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getFather() {
        return father;
    }

    public void setFather(Long father) {
        this.father = father;
    }
}
