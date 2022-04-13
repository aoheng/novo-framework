package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 产品协议一对多关系
 * @author BinksRao on 2020/7/5
 */
public class ProductProtocolRelationVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**产品Id*/
    private Long productId;
    /**产品适用的协议id集合*/
    private List<Long> protocolIdList;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public List<Long> getProtocolIdList() {
        return protocolIdList;
    }

    public void setProtocolIdList(List<Long> protocolIdList) {
        this.protocolIdList = protocolIdList;
    }
}
