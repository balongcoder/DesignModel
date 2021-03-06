package com.belong.designmodel.simplefactory;

/**
 * 多个静态方法的发送类产生的工厂
 * 	
 * 简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 * 
 * @author long
 *
 */
public class MultStaticMethodSimpleSenderFactory {
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
