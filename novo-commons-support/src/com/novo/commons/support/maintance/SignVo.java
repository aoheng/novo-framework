package com.novo.commons.support.maintance;

import java.io.Serializable;

/**
 * @author MickeyChen
 * @date 2020/01/29
 */
public class SignVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String my_field_uuid = "uuid";
    public static final String my_field_sign = "sign";
	
	private String uuid;             //uuid
	private String sign;             //签名
	
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
