package com.gatz.discovery.modules.cidm.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public static ArrayList parseDateString(ArrayList arryl){
		ArrayList array = new ArrayList<>();
		for (Object o : arryl) {
			String dates = (String)o;
			StringBuilder sb=new StringBuilder(dates);
			if(String.valueOf(sb.charAt(4)).equals("0")){
				sb.replace(4, 5, "/");
			}else{
				sb.insert(4,"/");
			}
			array.add(sb);
		}
		return array;
	}
	/**
	 * 参数字符编码问题
	 * @param str
	 * @return
	 */
	public static String encodeStr(String str) {  
       try {  
           return new String(str.getBytes("ISO-8859-1"), "UTF-8");  
       } catch (UnsupportedEncodingException e) {  
           e.printStackTrace();  
           return null;  
       }  
	}

}
