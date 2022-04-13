package com.novo.filesystem.fastdfs.conn;

import com.novo.filesystem.fastdfs.protocol.storage.StorageCommand;
import com.novo.filesystem.fastdfs.protocol.tracker.TrackerCommand;

import java.net.InetSocketAddress;

/**
 * FastDFS命令执行器
 * <p>
 * 命令执行器
 * 作者：aoheng
 * 创建时间：2020/11/21 15:22 <br/>
 */
public interface CommandExecutor {

    /**
     * 在Tracker Server上执行命令
     *
     * @param command Tracker Server命令
     * @param <T>     返回数据类型
     * @return 返回数据
     */
    <T> T execute(TrackerCommand<T> command);

    /**
     * 在Storage Server上执行命令
     *
     * @param address Storage Server地址
     * @param command Storage Server命令
     * @param <T>     返回数据类型
     * @return 返回数据
     */
    <T> T execute(InetSocketAddress address, StorageCommand<T> command);
}
