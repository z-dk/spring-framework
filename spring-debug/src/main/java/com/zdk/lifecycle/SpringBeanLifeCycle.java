package com.zdk.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <b>类 名 称</b> :  SpringBeanLifeCycle<br/>
 * <b>类 描 述</b> :  springbean的生命周期测试<br/>
 * <b>创 建 人</b> :  zhudengkui<br/>
 * <b>创建时间</b> :  2021/4/4 8:35<br/>
 * <b>修 改 人</b> :  zhudengkui<br/>
 * <b>修改时间</b> :  2021/4/4 8:35<br/>
 * <b>修改备注</b> :  <br/>
 *
 * @author zdk
 */
public class SpringBeanLifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		BeanPostProcessor, InitializingBean, DisposableBean {
	
	private BeanFactory beanFactory;
	
	private String beanName;
	
	private ApplicationContext applicationContext;
	
	private String myProperty;
	
	public void initMethod() {
		System.out.println("initMethod...");
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod...");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("setBeanFactory");
	}
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("setBeanName...");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet...");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("setApplicationContext...");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【"+beanName+"】postProcessBeforeInitialization...");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【"+beanName+"】postProcessAfterInitialization...");
		return bean;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy...");
	}
	
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
	
	public String getBeanName() {
		return beanName;
	}
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	public String getMyProperty() {
		return myProperty;
	}
	
	public void setMyProperty(String myProperty) {
		this.myProperty = myProperty;
	}
}
