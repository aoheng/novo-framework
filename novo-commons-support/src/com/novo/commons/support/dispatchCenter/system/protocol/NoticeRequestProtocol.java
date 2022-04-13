package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author of Aoheng
 * @TODO 通知请求协议
 * @date 2020-03-12 14:42
 **/

public class NoticeRequestProtocol extends PaginationRequestProtocol {



    private Long id;


    /**
     * 通知类型
     */
    private String noticeType;

    /**
     * 通知类型编码
     */
    private String noticeTypeCode;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态
     */
    private String status;

    /**
     * 参数集
     */
    private ParameterRequestProtocol parameter;


    /**
     * 参数id集合
     */
    private List<Long> parmIds;


    public List<Long> getParmIds() {
        return parmIds;
    }

    public void setParmIds(List<Long> parmIds) {
        this.parmIds = parmIds;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getNoticeTypeCode() {
        return noticeTypeCode;
    }

    public void setNoticeTypeCode(String noticeTypeCode) {
        this.noticeTypeCode = noticeTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ParameterRequestProtocol getParameter() {
        return parameter;
    }

    public void setParameter(ParameterRequestProtocol parameter) {
        this.parameter = parameter;
    }
}
