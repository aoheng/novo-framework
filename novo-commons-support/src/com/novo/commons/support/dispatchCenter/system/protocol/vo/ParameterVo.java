package com.novo.commons.support.dispatchCenter.system.protocol.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO 参数集Vo
 * @date 2020-03-12 15:39
 **/

public class ParameterVo implements Serializable {


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

    public Long getId() {
        return id;
    }

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
