package com.belong.designmodel.factorymethod;

/**
 * 发送类创建的抽象工厂
 * 
 * 抽象工厂角色
 * 是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
 * @author long
 *
 */
public interface SenderProvider {
	public Sender produce();
}
