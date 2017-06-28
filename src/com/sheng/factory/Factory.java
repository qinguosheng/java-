package com.sheng.factory;

/**
 * ������������ˮ���Ĺ���
 */
public class Factory {
	public static Fruit getInstance(String className) {
		// ����ӿڶ���
		Fruit fruit = null;
		
		// "apple".equals(className)����д���Ա����ָ���쳣��
		// ��Ϊ��className = null ʱ��null�ǲ��ܵ���equals()������
		// �ж����ĸ�����ı��
		if ("apple".equals(className)) {
			// ͨ��Appl��ʵ�����ӿ�
			fruit = new Apple();
		} else if("orange".equals(className)) {
			// ͨ��Orange��ʵ�����ӿ�
			fruit = new Orange();
		}
		return fruit;
	}
}
