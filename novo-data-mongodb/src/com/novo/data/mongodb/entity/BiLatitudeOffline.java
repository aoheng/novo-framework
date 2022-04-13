package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/30 2020/01/15.
 */
public class BiLatitudeOffline extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private double longitude;
    private double latitude;
    private String id;
    
	 
	 
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
 
   
   
    
}
