package com.novo.data.mongodb.dao;

import com.novo.data.mongodb.MongoCollection;
import com.novo.data.mongodb.entity.OtaUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Aoheng on 2021/01/30 2020/02/05.
 */
@Component
public class OtaUpdateMongoDao {

    @Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    public void insert(OtaUpdate o) {
        o.setCreateTime(new Date());
        mongoTemplate.insert(o, MongoCollection.getCollection(o.getProductCode(), o.getImeiCode(), MongoCollection.OTA_UPDATE));
    }
}
