package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoPagination;

import java.io.Serializable;

public class FunctionMongoModeInfo extends DeviceMongoPagination implements Serializable {
    private static final long serialVersionUID = 1L;

    private String collectionName;
    /** 操作类型（1234--增删改查；5--创建）*/
    private Integer operateType;
    private Object data;

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

}
