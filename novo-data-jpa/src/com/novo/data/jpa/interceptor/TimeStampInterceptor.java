package com.novo.data.jpa.interceptor;

import com.novo.data.jpa.query.QueryParam;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.TimeStamp;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TimeStampInterceptor implements QueryInterceptor<List<QueryParam>>{

	@Override
	public <T extends RequestProtocol> void intercept(List<QueryParam> query, T requestProtocol,
			Map<String, Field> entFields) throws Exception {
		if(TimeStamp.class.isAssignableFrom(requestProtocol.getClass())) {
			TimeStamp timeStamp = (TimeStamp)requestProtocol;
			String targetTimeName = timeStamp.targetTimeName();
			if(targetTimeName != null && !targetTimeName.equals("") && entFields.get(targetTimeName) != null) {
				Date startTime = timeStamp.getStartTime();
				Date endTime = timeStamp.getEndTime();
				if(startTime == null) {
					if(endTime != null ) {
						query.add(new QueryParam(targetTimeName,endTime,QueryType.less_than_or_equal_to,Date.class));
					}
				}else {
					if(endTime == null) {
						query.add(new QueryParam(targetTimeName,startTime,QueryType.greater_than_or_equal_to,Date.class));
					}else {
						List<Date> dataList = new ArrayList<Date>();
						dataList.add(startTime);
						dataList.add(endTime);
						query.add(new QueryParam(targetTimeName,dataList,QueryType.between,Date.class));
					}
				}
			}
			
			entFields.remove(targetTimeName);
		}
	}

}
