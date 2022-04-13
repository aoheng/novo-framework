package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/04/12.
 * 休眠时间设置
 */
public class SetFenceVO {

    private String imeiCode;
    /** 围栏ID，不能重复 */
    private Integer id;
    /** 中心点纬度 */
    private String latitude;
    /** 中心点经度 */
    private String longitude;
    /** 半径(米） */
    private Integer radius;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }

    public Integer getRadius() { return radius; }

    public void setRadius(Integer radius) { this.radius = radius; }
}
