package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import javax.xml.crypto.Data;

/**
 * @author of Aoheng
 * @TODO 渠道请求协议
 * @date 2020-03-14 14:39
 **/

public class ChannelRequestProtocol extends PaginationRequestProtocol {

    private Long id;

    /**
     * 渠道名称
     */
    private String name;

    /**
     * 渠道状态
     */
    private String status;

    /**
     * 创建人
     * @return
     */
    private String creator;

    /**
     * 创建时间
     * @return
     */
    private Data creatTime;



    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Data getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Data creatTime) {
        this.creatTime = creatTime;
    }
}
