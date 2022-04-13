package com.novo.commons.support.dispatchCenter.system.protocol;


/**
 * 短信认证码
 */
public class SmsCodeRequestProtocol extends SchedulerRequestProtocol {

    private String content;   //短信内容


    public String getContent() {
        return content;
    }

    public SmsCodeRequestProtocol setContent(String content) {
        this.content = content;
        return this;
    }
}
