package com.novo.commons.util;

/**
 * 经纬度（大小）
 * @author kemingheng  2020年3月10日
 */
public class Distance {
	
   private double minlng ;    //最小经度
   private double maxlng ;    //最大经度
   private double minlat ;    //最小纬度
   private double maxlat ;    //最大纬度
   
	public double getMinlng() {
		return minlng;
	}
	public void setMinlng(double minlng) {
		this.minlng = minlng;
	}
	public double getMaxlng() {
		return maxlng;
	}
	public void setMaxlng(double maxlng) {
		this.maxlng = maxlng;
	}
	public double getMinlat() {
		return minlat;
	}
	public void setMinlat(double minlat) {
		this.minlat = minlat;
	}
	public double getMaxlat() {
		return maxlat;
	}
	public void setMaxlat(double maxlat) {
		this.maxlat = maxlat;
	}  

   
}
