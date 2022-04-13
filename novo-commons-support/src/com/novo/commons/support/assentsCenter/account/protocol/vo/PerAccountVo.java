package com.novo.commons.support.assentsCenter.account.protocol.vo;

import com.novo.commons.enums.AccountStatus;
import com.novo.commons.enums.AccountType;
import com.novo.commons.enums.CertificatesType;
import com.novo.commons.enums.Currency;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 15:51 2020/1/25
 */
public class PerAccountVo implements Serializable{

    private Long id;
    /**
     * 账户号码
     */
    private String accountNo;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 账户类型（客户账户，用户账户（分销商））
     */
    private AccountType accountType;
    /**
     * 个人账户所属id
     */
    private Long personId;
    /**
     * 持卡人姓名(实名制)
     */
    private String personName;
    /**
     * 持卡人性别
     */
    private String gender;
    /**
     * 联系电话
     */
    private String mobileNumber;
    /**
     * 证件类型(0身份证，1临时身份证，2户口本)
     */
    private CertificatesType certificatesType;
    /**
     * 证件号
     */
    private String certificatesNO;
    /**
     * 账户状态(0审核，1启用，2冻结)
     */
    private AccountStatus accountStatus;
    /**
     * 账户金额(单位：分)
     */
    private BigDecimal balance;
    /**
     * 币种
     */
    private Currency currency;
    /**
     * 账户支付密码
     */
    private String salt;
    /**
     * 充值扣款金额
     */
    private Long amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public CertificatesType getCertificatesType() {
        return certificatesType;
    }

    public void setCertificatesType(CertificatesType certificatesType) {
        this.certificatesType = certificatesType;
    }

    public String getCertificatesNO() {
        return certificatesNO;
    }

    public void setCertificatesNO(String certificatesNO) {
        this.certificatesNO = certificatesNO;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
