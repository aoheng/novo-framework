package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

import com.novo.commons.support.openApi.aliGenie.operate.AliGenieHeaderVO;

/**
 * @author MickeyChen
 * @date 2020/12/21
 */
public class ControlSuccessResponseProtocol {

    private AliGenieHeaderVO header;
    private ControlSuccessResponseVO payload;

    public AliGenieHeaderVO getHeader() {
        return header;
    }

    public void setHeader(AliGenieHeaderVO header) {
        this.header = header;
    }

    public ControlSuccessResponseVO getPayload() {
        return payload;
    }

    public void setPayload(ControlSuccessResponseVO payload) {
        this.payload = payload;
    }
}
