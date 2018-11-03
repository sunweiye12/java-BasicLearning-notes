package com.java.多线程;

public class My1单例设计 {

	/**
	 * @param args
	 *  单例设计模式：保证类在内存中只有一个对象。
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);

	}

}

//饿汉式                                   只能创建一个对象
class Singleton {
			//1,私有构造函数
	private Singleton(){}
			//2,创建本类对象
	private static Singleton s = new Singleton();   //对象创建好了,调用下面方法的时候不用再创建
			//3,对外提供公共的访问方法
	public static Singleton getInstance() {
		return s;
	}
			
	public static void print() {
		System.out.println("11111111111");
	}
}

//懒汉式,单例的延迟加载模式   面试
class Singletonh {
	     	//1,私有构造函数
	private Singletonh(){}
			//2,声明一个本类的引用
	private static Singletonh s;
			//3,对外提供公共的访问方法
	public static Singletonh getInstance() {   //当我每次调用的时候我在创建对象
		if(s == null)
			//线程1,线程2
			s = new Singletonh();
		return s;
	}
	
	public static void print() {
		System.out.println("11111111111");
	}
}

class Singletonhh {
	private Singletonhh() {}

	public static final Singletonhh s = new Singletonhh();  //final是最终的意思,被final修饰的变量不可以被更改
}