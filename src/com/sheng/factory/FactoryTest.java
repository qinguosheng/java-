package com.sheng.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// ===========һ����÷�============
		// ͨ������Appleʵ�����ӿ�
		Fruit fruit = new Apple();
		// ����eat()����
		fruit.eat();

		// ===========ʹ�ù����ķ���============
		// ����ӿڶ���
		Fruit fruitFactory = null;
		// ͨ���������ʵ��
		fruitFactory = Factory.getInstance("orange");
		// ���÷���
		fruitFactory.eat();

	}

}
