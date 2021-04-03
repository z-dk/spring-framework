package com.zdk.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>类 名 称</b> :  Test<br/>
 * <b>类 描 述</b> :  测试类<br/>
 * <b>创 建 人</b> :  zhudengkui<br/>
 * <b>创建时间</b> :  2021/4/3 16:29<br/>
 * <b>修 改 人</b> :  zhudengkui<br/>
 * <b>修改时间</b> :  2021/4/3 16:29<br/>
 * <b>修改备注</b> :  <br/>
 *
 * @author zdk
 */
public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("circle-depend.xml");
		A a = applicationContext.getBean(A.class);
		B b = applicationContext.getBean(B.class);
		System.out.println(a);
		System.out.println(b);
	}
	
}
