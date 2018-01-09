package com.belong.designmodel.simplefactory;

/**
 * 邮件发送类
 * 
 * 简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。
 * 
 * @author long
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("This is MailSender!");
	}

}
