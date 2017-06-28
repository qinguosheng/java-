package com.sheng.factory;

/*
 * 定义一个水果的接口
 */
public interface Fruit {
	// 吃水果的方法
	public void eat();
}

/**
 * 定义子类Apple
 */
class Apple implements Fruit {
	// 覆写eat()方法
	public void eat() {
		System.out.println("*** 吃苹果");
	}
}

/**
 * 定义子类Orange
 */
class Orange implements Fruit {
	// 覆写eat()方法
	public void eat() {
		System.out.println("*** 吃橘子");
	}
}
