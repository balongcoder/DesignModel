package com.belong.designmodel.singleton;

public class PerfectSingleton {
	
	private PerfectSingleton() {};
	
	private static class SingletonFactory{
		private static PerfectSingleton instance = new PerfectSingleton();
	}
	
	public static PerfectSingleton getInstance(){
		return SingletonFactory.instance;
	}
	
	public Object readResovle() {
		return getInstance();
	}
}
