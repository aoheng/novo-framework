package com.novo.data.redis.util;

import com.novo.data.redis.bean.RedisSession;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

import java.lang.reflect.Field;
import java.util.Map;

public class SessionUtils {
	public static final String SESSION_FIELD_SESSIONID = "sessionId";
	public static void validate(RedisSession session) {
		validate(session,null);
	}
	
	public static void validate(RedisSession session,String[] fields) {
		if (session == null) {
			 throw new NullPointerException("redis获取值失败，RedisSession不能为空");
		}
		if(fields != null) {
			Map<String,Field> fieldMap = FieldUtil.getAllFieldMap(session.getClass());
			for(String field : fields) {
				if(!fieldMap.containsKey(field)) {
					throw new NullPointerException("redis获取值失败，"+field+"非法字段!");
				}
				try {
					Object object = InvokeMethod.invokeGetter(session, field);
					if(object == null) {
						throw new NullPointerException("redis获取值失败，"+field+"不能为空");
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new SystemException();
				}
				
			}
		}
	}
	
	public static String getKey(RedisSession session) {
		validate(session, new String[] {SessionUtils.SESSION_FIELD_SESSIONID});
		return session.getDataType().name()+":"+session.getSessionId();
	}
}
