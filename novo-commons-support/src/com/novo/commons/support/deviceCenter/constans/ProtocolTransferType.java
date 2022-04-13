package com.novo.commons.support.deviceCenter.constans;

/**
 * 协议消息传输格式
 * @Author RaoYongBin on 2020/5/4
 */
public interface ProtocolTransferType {

    /*String HEX1_O = "hex1_o";
    String HEX1_NO = "hex1_no";
    String JSON = "json";*/

    /**16进制有序*/
    int HEX1_O = 1;

    /**16进制无序*/
    int HEX1_NO = 2;

    /**json格式*/
    int JSON = 3;

}
