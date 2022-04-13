package com.novo.commons.support.customer.protocol.vo;

import java.util.List;

/**
 * 一个用户可能存在多组织下多个帐号
 * @author MickeyChen
 * @date 2020/12/17
 */
public class AliCustomerVO {

    private String code;

    private AliOrgCodeVO aliOrgCodeVO;

    public AliCustomerVO() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AliOrgCodeVO getAliOrgCodeVO() {
        return aliOrgCodeVO;
    }

    public void setAliOrgCodeVO(AliOrgCodeVO aliOrgCodeVO) {
        this.aliOrgCodeVO = aliOrgCodeVO;
    }
}
