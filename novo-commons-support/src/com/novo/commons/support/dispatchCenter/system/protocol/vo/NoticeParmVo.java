package com.novo.commons.support.dispatchCenter.system.protocol.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-03-13 19:51
 **/

public class NoticeParmVo implements Serializable {

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
