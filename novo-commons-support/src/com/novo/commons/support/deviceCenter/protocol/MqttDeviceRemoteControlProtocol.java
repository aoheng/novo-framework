package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.RequestProtocol;

/**
 * @author Aoheng on 2020/12/05.
 */
public class MqttDeviceRemoteControlProtocol extends RequestProtocol {

    private static final long serialVersionUID = 1L;
    private String imeiCode;
    /** 控制类型 */
    private String type;
    /** 额外参数，一般为Null，Json格式 */
    private String exParam;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getExParam() { return exParam; }

    public void setExParam(String exParam) { this.exParam = exParam; }
}
