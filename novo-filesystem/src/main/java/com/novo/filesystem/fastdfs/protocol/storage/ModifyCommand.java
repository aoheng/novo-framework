package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.storage.request.ModifyRequest;

import java.io.InputStream;

/**
 * 文件修改命令
 * 作者：aoheng
 * 创建时间：2021/02/01 18:26 <br/>
 */
public class ModifyCommand extends StorageCommand<Void> {

    /**
     * 文件修改命令
     *
     * @param path        文件路径
     * @param inputStream 输入流
     * @param fileSize    文件大小
     * @param fileOffset  开始位置
     */
    public ModifyCommand(String path, InputStream inputStream, long fileSize, long fileOffset) {
        super();
        this.request = new ModifyRequest(inputStream, fileSize, path, fileOffset);
        // 输出响应
        this.response = new BaseResponse<Void>() {
        };
    }
}
