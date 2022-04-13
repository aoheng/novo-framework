package com.novo.commons.support.dispatchCenter.system.protocol.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO 通知Vo
 * @date 2020-03-12 14:45
 **/

public class NoticeVo implements Serializable {

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
    private ParameterVo parameter;

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

    public Long getId() {
        return id;
    }

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

    public ParameterVo getParameter() {
        return parameter;
    }

    public void setParameter(ParameterVo parameter) {
        this.parameter = parameter;
    }
}
