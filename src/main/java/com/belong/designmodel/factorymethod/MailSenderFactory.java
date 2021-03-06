package com.belong.designmodel.factorymethod;

/**
 * 邮件发送的工厂类
 * 具体工厂角色
 * 这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建产品对象。
 * 
 * @author long
 *
 */
public class MailSenderFactory implements SenderProvider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
