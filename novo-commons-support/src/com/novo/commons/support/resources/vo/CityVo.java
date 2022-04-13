package com.novo.commons.support.resources.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-23 16:33
 **/

public class CityVo implements Serializable {

    private Long id;
    /**
     * 市id
     */
    private Long cityid;
    /**
     * 市名
     */
    private String city;
    /**
     * 父id
     */
    private Long father;

    //*****************************************************************************************************


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getFather() {
        return father;
    }

    public void setFather(Long father) {
        this.father = father;
    }
}
