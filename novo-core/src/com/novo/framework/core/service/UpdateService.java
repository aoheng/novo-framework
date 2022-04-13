package com.novo.framework.core.service;

import com.novo.framework.core.protocol.BaseRequestProtocol;
import com.novo.framework.core.protocol.ResponseProtocol;

import java.io.Serializable;

public interface UpdateService<T extends BaseRequestProtocol, V extends Serializable> {

    public ResponseProtocol<V> updateEntity(T requestProtocol);
}
