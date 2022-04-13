package com.novo.commons.support.deviceCenter.constans;

/**
 * @author Aoheng on 2020/11/24.
 * 协议类型
 */
public interface ProtocolVerType {

    /** netty tcp (用于一代水机) */
    String NETTY_TCP = "t1";

    /** MQTT0（已废弃，不能用原生心跳，用于洗碗机，未改主题前缀时） */
    @Deprecated
    String MQTT_V0 = "1";

    /** MQTT1（不能用原生心跳，用于洗碗机） */
    @Deprecated
    String MQTT_V1 = "m1";

    /** MQTT2（原生心跳，用于二代水机） */
    @Deprecated
    String MQTT_V2 = "m2";

    /** MQTT3（通用协议） */
    String MQTT_V3 = "u1";

    /** 第三方（protobuf） */
    String PROTOBUF_V1 = "p1";

    /** 是否通用协议 */
    static boolean isUniversalProtocol(String protocolVer) {
        return ProtocolVerType.MQTT_V3.equalsIgnoreCase(protocolVer);
    }

    /** 是否protoBuf协议 */
    static boolean isProtobuf(String protocolVer) {
        return ProtocolVerType.PROTOBUF_V1.equalsIgnoreCase(protocolVer);
    }
}
