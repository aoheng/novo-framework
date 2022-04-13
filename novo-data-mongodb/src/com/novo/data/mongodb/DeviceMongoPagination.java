package com.novo.data.mongodb;

import com.mongodb.DBObject;

/**
 * @author RaoYongBin on 2020/5/30
 */
public class DeviceMongoPagination extends DeviceMongoBaseEntity {

    private static final long serialVersionUID = 1L;

    private int skip;
    private int limit;
    private DBObject sort;
    private DBObject query;


    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public DBObject getSort() {
        return sort;
    }

    public void setSort(DBObject sort) {
        this.sort = sort;
    }

    public DBObject getQuery() {
        return query;
    }

    public void setQuery(DBObject query) {
        this.query = query;
    }
}
