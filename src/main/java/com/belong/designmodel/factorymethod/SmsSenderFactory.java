package com.belong.designmodel.factorymethod;

public class SmsSenderFactory implements SenderProvider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
