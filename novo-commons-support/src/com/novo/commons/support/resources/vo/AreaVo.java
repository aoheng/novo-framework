package com.novo.commons.support.resources.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-01-31 15:55
 **/

public class AreaVo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 区 编码
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


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

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
