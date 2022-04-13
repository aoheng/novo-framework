package com.novo.commons.support.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 用户关系维护协议
 * @date 2020-01-29 9:33
 **/

public class RelationshipRequestProtocol extends PaginationRequestProtocol {




    public Long id;

    public Long tarId;

    public Long originId;

    //*****************************************************************************************************


    @Override
    public Long getId() {
        return id;
    }

    @Override
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
