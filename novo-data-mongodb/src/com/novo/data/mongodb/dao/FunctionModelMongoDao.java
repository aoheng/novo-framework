package com.novo.data.mongodb.dao;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.novo.data.mongodb.entity.FunctionMongoModeInfo;
import com.novo.framework.core.util.JacksonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author BinksRao on 2020/7/31
 */
@Component
public class FunctionModelMongoDao {
    private static Logger log = LoggerFactory.getLogger(FunctionModelMongoDao.class);

    @Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    public boolean create(FunctionMongoModeInfo functionInfo) {
        if (StringUtils.isEmpty(functionInfo.getCollectionName())){
            log.error("表名不能为空");
            return false;
        }
        try {
            DBCollection dbCollection = mongoTemplate.createCollection(functionInfo.getCollectionName());
            return true;
        } catch (Exception e) {
            log.error("momngo创建失败，CollectionName: {}", functionInfo.getCollectionName());
            return false;
        }
    }

    public boolean insert(FunctionMongoModeInfo functionInfo) {
        try {
            if (StringUtils.isEmpty(functionInfo.getCollectionName()) || StringUtils.isEmpty(functionInfo.getImeiCode())){
                log.error("表名或设备号不能为空");
                return false;
            }
            mongoTemplate.insert(functionInfo, functionInfo.getCollectionName());
            return true;
        } catch (Exception e) {
            log.error("momngo插入失败，CollectionName: {}，imei: {}", functionInfo.getCollectionName(), functionInfo.getImeiCode());
            return false;
        }
    }

    //up-insert
    public boolean update(FunctionMongoModeInfo functionInfo) {
        try {
            if (StringUtils.isEmpty(functionInfo.getCollectionName()) || StringUtils.isEmpty(functionInfo.getImeiCode())) {
                log.error("表名或设备号不能为空");
                return false;
            }
            List<FunctionMongoModeInfo> list = select(functionInfo);
            if (list != null && !list.isEmpty()) {
                Query query = new Query();
                query.addCriteria(Criteria.where("imeiCode").is(functionInfo.getImeiCode()));
                Update update = Update.update("data", functionInfo.getData());
                mongoTemplate.updateFirst(query, update, functionInfo.getCollectionName());
            } else {
                insert(functionInfo);
            }
            return true;
        } catch (Exception e) {
            log.error("momngo更新失败，CollectionName: {}，imei: {}", functionInfo.getCollectionName(), functionInfo.getImeiCode());
            return false;
        }
    }

    public List<FunctionMongoModeInfo> select(FunctionMongoModeInfo functionInfo) {
        if (StringUtils.isEmpty(functionInfo.getCollectionName()) || StringUtils.isEmpty(functionInfo.getImeiCode())){
            log.error("表名或设备号不能为空");
            return null;
        }
        Query query = new Query();
        query.addCriteria(Criteria.where("imeiCode").is(functionInfo.getImeiCode()));
        List<FunctionMongoModeInfo> dataInfos = mongoTemplate.find(query, FunctionMongoModeInfo.class, functionInfo.getCollectionName());
        return dataInfos;
    }

    public List<FunctionMongoModeInfo> findByPage(FunctionMongoModeInfo functionInfo) {
        if (StringUtils.isEmpty(functionInfo.getCollectionName()) || StringUtils.isEmpty(functionInfo.getImeiCode())){
            log.error("表名或设备号不能为空");
            return null;
        }
        DBCollection collection = mongoTemplate.getCollection(functionInfo.getCollectionName());
        DBCursor limit = collection.find(functionInfo.getQuery()).skip(functionInfo.getSkip()).limit(functionInfo.getLimit()).sort(functionInfo.getSort());

        List<FunctionMongoModeInfo> list = new ArrayList<>();
        while (limit.hasNext()) {
            DBObject object = limit.next();
            try {
                FunctionMongoModeInfo info = JacksonUtils.obj2pojo(object, FunctionMongoModeInfo.class);
                list.add(info);
            } catch (Exception e) {
                e.printStackTrace();
                log.error("查找数据转换异常，mongoFunction: {}", object);
            }
        }
        return list;
    }

    public int count(FunctionMongoModeInfo page) {
        if (StringUtils.isEmpty(page.getCollectionName())){
            log.error("表名为空");
            return 0;
        }
        return mongoTemplate.getCollection(page.getCollectionName()).find(page.getQuery()).count();
    }

    public void test2(FunctionMongoModeInfo functionInfo) {
        Integer operateType = functionInfo.getOperateType();
        String collectionName = functionInfo.getCollectionName();
        if (operateType != null && collectionName != null) {
            switch (operateType) {
                case 5://创建
                    DBCollection dbCollection = mongoTemplate.createCollection(collectionName);
                    mongoTemplate.insert(functionInfo, dbCollection.getName());
                    break;
                case 1://增
                    mongoTemplate.insert(functionInfo, collectionName);
                    break;
                case 2://删
                    break;
                case 3://改
                    Query query = new Query();
                    //query.addCriteria(Criteria.where("data").is("object"));
                    Update update = Update.update("data", functionInfo.getData());
                    mongoTemplate.updateFirst(query, update, collectionName);
                    break;
                default:
                    break;
            }
        }


    }

    public void test() {

//        DBCollection functionModelMongo = mongoTemplate.createCollection("FunctionModel_04");
        //String data = "hello";
        //mongoTemplate.insert(data);

        //System.out.println(functionModelMongo);
        //functionModelMongo.insert()

        FunctionMongoModeInfo function = new FunctionMongoModeInfo();
        //function.setData("obj");
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("aaaa", "AAAA");
        map1.put("bbbb", "BBBB");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("cc", 123);
        map2.put("dd", 456);
        list.add(map1);
        list.add(map2);
        function.setData(map1);
        //mongoTemplate.insert(function, "FunctionModel_03");

        Query query = new Query();
        //query.addCriteria(Criteria.where("data").is("map1"));

        //Update update = new Update();
        Update update = Update.update("data", map2);

        mongoTemplate.updateFirst(query, update, "FunctionModel_03");
        //mongoTemplate.updateMulti(query, update, "FunctionModel_03");

        //mongoTemplate.upsert(query, update, "FunctionModel_03");
        System.out.println("success");
    }

    public void test2() {
        DBCollection collection = mongoTemplate.getCollection("");
        collection.find();

    }
}
