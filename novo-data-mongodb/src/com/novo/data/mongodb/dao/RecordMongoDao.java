package com.novo.data.mongodb.dao;

import com.novo.data.mongodb.MongoCollection;
import com.novo.data.mongodb.entity.ChangeBindRecord;
import com.novo.data.mongodb.entity.RechargeRecord;
import com.novo.data.mongodb.entity.ResetFilterRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author MickeyChen
 * @date 2020/3/29
 */
@Component
public class RecordMongoDao {

    @Autowired
    @Qualifier("db1MongoTemplate")
    private MongoTemplate mongoTemplate;

    /** -----------------------充水值记录----------------------- */

    public void insertRechargeRecord(RechargeRecord o) {
        o.setCreateTime(new Date());
        mongoTemplate.insert(o, MongoCollection.TABLE_RECORD_RECHARGE);
    }

//    public List<RechargeRecord> list(PageWrapper pw) {
//        List<Sort.Order> orders = new ArrayList<>();
//        orders.add(new Sort.Order(Sort.Direction.DESC, "createTime"));
//        Sort sort = new Sort(orders);
//        Pageable pageable = new PageRequest(pw.getPageNo()-1, pw.getPageSize(), sort);
//
//        String imeiCode = String.valueOf(pw.getExParams().get("imeiCode"));
//        String deviceSn = String.valueOf(pw.getExParams().get("deviceSn"));
//
//        Criteria criteria = new Criteria();
//        criteria.andOperator(
//                Criteria.where("imeiCode").is(imeiCode),
//                Criteria.where("deviceSn").in(deviceSn));
//
//        Query query = new Query(criteria).with(pageable);
//
//        Long count = mongoTemplate.count(query, RechargeRecord.class, MongoCollection.TABLE_RECORD_RECHARGE);
//        pw.setTotal(count);
//
//        List<RechargeRecord> list = mongoTemplate.find(query, RechargeRecord.class, MongoCollection.TABLE_RECORD_RECHARGE);
//
//        return list;
//    }

    /** -----------------------换绑记录----------------------- */

    public void insertChangeBindRecord(ChangeBindRecord o) {
        o.setCreateTime(new Date());
        mongoTemplate.insert(o, MongoCollection.TABLE_RECORD_CHANGE_BIND);
    }

    /** -----------------------重置滤芯记录----------------------- */

    public void insertResetFilterRecord(ResetFilterRecord o) {
        o.setCreateTime(new Date());
        mongoTemplate.insert(o, MongoCollection.TABLE_RECORD_RESET_FILTER);
    }

    /** -----------------------设备退机记录----------------------- */
    //退机应该删除的记录
    public void removeRecord(Integer productCode, String imeiCode) {
        Criteria criteria = new Criteria();
        criteria.andOperator(
                Criteria.where("imeiCode").is(imeiCode));
        Query query = new Query(criteria);

        //删除实时信息，事件，等信息
        mongoTemplate.remove(query, MongoCollection.getCollection(productCode, imeiCode, MongoCollection.ONLINE_OFFILINE));
        mongoTemplate.remove(query, MongoCollection.getCollection(productCode, imeiCode, MongoCollection.DYNAMIC_CYCLE));
        mongoTemplate.remove(query, MongoCollection.getCollection(productCode, imeiCode, MongoCollection.DYNAMIC_EVENT));
        mongoTemplate.remove(query, MongoCollection.getCollection(productCode, imeiCode, MongoCollection.OTA_UPDATE));
        mongoTemplate.remove(query, MongoCollection.getCollection(productCode, imeiCode, MongoCollection.LACATION));

        //删除水值下发记录
        mongoTemplate.remove(query, MongoCollection.TABLE_RECORD_RECHARGE);

        //删除滤芯重置记录
        mongoTemplate.remove(query, MongoCollection.TABLE_RECORD_RESET_FILTER);

        //删除换绑记录
        mongoTemplate.remove(query, MongoCollection.TABLE_RECORD_CHANGE_BIND);
    }

}
