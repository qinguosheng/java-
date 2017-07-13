package com.sheng.proxy;

/**
 * 静态代理模式
 */
public class StaticProxy {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		Subject subject = new ProxySubject(realSubject);
		String info = subject.say("sheng", 100);
		System.out.println(info);
	}

}

/**
 * 1.真实对象和代理对象的共同接口
 * (首先是抽象角色，可以定义一个接口或者抽象类)
 */
interface Subject {
	// 定义抽象方法
	public String say(String name, int age);
}

/**
 * 2.真实角色
 * (之后是真实角色类，实现接口，并完成实际工作)
 */
class RealSubject implements Subject {
	@Override
	public String say(String name, int age) {
		
		return "姓名：" + name + ", 年龄：" + age;
	}
	
}

/**
 * 3.代理角色
 * (然后定义代理角色，内部包含对真实角色对象的引用，并且封装功能：)
 */
class ProxySubject implements Subject {
	// 代理角色对象内部含有对真实对象的引用
	private Subject subject = null;
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String say(String name, int age) {
		// 真实角色所完成的事情
		return this.subject.say(name, age);
	}
	
}