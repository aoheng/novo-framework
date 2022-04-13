package com.novo.framework.core.util;

import com.novo.framework.core.reflect.InvokeMethod;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionUtils {

    public static <T extends Serializable> Map<String, T> toMap(List<T> list, String keyFieldName) throws Exception {
        Map<String, T> map = new HashMap<String, T>();
        for (T t : list) {
            map.put(InvokeMethod.invokeGetter(t, keyFieldName).toString(), t);
        }
        return map;
    }
}
