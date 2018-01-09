package com.belong.designmodel.abstractfactory;

public class PovosComputerFactory implements AbstractComputerFactory {

	@Override
	public Cpu produceCpu() {
		// TODO Auto-generated method stub
		return new PovosCpu();
	}

	@Override
	public VideoCard produceVideoCard() {
		// TODO Auto-generated method stub
		return new PovosVideoCard();
	}

}
