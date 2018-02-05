package com.belong.designmodel.singleton;

/**
 * 简单的单例模式
 * 这个类可以满足基本要求，但是，这毫无线程安全保护的类。（请参考ThreadSafeSingleton）
 * @author long
 *
 */
public class SimpleSingleton {

	private static SimpleSingleton instance = null;
	
	private SimpleSingleton() {};
	
	public static SimpleSingleton getInstance(){
		if (instance == null) {
			instance = new SimpleSingleton();
		}
		
		return instance;
	}
	
	public Object readResovle() {
		return instance;
	}
}
