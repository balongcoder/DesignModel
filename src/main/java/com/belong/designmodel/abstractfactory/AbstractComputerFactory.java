package com.belong.designmodel.abstractfactory;

public interface AbstractComputerFactory {

	public Cpu produceCpu();
	
	public VideoCard produceVideoCard();
}
