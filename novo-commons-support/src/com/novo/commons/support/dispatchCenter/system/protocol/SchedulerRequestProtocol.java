package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-04-26 10:47
 **/

public class SchedulerRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 7210530927875330866L;
    public static final String my_field_mobile = "mobile";

    private String mobile;
    private String code;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
    

}
