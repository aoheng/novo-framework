package com.novo.commons.enums;

/**
 * @author BinksRao on 2020/12/4
 */
public enum DeviceCoreType {

    CC, RO, PPF,
    C1, C2, C3, C4, C5,
    PP, PP1, PP2;


    public static boolean contains(DeviceCoreType core) {
        switch (core) {
            case CC:
            case RO:
            case PPF:
            case C1:
            case C2:
            case C3:
            case C4:
            case C5:
            case PP:
            case PP1:
            case PP2:
                return true;
            default:
                return false;
        }
    }
}
