package com.novo.data.mongodb.dao;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.novo.data.mongodb.DeviceMongoPagination;
import com.novo.data.mongodb.MongoCollection;
import com.novo.data.mongodb.entity.DynamicData;
import com.novo.framework.core.util.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Aoheng on 2021/01/30 2020/02/05.
 */
@Component
public class DynamicCycleMongoDao {

    @Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    public void insert(DynamicData dd) {
        dd.setCreateTime(new Date());
        mongoTemplate.insert(dd, MongoCollection.getCollection(dd.getProductCode(), dd.getImeiCode(), MongoCollection.DYNAMIC_CYCLE));
    }

    public int count(DeviceMongoPagination page){
        String collection = MongoCollection.getCollection(page.getProductCode(), page.getImeiCode(), MongoCollection.DYNAMIC_CYCLE);
        return mongoTemplate.getCollection(collection).find(page.getQuery()).count();
    }

    public List<DynamicData> findByPage(DeviceMongoPagination page){
        String collection = MongoCollection.getCollection(page.getProductCode(), page.getImeiCode(), MongoCollection.DYNAMIC_CYCLE);
        DBCollection dbCollection = mongoTemplate.getCollection(collection);
        DBCursor limit = dbCollection.find(page.getQuery()).skip(page.getSkip()).limit(page.getLimit()).sort(page.getSort());
        List<DynamicData> list = new ArrayList<>();

        while (limit.hasNext()) {
            try {
                DBObject object = limit.next();
                DynamicData dynamicData = JacksonUtils.obj2pojo(object, DynamicData.class);
                DBObject data = (DBObject) object.get("data");
                if (data == null) {
                    continue;
                }
                String clazz = String.valueOf(data.get("_class"));
                dynamicData.setDataClassName(clazz);
                list.add(dynamicData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
