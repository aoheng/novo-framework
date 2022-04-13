package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 通知参数集协议
 * @date 2020-03-13 19:49
 **/

public class NoticeParmRequestProtocol extends PaginationRequestProtocol {

    /**
     * id
     */
    private Long id;

    /**
     * 信息id
     */
    private Long noticeId;

    /**
     * 参数集Id
     */
    private Long parmId;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Long getParmId() {
        return parmId;
    }

    public void setParmId(Long parmId) {
        this.parmId = parmId;
    }
}
