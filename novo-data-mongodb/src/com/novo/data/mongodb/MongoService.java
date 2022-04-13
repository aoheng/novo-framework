package com.novo.data.mongodb;

import com.novo.framework.core.entity.MBaseEntity;
import com.novo.framework.core.protocol.PaginationResponseProtocol;
import com.novo.framework.core.protocol.RequestProtocol;

import java.util.List;

public interface MongoService {

    public <R extends RequestProtocol, T extends MBaseEntity> PaginationResponseProtocol<List<T>> findEntity(R requestProtocol, Class<T> entityClass);
}
