package com.sheng.singleton;

/**
 * 懒汉模式
 */
public class Singleton2 {
	// 1.将构造方法私有化，不允许外部直接创建对象
	private Singleton2(){
		
	}
	// 2.声明类的唯一实例，使用 private static 修饰
	private static Singleton2 instance;
	// 3.提供一个用于获取实例的方法，用public static 修饰
	public static Singleton2 getInstance(){
		// 如果实例为空，创建一个
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
	// 如果getInstance在多个线程中使用，可以在方法前面加synchronized ，也可以加如上的synchronized 代码块保证线程安全
	// 为什么懒汉模式线程不安全，
}
