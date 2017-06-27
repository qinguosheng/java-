package com.sheng.singleton;
/**
 * ����ģʽSingleton
 * Ӧ�ó��ϣ���Щ����ֻ��Ҫһ������Ŵ��ʵۣ����ŵ�
 * ��֤����Ӧ�ó����У�ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 */
public class Singleton {

	// 1.�����췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton() {
	}
	// 2.������Ψһʵ����ʹ�� private static ����
	private static Singleton instance = new Singleton();
	// 3.�ṩһ�����ڻ�ȡʵ���ķ�����ʹ�� public static ����
	public static Singleton getInstance() {
		return instance;
	}
}
