package com.novo.framework.core.service;

import com.novo.framework.core.protocol.BaseRequestProtocol;
import com.novo.framework.core.protocol.BaseResponseProtocol;

public interface BaseService<K extends BaseRequestProtocol, V extends BaseResponseProtocol> extends StandardService<K, V> {

}
