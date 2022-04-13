package com.novo.filesystem.fastdfs.protocol;

import com.novo.filesystem.fastdfs.mapper.ObjectMateData;
import com.novo.filesystem.fastdfs.utils.FastDfsParamMapperUtils;

import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * FastDFS操作请求 基类
 * 作者：aoheng
 * 创建时间：2021/02/01 1:00 <br/>
 */
public abstract class BaseRequest {
    /**
     * 报文头
     */
    protected ProtocolHead head;

    /**
     * 发送文件流
     */
    protected InputStream inputFile;

    /**
     * 获取报文头(包内可见)
     */
    ProtocolHead getHead() {
        return head;
    }

    /**
     * 获取报文头
     */
    byte[] getHeadByte(Charset charset) {
        // 设置报文长度
        head.setContentLength(getBodyLength(charset));
        // 返回报文byte
        return head.toByte();
    }

    /**
     * 打包参数
     */
    protected byte[] encodeParam(Charset charset) {
        return FastDfsParamMapperUtils.toByte(this, charset);
    }

    /**
     * 获取参数域长度
     */
    private long getBodyLength(Charset charset) {
        ObjectMateData objectMateData = FastDfsParamMapperUtils.getObjectMap(this.getClass());
        return objectMateData.getFieldsSendTotalByteSize(this, charset) + getFileSize();
    }

    InputStream getInputFile() {
        return inputFile;
    }

    public long getFileSize() {
        return 0;
    }
}
