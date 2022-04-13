package com.novo.data.mybatis.interceptor;

import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.TimeStamp;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

public class TimeStampInterceptor implements QueryInterceptor<Criteria>{

	@Override
	public <T extends RequestProtocol> void intercept(Criteria criteria, T requestProtocol,
			Map<String, Field> entFields) throws Exception {
		if(TimeStamp.class.isAssignableFrom(requestProtocol.getClass())) {
			TimeStamp timeStamp = (TimeStamp)requestProtocol;
			String targetTimeName = timeStamp.targetTimeName();
			if(targetTimeName != null && !targetTimeName.equals("") && entFields.get(targetTimeName) != null) {
				Date startTime = timeStamp.getStartTime();
				Date endTime = timeStamp.getEndTime();
				if(startTime == null) {
					if(endTime != null ) {
						criteria.andLessThanOrEqualTo(targetTimeName, endTime);
					}
				}else {
					if(endTime == null) {
						criteria.andGreaterThanOrEqualTo(targetTimeName, startTime);
					}else {
						criteria.andBetween(targetTimeName, startTime, endTime);
					}
				}
			}
		}
	}

}
