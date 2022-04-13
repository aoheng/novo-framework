package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author of Aoheng
 * @TODO 基本地址请求协议
 * @date 2020-05-21 14:51
 **/

public class BaseAddressRequestProtocol extends PaginationRequestProtocol {

    /**
     * 默认parentId
     */
    public static final Long ROOT_PARENT_ID = -1L;
    public static final String PROVINCE_CODE_CHAR = "0000";
    public static final String AREA_CODE_CHAR = "00";
    public static final String MY_FIELD_TYPE = "type";
    public static final String MY_FIELD_COUNTRY = "country";

    private Long id;

    private String name;

    private Long code;

    private Long parentId;

    private List<Long> codes;//地址codes

    private List<List<Long>> codeList;

    private String country; //国家
    private String province;//省
    private String city;    //市
    private String area;    //区
    private Integer type;    //类型（1-:国，0：省，1：市，2：区）

    //*****************************************************************************************************

    public static String getAreaCodeChar() {
        return AREA_CODE_CHAR;
    }

    public List<List<Long>> getCodeList() {
        return codeList;
    }

    public static String getProvinceCodeChar() {
        return PROVINCE_CODE_CHAR;
    }

    public void setCodeList(List<List<Long>> codeList) {
        this.codeList = codeList;
    }

    public static Long getRootParentId() {
        return ROOT_PARENT_ID;
    }

    public List<Long> getCodes() {
        return codes;
    }

    public void setCodes(List<Long> codes) {
        this.codes = codes;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCountry() {
        return country;
    }

    public BaseAddressRequestProtocol setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public BaseAddressRequestProtocol setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public BaseAddressRequestProtocol setCity(String city) {
        this.city = city;
        return this;
    }

    public String getArea() {
        return area;
    }

    public BaseAddressRequestProtocol setArea(String area) {
        this.area = area;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public BaseAddressRequestProtocol setType(Integer type) {
        this.type = type;
        return this;
    }
}
