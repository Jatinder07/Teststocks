package com.jpmorgan.stocks.simple.beanconfig;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringServiceImpl implements SpringService {
	
	/**
	 * Logger service for the class.
	 */
	private Logger logger = Logger.getLogger(SpringServiceImpl.class);

	private static final String SPRING_CONTEXT_FILE_NAME = "classpath*:*stocks-*-context.xml";

	/**
	 * Spring context object.
	 */
	private AbstractApplicationContext springContext = null;
	
	private static final SpringService INSTANCE = new SpringServiceImpl();

	private SpringServiceImpl(){
		logger.info("Loading Spring Context for Super Simple Stocks.");
		springContext = new ClassPathXmlApplicationContext(SPRING_CONTEXT_FILE_NAME);
		springContext.registerShutdownHook();
		logger.info("Spring Context created !!!! Successfully !!!!");
	}
	
	
	public static SpringService getInstance(){
		return INSTANCE;
	}	
	
	public <T> T getBean(String beanName, Class<T> objectClass) {
		return springContext.getBean(beanName, objectClass);
	}

	public <T> T getBean(Class<T> objectClass) {
		return springContext.getBean(objectClass);
	}

}
