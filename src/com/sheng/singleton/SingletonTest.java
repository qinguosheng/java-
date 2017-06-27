package com.sheng.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		// =======  ����ģʽ  ===========
		
		// 1.���޸���Ĺ��췽��Ϊprivateʱ���ⲿ��Ͳ���ͨ�����췽��new������
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		
		// 2.Ϊ�˰�ȫ�ԣ���static��Ψһʵ��˽�л����Ͳ���ֱ�ӷ�����
//		Singleton s1 = Singleton.instance;
//		Singleton s2 = Singleton.instance;
		
		// 3.ͨ��getinstance()������ȡʵ��
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("s1��s2��ͬһ��ʵ��");
		} else {
			System.out.println("s1��s2����ͬһ��ʵ��");
		}
		
		// ==========  ����ģʽ ==================
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if (s3== s4) {
			System.out.println("s3��s4��ͬһ��ʵ��");
		} else {
			System.out.println("s3��s4����ͬһ��ʵ��");
		}

	}

}
