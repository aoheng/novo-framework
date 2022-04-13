package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/12/19.
 */
public class SendMediaVO {

    private String imeiCode;

    private Integer fileIndex;
    /** 文件类型（0-BMP 1-PNG 2-MP4 3-AVI） */
    private Integer fileType;
    /** 文件名 */
    private String fileName;
    /** 文件大小 */
    private Long fileSize = 0L;
    /** http下载地址 */
    private String httpUrl;
    /** 校验类型（0：CRC32 1：MD5) */
    private Integer checkType = 1;
    /** 校验码 */
    private String checkCode;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getFileIndex() { return fileIndex; }

    public void setFileIndex(Integer fileIndex) { this.fileIndex = fileIndex; }

    public Integer getFileType() { return fileType; }

    public void setFileType(Integer fileType) { this.fileType = fileType; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public Long getFileSize() { return fileSize; }

    public void setFileSize(Long fileSize) { this.fileSize = fileSize; }

    public String getHttpUrl() { return httpUrl; }

    public void setHttpUrl(String httpUrl) { this.httpUrl = httpUrl; }

    public Integer getCheckType() { return checkType; }

    public void setCheckType(Integer checkType) { this.checkType = checkType; }

    public String getCheckCode() { return checkCode; }

    public void setCheckCode(String checkCode) { this.checkCode = checkCode; }
}
