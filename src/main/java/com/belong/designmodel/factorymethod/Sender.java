package com.belong.designmodel.factorymethod;

/**
 * 发送消息的接口类
 * 抽象产品角色
 * 简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
 * 
 * @author long
 *
 */
public interface Sender {
	public void send();
}
