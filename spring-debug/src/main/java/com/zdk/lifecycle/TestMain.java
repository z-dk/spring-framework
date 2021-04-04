package com.zdk.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>类 名 称</b> :  TestMain<br/>
 * <b>类 描 述</b> :  <br/>
 * <b>创 建 人</b> :  zhudengkui<br/>
 * <b>创建时间</b> :  2021/4/4 8:49<br/>
 * <b>修 改 人</b> :  zhudengkui<br/>
 * <b>修改时间</b> :  2021/4/4 8:49<br/>
 * <b>修改备注</b> :  <br/>
 *
 * @author zdk
 */
public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("circle-depend.xml");
		SpringBeanLifeCycle bean = applicationContext.getBean(SpringBeanLifeCycle.class);
		System.out.println(bean.getMyProperty());
	}
	
}
