package com.zdk.circle;

/**
 * <b>类 名 称</b> :  A<br/>
 * <b>类 描 述</b> :  循环依赖测试类A<br/>
 * <b>创 建 人</b> :  zhudengkui<br/>
 * <b>创建时间</b> :  2021/4/3 16:27<br/>
 * <b>修 改 人</b> :  zhudengkui<br/>
 * <b>修改时间</b> :  2021/4/3 16:27<br/>
 * <b>修改备注</b> :  <br/>
 *
 * @author zdk
 */
public class A {
	
	private B b;
	
	public B getB() {
		return b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
}
