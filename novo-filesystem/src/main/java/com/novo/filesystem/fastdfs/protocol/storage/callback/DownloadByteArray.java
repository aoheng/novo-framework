package com.novo.filesystem.fastdfs.protocol.storage.callback;


import com.novo.filesystem.fastdfs.utils.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * 直接返回Byte[]数据
 * 作者：aoheng
 * 创建时间：2021/02/01 15:56 <br/>
 */
public class DownloadByteArray implements DownloadCallback<byte[]> {
    @Override
    public byte[] receive(InputStream inputStream) throws IOException {
        return IOUtils.toByteArray(inputStream);
    }
}