package com.novo.commons.support.pay.protocol;

import com.novo.framework.core.protocol.BaseRequestProtocol;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 20:06 2020/04/26
 */
public class PayNotifyRequestProtocol extends BaseRequestProtocol{

    private String orderNo; // 订单号
    private Integer payAmount; // 支付金额
    private String transactionId; // 第三方支付订单号
    private Integer tranType; // 交易类型 （0.购机，1充值，2续约，3赠送）
    private Integer payType; // 支付类型（0:微信支付；1:支付宝支付;2:银联支付;3:渠道代付;4:我的金库；5：赠送）

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTranType() {
        return tranType;
    }

    public void setTranType(Integer tranType) {
        this.tranType = tranType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}