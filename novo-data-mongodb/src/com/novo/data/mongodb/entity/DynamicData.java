package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/30 2020/02/05.
 */
public class DynamicData extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Object data;

    private String dataClassName;

    public DynamicData() {
    }

    public DynamicData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public String getDataClassName() {
        return dataClassName;
    }

    public void setDataClassName(String dataClassName) {
        this.dataClassName = dataClassName;
    }
}
