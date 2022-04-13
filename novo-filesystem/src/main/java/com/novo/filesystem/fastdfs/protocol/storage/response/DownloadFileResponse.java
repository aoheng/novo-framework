package com.novo.filesystem.fastdfs.protocol.storage.response;

import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.storage.callback.DownloadCallback;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * 作者：aoheng
 * 创建时间：2021/02/01 16:06 <br/>
 */
public class DownloadFileResponse<T> extends BaseResponse<T> {

    private DownloadCallback<T> callback;

    public DownloadFileResponse(DownloadCallback<T> callback) {
        super();
        this.callback = callback;
    }

    /**
     * 解析反馈内容
     */
    @Override
    public T decodeContent(InputStream in, Charset charset) throws IOException {
        // 解析报文内容
        FastDFSInputStream input = new FastDFSInputStream(in, getContentLength());
        return callback.receive(input);
    }
}

