package com.novo.commons.support.openApi.aliGenie.operate;

/**
 * @author MickeyChen
 * @date 2020/12/11
 */
public class AliGenieDiscoveryVO {

    private AliGenieHeaderVO header;

    private PayloadDiscoveryVO payload;

    public AliGenieHeaderVO getHeader() {
        return header;
    }

    public void setHeader(AliGenieHeaderVO header) {
        this.header = header;
    }

    public PayloadDiscoveryVO getPayload() {
        return payload;
    }

    public void setPayload(PayloadDiscoveryVO payload) {
        this.payload = payload;
    }
}
