package com.novo.commons.support.thirdPartyAuth.alipay;
/**
 * @author LK
 * @createDate 2020-09-19
 */
public class AlipaySysParam {
	private String ALIPAY_APP_ID;
	private String ALIPAY_PRIVATE_KEY;
	private String ALIPAY_PUBLIC_KEY;
    private String orgCode;
	public String getALIPAY_APP_ID() {
		return ALIPAY_APP_ID;
	}
	public void setALIPAY_APP_ID(String aLIPAY_APP_ID) {
		ALIPAY_APP_ID = aLIPAY_APP_ID;
	}
	public String getALIPAY_PRIVATE_KEY() {
		return ALIPAY_PRIVATE_KEY;
	}
	public void setALIPAY_PRIVATE_KEY(String aLIPAY_PRIVATE_KEY) {
		ALIPAY_PRIVATE_KEY = aLIPAY_PRIVATE_KEY;
	}
	public String getALIPAY_PUBLIC_KEY() {
		return ALIPAY_PUBLIC_KEY;
	}
	public void setALIPAY_PUBLIC_KEY(String aLIPAY_PUBLIC_KEY) {
		ALIPAY_PUBLIC_KEY = aLIPAY_PUBLIC_KEY;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
}
