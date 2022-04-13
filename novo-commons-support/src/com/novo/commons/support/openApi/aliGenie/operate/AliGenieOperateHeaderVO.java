package com.novo.commons.support.openApi.aliGenie.operate;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author MickeyChen
 * @date 2020/12/19
 */
public class AliGenieOperateHeaderVO {

    @JsonProperty("Accept")
    private String accept;

    @JsonProperty("Connection")
    private String connection;

    private String name;

    private String namespace;

    @JsonProperty("Host")
    private String host;

//    private String EagleEye-RpcId;
//    private String EagleEye-TraceId;
//    private String Accept-Encoding;
//    private String Content-Length;
//    private String user-agent;
//    private String Content-Type;


    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
