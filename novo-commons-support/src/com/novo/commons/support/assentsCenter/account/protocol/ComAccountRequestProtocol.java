package com.novo.commons.support.assentsCenter.account.protocol;

import com.novo.commons.enums.AccountStatus;
import com.novo.commons.enums.CertificatesType;
import com.novo.commons.enums.Currency;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.math.BigDecimal;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 15:34 2020/1/26
 */
public class ComAccountRequestProtocol extends PaginationRequestProtocol{
    /**
     * 账户号码
     */
    private String accountNo;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 企业地址
     */
    private String areaCode;
    /**
     * 企业法人姓名(实名制)
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
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
