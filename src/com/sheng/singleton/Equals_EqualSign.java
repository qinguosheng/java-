package com.sheng.singleton;

public class Equals_EqualSign {

	public static void main(String[] args) {
		// (1).对于基本类型的变量。“==”和“equal”的区别
		int t1 = 40;
		int t2 = 50;
		int t3 = 90;
		int t4 = 90;
		
		// (1.1)."=="对于基本类型，判断两个变量的值是否相等。
		boolean result1 = (t1 == t2);
		boolean result2 = ((t1 + t2) == t3);
		boolean result3 = (t3 == t4);
		
		System.out.println("[t1 == t2]=>" + result1);
		System.out.println("[(t1 + t2) == t3]=>" + result2);
		System.out.println("[(t3 == t4)]=>" + result3);
		System.out.println("================================");
		
		// (1.2)."equal"不能用于基本数据类型。只能用于类变量。对于基本数据类型要用其包装类。
		Integer i1 = new Integer(t1);
		Integer i2 = new Integer(t2);
		Integer i3 = new Integer(t3);
		Integer i4 = new Integer(t4);
		
		boolean ri1 = i1.equals(i2);
		boolean ri2 = i3.equals(i1+ i2);
		boolean ri3 = i3.equals(i4);
		
		System.out.println("[i1.equals(i2)]=>" + ri1);
		System.out.println("[i3.equals(i1+ i2)]=>" + ri2);
		System.out.println("[i3.equals(i4)]=>" + ri3);
		System.out.println("================================");
		
		// (2).对于对象变量，“==”和“equal”的区别
		String st1 = "wasiker";
		String st2 = " is super man";
		String st3 = "wasiker is super man";
		String st4 = "wasiker is super man";
		
		boolean b1 = (st1 == st2);
		boolean b2 = ((st1+st2) == st3);
		boolean b3 = (st3 == st4);
		
		System.out.println("[st1 == st2]=>" + b1);
		System.out.println("[(st1+st2) == st3]=>" + b2);
		System.out.println("[st3 == st4]=>" + b3);
		System.out.println("================================" + st1 + st2);
		
		boolean r1 = st1.equals(st2);
		boolean r2 = (st1 + st2).equals(st3);
		boolean r3 = st3.equals(st4);
		System.out.println("[st1.equals(st2)]=>" + r1);
		System.out.println("[(st1 + st2).equals(st3)]=>" + r2);
		System.out.println("[st3.equals(st4)]=>" + r3);
		System.out.println("================================" + st1 + st2);
		
		//因为对象变量的存储的是对象在内存中的路径，即内存地址。所以用“==”比较时，即使 
		//对象的值相等，但是他们的内存地址不同，所以==的结果为false。故“==”用于比较两 
		//个变量的值是否相等，而不是变量引用的对象是否相等 
		//equal用于比较两个对象是否相同。
		
//		总之： 
//		“==”比较的是值【变量(栈)内存中存放的对象的(堆)内存地址】 
//		equal用于比较两个对象的值是否相同【不是比地址】
		
//		【特别注意】Object类中的equals方法和“==”是一样的，没有区别，而String类，Integer类等等一些类，
//		是重写了equals方法，才使得equals和“==不同”，所以，当自己创建类时，自动继承了Object的equals方法，
//		要想实现不同的等于比较，必须重写equals方法。
	}

}
