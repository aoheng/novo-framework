package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.util.List;

/**
 * 调用高德返回的数据
 * @author liuhuan
 *
 */
public class AutonaviVo {
   
	//返回结果状态值 (返回值为 0 或 1，0 表示请求失败；1 表示请求成功。)
	private Integer status;
	//返回结果数目
	private Integer count;
	//返回状态说明 当 status 为 0 时，info 会返回具体错误原因，否则返回“OK”。
	private String info;
	 
	//地理编码信息列表
	private List<GeocodesVo> geocodes;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	 
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	 
	public List<GeocodesVo> getGeocodes() {
		return geocodes;
	}
	public void setGeocodes(List<GeocodesVo> geocodes) {
		this.geocodes = geocodes;
	}
 
	
	
}
