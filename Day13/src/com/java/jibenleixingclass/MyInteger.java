package com.java.jibenleixingclass;

public class MyInteger {

	/**
* A:Integer类概述
	* Integer 类在对象中包装了一个基本类型 int 的值,
	* 该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，
	* 还提供了处理 int 类型时非常有用的其他一些常量和方法
* B:构造方法
	* public Integer(int value)
	* public Integer(String s)(必须传输数字字符串)
* C:案例演示
	* 使用构造方法创建对象
------------------------------------------------
 String和int类型的相互转换
* A:int -- String
	* a:和""进行拼接 
	* b:public static String valueOf(int i)
	* c:int -- Integer -- String(Integer类的toString方法())
	* d:public static String toString(int i)(Integer类的静态方法)
* B:String -- int
	* a:String -- Integer -- int
	* public static int parseInt(String s)
--------------------------------------------------
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);  //int最大值
		System.out.println(Integer.MIN_VALUE);  //int最小值
		
		Integer i1 = new Integer(100);         //有参构造,可以直接赋int值
		System.out.println(i1);
		
		Integer i2 = new Integer("100");       //构造直接将string数字转化为int数字
		System.out.println(i2);
		
		String i4 = "123";
		int i5 = Integer.parseInt(i4);       //直接类型转换的快速方法
		System.out.println(i5);
		
		
	   
	}

}
