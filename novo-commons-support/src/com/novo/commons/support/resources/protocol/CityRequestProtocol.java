package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-23 16:32
 **/

public class CityRequestProtocol extends PaginationRequestProtocol {


    private Long id;
    /**
     * 市code
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


    @Override
    public Long getId() {
        return id;
    }

    @Override
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
