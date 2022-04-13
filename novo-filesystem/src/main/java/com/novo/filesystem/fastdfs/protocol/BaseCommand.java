package com.novo.filesystem.fastdfs.protocol;

import com.novo.filesystem.fastdfs.conn.Connection;

/**
 * FastDFS命令操执行接口
 * 作者：aoheng
 * 创建时间：2021/02/01 0:57 <br/>
 */
public interface BaseCommand<T> {

    /**
     * 执行FastDFS命令
     */
    T execute(Connection conn);
}
