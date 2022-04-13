package com.novo.commons.support.commodityCenter.system.protocol.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 14:44 2020/03/02
 */
public class CommoditySkuVo implements Serializable{

    private Long id;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * 商品id
     */
    private Long commodityId;

    /**
     * 销售价格
     */
    private BigDecimal salePrice;

    /**
     * 期限
     */
    private Integer finalTerm;

    /**
     * 商品颜色
     */
    private String color;

    /**
     * 商品规格
     */
    private String specifications;

    /**
     * 商品重量
     */
    private Integer weight;

    /**
     * 是否生效
     */
    private Boolean isInvalid;

    /**
     * sku状态
     */
    private Integer skuStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Boolean getIsInvalid() {
        return isInvalid;
    }

    public void setIsInvalid(Boolean invalid) {
        isInvalid = invalid;
    }

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Integer finalTerm) {
        this.finalTerm = finalTerm;
    }
}