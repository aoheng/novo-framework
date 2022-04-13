package com.novo.filesystem.fastdfs.protocol.storage.enums;

/**
 * 元数据设置方式
 * 作者：aoheng
 * 创建时间：2021/02/01 18:42 <br/>
 */
public enum StorageMetadataSetType {
    /**
     * 覆盖
     */
    STORAGE_SET_METADATA_FLAG_OVERWRITE('O'),

    /**
     * 没有的条目增加，有则条目覆盖
     */
    STORAGE_SET_METADATA_FLAG_MERGE('M');

    private byte type;

    StorageMetadataSetType(char type) {
        this.type = (byte) type;
    }

    public byte getType() {
        return type;
    }
}
