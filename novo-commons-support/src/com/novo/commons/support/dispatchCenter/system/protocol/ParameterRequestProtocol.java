package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 参数请求问协议
 * @date 2020-03-12 15:11
 **/

public class ParameterRequestProtocol extends PaginationRequestProtocol {


    private Long id;

    /**
     * 参数代码
     */
    private String parmCode;
    /**
     * 参数名称
     */
    private String name;
    /**
     * 参数描述
     */
    private String description;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getParmCode() {
        return parmCode;
    }

    public void setParmCode(String parmCode) {
        this.parmCode = parmCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
