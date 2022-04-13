package com.novo.commons.support.assentsCenter.account.protocol.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 16:10 2020/1/25
 */
public class TradeVo implements Serializable {

    private Long id;
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
    private BigDecimal tradeMoney;

    /**
     * 交易所属客户
     */
    private Long customerId;

    /**
     *  交易所属账户
     */
    private Long tradeAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public BigDecimal getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(BigDecimal tradeMoney) {
        this.tradeMoney = tradeMoney;
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
}
