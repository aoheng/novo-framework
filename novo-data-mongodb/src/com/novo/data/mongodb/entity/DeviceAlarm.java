package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/30 2020/09/07.
 */
public class DeviceAlarm extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer fenceID;

    public Integer getFenceID() { return fenceID; }

    public void setFenceID(Integer fenceID) { this.fenceID = fenceID; }
}
