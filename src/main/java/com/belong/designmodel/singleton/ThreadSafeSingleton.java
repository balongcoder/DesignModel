package com.belong.designmodel.singleton;

/**
 * 这是个线程安全的类,但是将synchronized放在方法上，synchronized锁住的是这个对象，这样的用法在性能上有所下降，因为每一次调用
 * getInstance，都要锁住这个对象。
 * 
 * @author long
 *
 */
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance = null;
	
	private ThreadSafeSingleton() {};
	
	public static synchronized ThreadSafeSingleton getInstance(){
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}
	
	public Object readResovle() {
		return instance;
	}
}
