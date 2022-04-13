package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author BinksRao on 2020/1/16
 */
public class DeviceMedia {

    private String imeiCode;
    /** 操作类型（0-请求文件下发 1-下发结果上报） */
    private Integer optType;
    /** 媒体类型（0-视频 1-图片） */
    private Integer mediaType;
    /** 媒体序号 续费为1*/
    private Integer mediaIndex;
    /** 下发URL */
    private String downloadUrl;
    /** 下发结果（0-成功 1-失败） */
    private Integer downloadResult;

    public DeviceMedia() {
    }

    public DeviceMedia(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public Integer getMediaIndex() {
        return mediaIndex;
    }

    public void setMediaIndex(Integer mediaIndex) {
        this.mediaIndex = mediaIndex;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getDownloadResult() {
        return downloadResult;
    }

    public void setDownloadResult(Integer downloadResult) {
        this.downloadResult = downloadResult;
    }
}
