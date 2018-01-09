package com.belong.designmodel.factorymethod;

/**
 * 短信发送类
 * 具体产品角色
 * 简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。
 * 
 * @author long
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("This is SmsSender!");
	}

}
