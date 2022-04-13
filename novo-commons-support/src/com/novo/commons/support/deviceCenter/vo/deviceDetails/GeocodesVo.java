package com.novo.commons.support.deviceCenter.vo.deviceDetails;

/**
 * 
 * @author liuhuan
 *
 */
public class GeocodesVo{
   
	/*结构化地址信息**/
	//private String formatted_address;
	/*地址所在的省份名**/
	//private String province;
	/*地址所在的城市名**/
	//private String city;
	/*城市编码**/
	//private String citycode;
	/*地址所在的区**/
	//private String district;
	/*地址所在的乡镇**/
	//private String township;
	/*街道**/
	//private String street;
	/*门派**/
	//private String number;
	/*区域编码**/
	//private String adcode;
	/*坐标点 经纬度（逗号分割）**/
	private String location;
	/*匹配级别**/
	//private String level;

 
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	 
	
	
}
