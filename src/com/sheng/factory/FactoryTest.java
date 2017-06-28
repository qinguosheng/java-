package com.sheng.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// ===========一般的用法============
		// 通过子类Apple实例化接口
		Fruit fruit = new Apple();
		// 调用eat()方法
		fruit.eat();

		// ===========使用工厂的方法============
		// 定义接口对象
		Fruit fruitFactory = null;
		// 通过工厂获得实例
		fruitFactory = Factory.getInstance("orange");
		// 调用方法
		fruitFactory.eat();

	}

}
