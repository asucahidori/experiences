package com.gatz.discovery.core.util;

/**
 * 坐标工具
 * 
 * @author jh
 *
 */
public class CoordinateUtil {

	/**
	 * 百度转火星
	 * 
	 * @param gg_lat
	 * @param gg_lon
	 * @return
	 */
	public static double[] gd2bd(double gg_lon, double gg_lat) {
		double x = gg_lon, y = gg_lat;
		double z = Math.sqrt(x * x + y * y) + 0.00002 * Math.sin(y * Math.PI);
		double theta = Math.atan2(y, x) + 0.000003 * Math.cos(x * Math.PI);

		double bd_lon = z * Math.cos(theta) + 0.0065;
		double bd_lat = z * Math.sin(theta) + 0.006;
		double[] coor = new double[2];
		coor[0] = bd_lon;
		coor[1] = bd_lat;
		return coor;
	}

	/**
	 * 火星转百度
	 * 
	 * @param bd_lat
	 * @param bd_lon
	 * @return
	 */
	public static double[] bd2gd(double bd_lon, double bd_lat) {
		double x = bd_lon - 0.0065, y = bd_lat - 0.006;
		double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * Math.PI);
		double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * Math.PI);
		double gg_lon = z * Math.cos(theta);
		double gg_lat = z * Math.sin(theta);

		double[] coor = new double[2];
		coor[0] = gg_lon;
		coor[1] = gg_lat;
		return coor;
	}
}
