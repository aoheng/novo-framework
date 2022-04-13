package com.novo.commons.support.customer.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 15:39 2020/1/15
 */
public class ExplodedRequestProtocol extends PaginationRequestProtocol {

    public static final String USER_BASE_TYPE = "用户";
    public static final String CUST_BASE_TYPE = "客户";

    private String nickname;

    private String zodiac;

    private Integer gender;

    private Integer age;

    private String constellation;

    private String personLevel;

    private String personSign;

    private String personPicture;

    private String targetType;

    private Long targetId;

    public Long modifierId;//修改者Id

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getPersonLevel() {
        return personLevel;
    }

    public void setPersonLevel(String personLevel) {
        this.personLevel = personLevel;
    }

    public String getPersonSign() {
        return personSign;
    }

    public void setPersonSign(String personSign) {
        this.personSign = personSign;
    }

    public String getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(String personPicture) {
        this.personPicture = personPicture;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }
}
