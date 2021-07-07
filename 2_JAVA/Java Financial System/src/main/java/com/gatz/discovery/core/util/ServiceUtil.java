package com.gatz.discovery.core.util;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * 功能说明：spring 工具类
 * @updated
 */
public class ServiceUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ServiceUtil.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	/**
	 * 功能说明：从applicationcontext中获取bean
	 * @param beanName
	 * @return
	 */
	public static Object getService(String beanName) {
		return applicationContext.getBean(beanName);
	}

}
