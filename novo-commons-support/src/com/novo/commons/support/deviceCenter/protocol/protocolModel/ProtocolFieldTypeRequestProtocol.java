package com.novo.commons.support.deviceCenter.protocol.protocolModel;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.io.Serializable;
import java.util.List;

/**
 * 协议字段类型
 * @author BinksRao on 2020/7/3
 */
public class ProtocolFieldTypeRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**是否基本类型(0:基本类型，1：自定义类型)*/
    private Integer baseStatus;

    public Integer getBaseStatus() {
        return baseStatus;
    }

    public void setBaseStatus(Integer baseStatus) {
        this.baseStatus = baseStatus;
    }

}
