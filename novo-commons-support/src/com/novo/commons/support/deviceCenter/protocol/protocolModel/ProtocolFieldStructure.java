package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/7/12
 */
public class ProtocolFieldStructure implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer index;
    private Integer length;
    private String name;
    private String type;
    private String desc;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
