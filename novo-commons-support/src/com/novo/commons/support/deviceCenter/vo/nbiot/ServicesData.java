package com.novo.commons.support.deviceCenter.vo.nbiot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author MickeyChen
 * @date 2020/5/7
 */
public class ServicesData {

    @JsonProperty("status")
    private String status;
    @JsonProperty("Cmd")
    private String cmd;
    @JsonProperty("FilterA")
    private String filterA;
    @JsonProperty("FilterB")
    private String filterB;
    @JsonProperty("FilterC")
    private String filterC;
    @JsonProperty("TDS1")
    private String TDS1;
    @JsonProperty("TDS2")
    private String TDS2;
    @JsonProperty("ServerTime")
    private String serverTime;
    @JsonProperty("CSQ")
    private String csq;

    @JsonIgnore
    public String getStatus() {
        return status;
    }
    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
    }
    @JsonIgnore
    public String getCmd() {
        return cmd;
    }
    @JsonIgnore
    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
    @JsonIgnore
    public String getFilterA() {
        return filterA;
    }
    @JsonIgnore
    public void setFilterA(String filterA) {
        this.filterA = filterA;
    }
    @JsonIgnore
    public String getFilterB() {
        return filterB;
    }
    @JsonIgnore
    public void setFilterB(String filterB) {
        this.filterB = filterB;
    }
    @JsonIgnore
    public String getFilterC() {
        return filterC;
    }
    @JsonIgnore
    public void setFilterC(String filterC) {
        this.filterC = filterC;
    }
    @JsonIgnore
    public String getTDS1() {
        return TDS1;
    }
    @JsonIgnore
    public void setTDS1(String TDS1) {
        this.TDS1 = TDS1;
    }
    @JsonIgnore
    public String getTDS2() {
        return TDS2;
    }
    @JsonIgnore
    public void setTDS2(String TDS2) {
        this.TDS2 = TDS2;
    }
    @JsonIgnore
    public String getServerTime() {
        return serverTime;
    }
    @JsonIgnore
    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }
    @JsonIgnore
    public String getCsq() {
        return csq;
    }
    @JsonIgnore
    public void setCsq(String csq) {
        this.csq = csq;
    }
}
