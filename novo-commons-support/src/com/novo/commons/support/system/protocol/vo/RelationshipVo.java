package com.novo.commons.support.system.protocol.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-01-29 9:35
 **/

public class RelationshipVo implements Serializable {

    public Long id;

    public Long tarId;

    public Long originId;

    //*****************************************************************************************************


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTarId() {
        return tarId;
    }

    public void setTarId(Long tarId) {
        this.tarId = tarId;
    }

    public Long getOriginId() {
        return originId;
    }

    public void setOriginId(Long originId) {
        this.originId = originId;
    }
}
