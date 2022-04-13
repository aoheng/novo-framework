package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

import com.alibaba.fastjson.JSON;
import com.novo.commons.support.openApi.aliGenie.operate.AliGenieHeaderVO;

import java.util.List;

/**
 * @author MickeyChen
 * @date 2020/12/21
 */
public class QuerySuccessResponseProtocol {

    private List<JSON> properties;
    private AliGenieHeaderVO header;
    private ControlSuccessResponseVO payload;

    public List<JSON> getProperties() {
        return properties;
    }

    public void setProperties(List<JSON> properties) {
        this.properties = properties;
    }

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
