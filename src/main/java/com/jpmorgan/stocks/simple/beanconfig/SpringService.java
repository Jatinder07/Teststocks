package com.jpmorgan.stocks.simple.beanconfig;

import com.jpmorgan.stocks.simple.beanconfig.SpringServiceImpl;


public interface SpringService {
	/**
	 * Singleton instance of the SpringService.
	 */
	public SpringService INSTANCE = SpringServiceImpl.getInstance();	

	public <T extends Object> T getBean(String beanName, Class<T> objectClass);

	public <T extends Object> T getBean(Class<T> objectClass);

}
