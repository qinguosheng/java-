package com.sheng.factory;

/**
 * 定义生产各种水果的工厂
 */
public class Factory {
	public static Fruit getInstance(String className) {
		// 定义接口对象
		Fruit fruit = null;
		
		// "apple".equals(className)这样写可以避免空指向异常，
		// 因为当className = null 时，null是不能调用equals()方法的
		// 判断是哪个子类的标记
		if ("apple".equals(className)) {
			// 通过Appl类实例化接口
			fruit = new Apple();
		} else if("orange".equals(className)) {
			// 通过Orange类实例化接口
			fruit = new Orange();
		}
		return fruit;
	}
}
