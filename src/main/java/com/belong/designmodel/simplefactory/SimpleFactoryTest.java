package com.belong.designmodel.simplefactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = null;
		
		sender = factory.produce("mail");
		sender.send();
		
		sender = factory.produce("sms");
		sender.send();
	}
}
