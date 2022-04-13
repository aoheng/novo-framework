package com.novo.commons.support.commodityCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;


/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 14:24 2020/03/01
 */
public class CommodityRequestProtocol extends PaginationRequestProtocol{

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 商品型号
     */
    private String model;

    /**
     * 商品型号编码
     */
    private String modelCode;

    /**
     * 产品条形码(料号)
     */
    private String barcode;

    /**
     * 商品类别
     */
    private Long category;

    /**
     * 商品图片链接URL
     */
    private String pic;

    /**
     * 摘要
     */
    private String description;

    /**
     * 标签
     */
    private String tag;

    /**
     * 商品销售类型
     */
    private Integer saleType;

    /**
     * 是否上架(false为下架，true上架)
     */
    private Boolean isSale;

    /**
     * 商品状态
     */
    private Integer commodityStatus;

    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        isSale = isSale;
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }
}