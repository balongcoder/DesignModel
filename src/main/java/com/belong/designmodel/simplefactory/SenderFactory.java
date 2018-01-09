package com.belong.designmodel.simplefactory;

public class SenderFactory {

	public Sender produce(String senderType) {
		
		if("mail".equals(senderType)) {
			return new MailSender();
		} else if("sms".equals(senderType)) {
			return new SmsSender();
		}
		
		return null;
	}
}
