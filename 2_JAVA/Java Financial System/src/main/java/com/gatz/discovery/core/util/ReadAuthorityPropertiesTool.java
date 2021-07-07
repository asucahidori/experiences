package com.gatz.discovery.core.util;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * 读取properties文件的工具类
 *
 */
public class ReadAuthorityPropertiesTool {

    private static Properties p = new Properties();

    static {
        try {
            p.load(ReadAuthorityPropertiesTool.class.getClassLoader().getResourceAsStream("authorityAPI.properties"));
        } catch (IOException e) {
            System.out.println("读取配置信息出错！");
        }
    }

    /**
     * 根据key得到value的值
     */
    public static String getValue(String key) {
        return p.getProperty(key);
    }
    public static void main(String args[]){
       System.out.println( ReadAuthorityPropertiesTool.getValue("authority.domain")+"---------------dddddddddddddd");
    }
}
