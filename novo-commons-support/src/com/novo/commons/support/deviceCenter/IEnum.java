package com.novo.commons.support.deviceCenter;

import java.io.Serializable;

/**
 * @author Aoheng on 2020/10/29.
 */
public interface IEnum {

    /** 根据数据库存储值获取相应的枚举类型 */
    static <E extends Enum<?> & IEnum> E enumValueOf(Class<E> enumClass, Object value) {
        E[] es = enumClass.getEnumConstants();
        for (E e : es) {
            Serializable enumValue = e.getEnumValue();
            if (enumValue != null) {
                if (value instanceof String && enumValue.toString().equalsIgnoreCase((String) value)) {
                    return e;
                } else if (enumValue.equals(value)) {
                    return e;
                }
            }
        }
        return null;
    }

    /** 枚举数据库存储值 */
    Serializable getEnumValue();
}
