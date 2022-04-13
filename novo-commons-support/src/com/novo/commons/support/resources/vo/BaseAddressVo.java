package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-05-21 14:53
 **/

public class BaseAddressVo implements Serializable {


    private Long id;

    private String name;


    private Long code;


    private Long parentId;


    private String countryName;
    private Long countryCode;

    private String provinceName;
    private Long provinceCode;


    private String cityName;
    private Long cityCode;


    private String areaName;
    private Long areaCode;


    /**
     * 地址codes
     */
    private List<Long> codes;

    private List<List<Long>> codeList;
    //*****************************************************************************************************


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Long countryCode) {
        this.countryCode = countryCode;
    }

    public Long getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Long provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public Long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Long areaCode) {
        this.areaCode = areaCode;
    }

    public List<List<Long>> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<List<Long>> codeList) {
        this.codeList = codeList;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public List<Long> getCodes() {
        return codes;
    }

    public void setCodes(List<Long> codes) {
        this.codes = codes;
    }

    public Long getId() {
        return id;
    }

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

}
