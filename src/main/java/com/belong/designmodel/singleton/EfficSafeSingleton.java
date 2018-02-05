package com.belong.designmodel.singleton;

/**
 * 将synchronized放在方法内部，只有当instance为null的并且创建对象的时候才需要加锁，性能有一定提升。
 * 
 * 但是，这样的情况，还是有可能有问题的，看下面的情况：在JAVA指令中创建对象和赋值操作是分开进行的，也就是说instance = 
 * new EfficSafeSingleton();语句是两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说可能JVM会为新的Singleton实例分配
 * 空间，然后直接付给instance成员，然后再去初始化这个Singleton实例，这样就可能出错了，我们以A,B线程为例：
 * a>A,B线程同时进入了第一个if判断
 * b>A首先进入synchronized块，由于instance为null，所以他执行instance = new EfficSafeSingleton();
 * c>由于JVM内部的优化机制，JVM先画出了一些分配给EfficSafeSingleton实例的空白内存，并赋值给instance成员（注意此时JVM还没有初
 * 始化这个实例），然后A离开了synchronize块。
 * d>B进入synchronize块，由于instance此时不是null，因此它离开了synchronized块并将结果返回给调该方法的程序。
 * e>此时B线程打算使用singleton实例，却发现他没有被初始化，于是错误发生了。
 * 所以
 * @author long
 *
 */
public class EfficSafeSingleton {

	private static EfficSafeSingleton instance = null; 
	
	private EfficSafeSingleton() {};
	
	public static synchronized EfficSafeSingleton getInstance(){
		if (instance == null) {
			synchronized(instance) {
				if (instance == null) {
					instance = new EfficSafeSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public Object readResovle() {
		return instance;
	}
}
