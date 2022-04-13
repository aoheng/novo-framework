package com.novo.commons.util;

/**
 * 通过经纬度计算两个点的之间的距离的算法 
 * @author kemingheng  2020年3月7日
 */
public class DistanceUtils {
	
	//地球平均半径 （米） 
    private static final double EARTH_RADIUS = 6378137; 
    
    
    /**
	 * 把经纬度转为度（°）
	 * @param d
	 * @return
	 */
	private static double rad(double d){  
	       return d * Math.PI / 180.0;  
	} 
	
	/**
	 * 根据两点间经纬度坐标（double值），计算两点间距离，单位为米
	 * @param lng1
	 * @param lat1
	 * @param lng2
	 * @param lat2
	 * @return
	 */
	public static double getDistance(double lng1, double lat1, double lng2, double lat2){  
	       double radLat1 = rad(lat1);  
	       double radLat2 = rad(lat2);  
	       double a = radLat1 - radLat2;  
	       double b = rad(lng1) - rad(lng2);  
	       double s = 2 * Math.asin(  
	            Math.sqrt(  
	                Math.pow(Math.sin(a/2),2)   
	                + Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)  
	            )  
	        );  
	       s = s * EARTH_RADIUS;  
	       s = Math.round(s * 10000) / 10000;  
	       return s;  
    }  
	
	/**
	 * 查询半径为5km的正方形四个点的经纬度
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	public static Distance getDistance(double longitude, double latitude){
		//先计算查询点的经纬度范围  
        double r = 6371;//地球半径千米  
        double dis = 5;//5千米距离  
        double dlng =  2*Math.asin(Math.sin(dis/(2*r))/Math.cos(latitude*Math.PI/180));  
        dlng = dlng*180/Math.PI;//角度转为弧度  
        double dlat = dis/r;  
        dlat = dlat*180/Math.PI;          
        double minlng = longitude -dlng;  
        double maxlng = longitude + dlng;
        double minlat =latitude-dlat;  
        double maxlat = latitude+dlat;  
        
        Distance obj=new Distance();
        obj.setMinlng(minlng);
        obj.setMaxlng(maxlng);
        obj.setMinlat(minlat);
        obj.setMaxlat(maxlat);
		return obj;
	};

}
