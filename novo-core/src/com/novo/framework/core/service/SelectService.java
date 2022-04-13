package com.novo.framework.core.service;

import com.novo.framework.core.protocol.BaseRequestProtocol;
import com.novo.framework.core.protocol.ResponseProtocol;

import java.io.Serializable;
import java.util.List;

public interface SelectService<T extends BaseRequestProtocol, V extends Serializable> {

    public ResponseProtocol<List<V>> selectEntity(T requestProtocol);
}
