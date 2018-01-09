package com.belong.designmodel.simplefactory;

/**
 * 普通发送类产生的工厂
 * 	
 * 简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 * 
 * @author long
 *
 */
public class SimpleSenderFactory {

	public static String MAIL_SENDER = "mail";
	public static String SMS_SENDER = "sms";
	
	public Sender produce(String senderType) {
		
		if(MAIL_SENDER.equals(senderType)) {
			return new MailSender();
		} else if(SMS_SENDER.equals(senderType)) {
			return new SmsSender();
		}
		
		return null;
	}
}
