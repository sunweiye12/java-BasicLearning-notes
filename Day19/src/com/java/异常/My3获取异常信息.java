package com.java.异常;

/*
 * * A:Throwable的几个常见方法
	* a:getMessage()
		* 获取异常信息，返回字符串。
	* b:toString()
		* 获取异常类名和异常信息，返回字符串。
	* c:printStackTrace()
		* 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
		* 
	finally的实用

 */
public class My3获取异常信息 {
	public static void main(String[] args) {
		
//		try {
//			System.out.println(1/0);
//		} catch (Exception e) {				//相当于Exception e = new ArithmeticException: /(" by zero")();
//			System.out.println("出错了");
////			System.out.println(e.getMessage());        //获取异常那个信息
////			System.out.println(e.toString());          //获取异常那个信息类名 和 异常信息
//			e.printStackTrace();						//获取异常那个信息类名 和 异常信息 以及在代码中的位置 没有返回值
//		}                                                //JVM默认处理方式
		
		
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("出错了");
		} finally {
			System.out.println(10/2);           //将错误信息改成此处执行的语句(不管对错 都会执行)
		}
	}

}
