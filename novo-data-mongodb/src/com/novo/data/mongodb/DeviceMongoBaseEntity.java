package com.novo.data.mongodb;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Aoheng on 2021/01/30 2020/01/15.
 */
public class DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer serverSeed;
    /** 环境代码 */
    private String envCode;
    /** 产品代码 （999999:服务器） */
    private Integer productCode;
    protected String imeiCode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date createTime;

    public Date getCreateTime() { return createTime; }

    public void setCreateTime(Date createTime) { this.createTime = createTime; }

    public Integer getServerSeed() { return serverSeed; }

    public void setServerSeed(Integer serverSeed) { this.serverSeed = serverSeed; }

    public String getEnvCode() { return envCode; }

    public void setEnvCode(String envCode) { this.envCode = envCode; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }
}
