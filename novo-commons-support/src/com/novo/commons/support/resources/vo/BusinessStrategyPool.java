package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessStrategyPool implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private static final String strategy_key = "${orgCode}@${businessCode}";
	private static final String strategy_orgCode = "${orgCode}";
	private static final String strategy_businessCode = "${businessCode}";

	public Map<String ,BusinessStrategyVo> pool = new HashMap<String,BusinessStrategyVo>();
	
	public void updateBusinessStrategy(List<BusinessStrategyVo> businessStrategyVoList) {
		if(businessStrategyVoList != null && !businessStrategyVoList.isEmpty()) {
			pool.clear();
			for(BusinessStrategyVo bs : businessStrategyVoList) {
				pool.put(this.getKey(bs.getOrgCode(), bs.getBusinessCode()), bs);
			}
		}
	}
	
	public BusinessStrategyVo getBusinessStrategy(String orgCode,String businessCode) {
		return pool.get(this.getKey(orgCode, businessCode));
	}
	
	private String getKey(String orgCode,String businessCode) {
		return strategy_key.replace(strategy_orgCode, orgCode)
				.replace(strategy_businessCode, businessCode);
	}
}
