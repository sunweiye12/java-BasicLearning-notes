package com.java.otherclass;

public class MyMath {

	/**
* A:Math类概述
	* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
* B:成员方法
	* public static int abs(int a)
	* public static double ceil(double a)
	* public static double floor(double a)
	* public static int max(int a,int b) min自学
	* public static double pow(double a,double b)
	* public static double random()
	* public static int round(float a) 参数为double的自学
	* public static double sqrt(double a)
	 */
	public static void main(String[] args) {
		
		System.out.println(Math.random());			//得到[0.0  1.0)的小数
		System.out.println(Math.PI);            	//打印圆周率的值
		System.out.println(Math.abs(-10));      	//取绝对值
		System.out.println(Math.round(28.4));		//得到四舍五入的整数
		System.out.println(Math.ceil(12.5));    	//向上取整 得到double值
		System.out.println(Math.floor(12.5));   	//向下取整 得到double值
		System.out.println(Math.max(10,20));		//获取大值
		System.out.println(Math.pow(2,3));		    //获取2的3次方 得到double值
		System.out.println(Math.sqrt(2));           //对2开平方
			
	}

}
