package com.sheng.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		// =======  饿汉模式  ===========
		
		// 1.当修改类的构造方法为private时，外部类就不能通过构造方法new对象了
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		
		// 2.为了安全性，把static的唯一实例私有化，就不能直接访问了
//		Singleton s1 = Singleton.instance;
//		Singleton s2 = Singleton.instance;
		
		// 3.通过getinstance()方法获取实例
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("s1和s2是同一个实例");
		} else {
			System.out.println("s1和s2不是同一个实例");
		}
		
		// ==========  懒汉模式 ==================
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if (s3== s4) {
			System.out.println("s3和s4是同一个实例");
		} else {
			System.out.println("s3和s4不是同一个实例");
		}

	}

}
