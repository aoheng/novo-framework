package com.novo.commons.support.resources.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-23 16:30
 **/

public class ProvinceVo implements Serializable {

    private Long id;

    /**
     * 省id
     */
    private Long provinceid;
    /**
     * 省名
     */
    private String province;


    //*****************************************************************************************************\


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
