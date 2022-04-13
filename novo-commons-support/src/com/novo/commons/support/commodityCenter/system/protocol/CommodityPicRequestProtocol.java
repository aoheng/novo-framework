package com.novo.commons.support.commodityCenter.system.protocol;

import com.novo.commons.enums.PicType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 16:03 2020/03/01
 */
public class CommodityPicRequestProtocol extends PaginationRequestProtocol{

    /**
     * 商品id
     */
    private Long commodityId;

    /**
     * 图片库名称
     */
    private String name;

    /**
     * 图片库描述
     */
    private String description;

    /**
     * 图片数量
     */
    private Long picNum;

    /**
     * 图片类型
     */
    private PicType picType;

    /**
     * 序号
     */
    private Integer num;

    /**
     * 图片缩略图
     */
    private String pic;

    /**
     * 图片路径
     */
    private String url;

    private List<Long> ids;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPicNum() {
        return picNum;
    }

    public void setPicNum(Long picNum) {
        this.picNum = picNum;
    }

    public PicType getPicType() {
        return picType;
    }

    public void setPicType(PicType picType) {
        this.picType = picType;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}