package com.novo.commons.support.assentsCenter.account.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;


/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 16:09 2020/1/25
 */
public class TradeRequestProtocol extends PaginationRequestProtocol {

    /**
     * 交易号
     */
    private String tradeNo;

    /**
     * 交易类型
     */
    private String tradeType;

    /**
     * 交易总金额
     */
    private Long tradeMoney;

    /**
     * 交易所属客户
     */
    private Long customerId;

    /**
     *  交易所属账户
     */
    private Long tradeAccount;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(Long tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

    public Long getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(Long tradeMoney) {
        this.tradeMoney = tradeMoney;
    }
}
