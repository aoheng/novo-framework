package com.novo.commons.support.app;

import java.io.Serializable;

public class AppBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String uuid;    //uuid
	private String sign;    //签名
	
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	

}
