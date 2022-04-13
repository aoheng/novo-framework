package com.novo.filesystem.fastdfs.protocol.storage.request;

import com.novo.filesystem.fastdfs.constant.CmdConstants;
import com.novo.filesystem.fastdfs.mapper.DynamicFieldType;
import com.novo.filesystem.fastdfs.mapper.FastDFSColumn;
import com.novo.filesystem.fastdfs.protocol.BaseRequest;
import com.novo.filesystem.fastdfs.protocol.ProtocolHead;

import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * 作者：aoheng
 * 创建时间：2021/02/01 18:30 <br/>
 */
public class ModifyRequest extends BaseRequest {
    /**
     * 文件路径长度
     */
    @FastDFSColumn(index = 0)
    private long pathSize;

    /**
     * 开始位置
     */
    @FastDFSColumn(index = 1)
    private long fileOffset;

    /**
     * 发送文件长度
     */
    @FastDFSColumn(index = 2)
    private long fileSize;

    /**
     * 文件路径
     */
    @FastDFSColumn(index = 3, dynamicField = DynamicFieldType.allRestByte)
    private String path;

    /**
     * 构造函数
     *
     * @param inputStream 输入流
     * @param fileSize    文件大小
     * @param path        文件路径
     * @param fileOffset  开始位置
     */
    public ModifyRequest(InputStream inputStream, long fileSize, String path, long fileOffset) {
        super();
        this.inputFile = inputStream;
        this.fileSize = fileSize;
        this.path = path;
        this.fileOffset = fileOffset;
        head = new ProtocolHead(CmdConstants.STORAGE_PROTO_CMD_MODIFY_FILE);

    }

    /**
     * 打包参数
     */
    @Override
    public byte[] encodeParam(Charset charset) {
        // 运行时参数在此计算值
        this.pathSize = path.getBytes(charset).length;
        return super.encodeParam(charset);
    }

    public long getPathSize() {
        return pathSize;
    }

    public long getFileOffset() {
        return fileOffset;
    }

    public String getPath() {
        return path;
    }

    @Override
    public long getFileSize() {
        return fileSize;
    }
}