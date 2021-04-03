package com.zdk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>类 名 称</b> :  PlaceHoldTest<br/>
 * <b>类 描 述</b> :  配置数据源测试<br/>
 * <b>创 建 人</b> :  zhudengkui<br/>
 * <b>创建时间</b> :  2021/4/3 8:42<br/>
 * <b>修 改 人</b> :  zhudengkui<br/>
 * <b>修改时间</b> :  2021/4/3 8:42<br/>
 * <b>修改备注</b> :  <br/>
 * @author zdk
 */
public class PlaceHoldTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("placehold-test.xml");
		Object dataSource = applicationContext.getBean("dataSource");
		System.out.println(dataSource);
	}
	
}
