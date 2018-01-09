package com.belong.designmodel.abstractfactory;

public class InterComputerFactory implements AbstractComputerFactory {

	@Override
	public Cpu produceCpu() {
		// TODO Auto-generated method stub
		return new InterCpu();
	}

	@Override
	public VideoCard produceVideoCard() {
		// TODO Auto-generated method stub
		return new InterVideoCard();
	}

}
