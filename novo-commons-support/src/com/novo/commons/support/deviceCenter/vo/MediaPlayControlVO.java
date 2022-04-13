package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/12/19.
 */
public class MediaPlayControlVO {

    private String imeiCode;
    /** 文件类型（0-video 1-picture） */
    private Integer fileType;
    /** 控制类型（0-播放控制 1-模式控制） */
    private Integer controlType;
    /**
     * 控制状态
     * 播放控制：0-开始 1-暂停 2-停止 3-删除 4-设置优先播放序号
     * 模式控制：0-单曲循环 1-列表循环 2-随机播放
     */
    private Integer controlStatus;
    /** 文件序号 */
    private Integer fileIndex;
    /** 播放次数 */
    private Integer playTimes;
    /** 每天固定播放时间（单位：分钟） */
    private Integer playFixedTime;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getFileType() { return fileType; }

    public void setFileType(Integer fileType) { this.fileType = fileType; }

    public Integer getControlType() { return controlType; }

    public void setControlType(Integer controlType) { this.controlType = controlType; }

    public Integer getControlStatus() { return controlStatus; }

    public void setControlStatus(Integer controlStatus) { this.controlStatus = controlStatus; }

    public Integer getFileIndex() { return fileIndex; }

    public void setFileIndex(Integer fileIndex) { this.fileIndex = fileIndex; }

    public Integer getPlayTimes() { return playTimes; }

    public void setPlayTimes(Integer playTimes) { this.playTimes = playTimes; }

    public Integer getPlayFixedTime() { return playFixedTime; }

    public void setPlayFixedTime(Integer playFixedTime) { this.playFixedTime = playFixedTime; }
}
