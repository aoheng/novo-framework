package com.novo.commons.support.deviceCenter.protocol.protocolModel;

/**
 * 协议主题类型
 * @author BinksRao on 2020/6/27
 */
public enum MqttTopicType {

    REPORT("report", "/{环境代码}/{协议版本}/{产品代码}/{设备ID}/report", "|{token}|fields|", "设备端至服务端汇报数据"),
    RESP("resp", "/{环境代码}/{协议版本}/{产品代码}/{设备ID}/resp", "|{token}|fields|", "设备端至服务端回复（对于服务端向设备发起的通知的回复）"),
    REQUEST("request", "/{环境代码}/{协议版本}/{产品代码}/{设备ID}/request", "|{token}|fields|", "服务端至设备端的数据请求"),
    NOTIFY("notify", "/{环境代码}/{协议版本}/{产品代码}/{设备ID}/notify", "|{token}|fields|", "服务端至设备端的命令下发");

    /**主题名称*/
    private String name;
    /**主题订阅的消息头*/
    private String header;
    /**主题的消息体*/
    private String body;
    /**主题描述*/
    private String desc;

    MqttTopicType(String name, String header, String body, String desc){
        this.name = name;
        this.header = header;
        this.body = body;
        this.desc = desc;
    }


}
