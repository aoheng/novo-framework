package com.novo.commons.support.resources.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class ManufacturerRequestProtocol extends PaginationRequestProtocol {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	private String name;
	private String desc;
	private String oauthClientId;
	private String oauthClientSecret;
	private String signingKey;
	/**
     * token的过期时间(毫秒)
     */
    private Long expirationTime;
    /**
     *  刷新过期时间(毫秒)
     */
    private Long refreshExpTime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOauthClientId() {
		return oauthClientId;
	}
	public void setOauthClientId(String oauthClientId) {
		this.oauthClientId = oauthClientId;
	}
	public String getOauthClientSecret() {
		return oauthClientSecret;
	}
	public void setOauthClientSecret(String oauthClientSecret) {
		this.oauthClientSecret = oauthClientSecret;
	}
	public Long getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Long expirationTime) {
		this.expirationTime = expirationTime;
	}
	public Long getRefreshExpTime() {
		return refreshExpTime;
	}
	public void setRefreshExpTime(Long refreshExpTime) {
		this.refreshExpTime = refreshExpTime;
	}
	public String getSigningKey() {
		return signingKey;
	}
	public void setSigningKey(String signingKey) {
		this.signingKey = signingKey;
	}
	
}
