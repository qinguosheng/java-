package com.sheng.factory;

/*
 * ����һ��ˮ���Ľӿ�
 */
public interface Fruit {
	// ��ˮ���ķ���
	public void eat();
}

/**
 * ��������Apple
 */
class Apple implements Fruit {
	// ��дeat()����
	public void eat() {
		System.out.println("*** ��ƻ��");
	}
}

/**
 * ��������Orange
 */
class Orange implements Fruit {
	// ��дeat()����
	public void eat() {
		System.out.println("*** ������");
	}
}
