package com.novo.data.mongodb.dao;

import com.novo.data.mongodb.MongoCollection;
import com.novo.data.mongodb.entity.DeviceAlarm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Aoheng on 2021/01/30 2020/02/05.
 */
@Component
public class P1_DeviceAlarmMongoDao {

    @Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    public void insert(DeviceAlarm o) {
        mongoTemplate.insert(o, MongoCollection.getCollection(o.getProductCode(), o.getImeiCode(), MongoCollection.PROTOBUF_DEVICE_ALARM));
    }

//    public List<DeviceAlarm> list(PageWrapper pw) {
//        List<Sort.Order> orders = new ArrayList<>();
//        orders.add(new Sort.Order(Sort.Direction.DESC, "tt"));
//        Sort sort = new Sort(orders);
//        Pageable pageable = new PageRequest(pw.getPageIndex(), pw.getPageSize(), sort);
//
//        int productCode = Integer.parseInt(String.valueOf(pw.getExParams().get("productCode")));
//        String imeiCode = String.valueOf(pw.getExParams().get("imeiCode"));
//
//        Criteria criteria = Criteria.where("imeiCode").is(imeiCode);
//        Query query = new Query(criteria).with(pageable);
//
//        String collection = MongoCollection.getCollection(productCode, imeiCode, MongoCollection.PROTOBUF_DEVICE_ALARM);
//
//        Long count = mongoTemplate.count(query, DeviceAlarm.class, collection);
//        pw.setTotal(Math.toIntExact(count));
//
//        List<DeviceAlarm> list = mongoTemplate.find(query, DeviceAlarm.class, collection);
//
//        return list;
//    }
}
