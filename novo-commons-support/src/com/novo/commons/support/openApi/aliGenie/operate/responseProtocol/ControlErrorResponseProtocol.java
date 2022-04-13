package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

import com.novo.commons.support.openApi.aliGenie.operate.AliGenieHeaderVO;

/**
 * @author MickeyChen
 * @date 2020/12/21
 */
public class ControlErrorResponseProtocol {

    private AliGenieHeaderVO header;
    private ControlErrorResponseVO payload;

    public AliGenieHeaderVO getHeader() {
        return header;
    }

    public void setHeader(AliGenieHeaderVO header) {
        this.header = header;
    }

    public ControlErrorResponseVO getPayload() {
        return payload;
    }

    public void setPayload(ControlErrorResponseVO payload) {
        this.payload = payload;
    }
}
