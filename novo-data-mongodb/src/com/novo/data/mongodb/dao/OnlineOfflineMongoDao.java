package com.novo.data.mongodb.dao;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.novo.data.mongodb.DeviceMongoPagination;
import com.novo.data.mongodb.MongoCollection;
import com.novo.data.mongodb.entity.OnlineOffline;
import com.novo.framework.core.util.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/30 2020/02/05.
 */
@Component
public class OnlineOfflineMongoDao {

    @Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    public void insert(OnlineOffline o) {
        mongoTemplate.insert(o, MongoCollection.getCollection(o.getProductCode(), o.getImeiCode(), MongoCollection.ONLINE_OFFILINE));
    }

    public int count(DeviceMongoPagination page){
        String collection = MongoCollection.getCollection(page.getProductCode(), page.getImeiCode(), MongoCollection.ONLINE_OFFILINE);
        return mongoTemplate.getCollection(collection).find(page.getQuery()).count();
    }


    public List<OnlineOffline> findByPage(DeviceMongoPagination page){
        String collection = MongoCollection.getCollection(page.getProductCode(), page.getImeiCode(), MongoCollection.ONLINE_OFFILINE);
        DBCollection dbCollection = mongoTemplate.getCollection(collection);
        DBCursor limit = dbCollection.find(page.getQuery()).skip(page.getSkip()).limit(page.getLimit()).sort(page.getSort());
        List<OnlineOffline> list = new ArrayList<>();
        while (limit.hasNext()) {
            try {
                DBObject object = limit.next();
                list.add(JacksonUtils.obj2pojo(object, OnlineOffline.class));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return list;
    }
}
