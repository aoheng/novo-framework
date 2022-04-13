package com.novo.data.mongodb;


import com.novo.framework.core.util.HashUtils;

/**
 * @author Aoheng on 2021/01/30 2021/01/314
 */
public class MongoCollection {

    public static String ONLINE_OFFILINE = "onlineOffline";
    public static String DYNAMIC_CYCLE = "dynamicCycle";
    public static String DYNAMIC_EVENT = "dynamicEvent";
    public static String OTA_UPDATE = "otaUpdate";
    public static String LACATION = "location";

    public static String PROTOBUF_DEVICE_STATUS = "protobufDeviceStatus";
    public static String PROTOBUF_DEVICE_ALARM = "protobufDeviceAlarm";

    public static String TABLE_RECORD_RECHARGE = "t_record_recharge";
    public static String TABLE_RECORD_CHANGE_BIND = "t_record_change_bind";
    public static String TABLE_RECORD_RESET_FILTER = "t_record_reset_filter";

    public static String getCollection(int productCode, String imeiCode, String collectionName) {      
        return String.format("%s_%s_%s", collectionName, productCode, HashUtils.crc16(imeiCode.getBytes()) % 128);
    }
    
    public static String BILATITUDE = "BILatitude";
}
