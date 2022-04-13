package com.novo.data.mongodb.dao;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.novo.data.mongodb.DeviceMongoPagination;
import com.novo.data.mongodb.MongoCollection;
import com.novo.data.mongodb.entity.BiLatitudeOffline;
import com.novo.framework.core.util.DateUtils;
import com.novo.framework.core.util.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class BiLatitudeMongoDao {

	@Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    public void insert(BiLatitudeOffline o) {
    	 o.setCreateTime(new Date());
        mongoTemplate.insert(o, MongoCollection.BILATITUDE);
    }

    public int count(DeviceMongoPagination page){
        String collection =  MongoCollection.BILATITUDE;
        return mongoTemplate.getCollection(collection).find(page.getQuery()).count();
    }


    public List<BiLatitudeOffline> findByPage(DeviceMongoPagination page){
        String collection =  MongoCollection.BILATITUDE;
        DBCollection dbCollection = mongoTemplate.getCollection(collection);
        DBCursor limit = dbCollection.find(page.getQuery()).skip(page.getSkip()).limit(page.getLimit()).sort(page.getSort());
        List<BiLatitudeOffline> list = new ArrayList<>();
        while (limit.hasNext()) {
            try {
                DBObject object = limit.next();
                Map<String, Object> map = JacksonUtils.obj2map(object);
                BiLatitudeOffline bi = new BiLatitudeOffline();
                bi.setId((String)map.get("_id"));
                bi.setLatitude(Double.valueOf(String.valueOf(map.get("latitude"))));
                bi.setLongitude(Double.valueOf(String.valueOf(map.get("longitude"))));
                bi.setCreateTime((DateUtils.long2Date((Long)map.get("createTime"))));
                list.add(bi);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return list;
    }
	
}
