package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-10-23 15:46
 **/

public class ProvinceRequestProtocol extends PaginationRequestProtocol {


    private Long id;

    /**
     * 省code
     */
    private Long provinceid;
    /**
     * 省名
     */
    private String province;

    //*****************************************************************************************************


    @Override
    public Long getId() {
        return id;
    }

    @Override
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
