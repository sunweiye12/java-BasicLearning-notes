package com.java.otherclass;

public class MySystem {

	/**
* A:System类的概述
	* System 类包含一些有用的类字段和方法。它不能被实例化。 
* B:成员方法
	* public static void gc()
	* public static void exit(int status)
	* public static long currentTimeMillis()   //计算程序的运行时间
	* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
	 */
	public static void main(String[] args) {
		//系统垃圾回收器();
		//退出java虚拟机();
		//获取当前时间的毫秒值_计算程序运行时间();
		
		/* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		
		src - 源数组。                                                   (被复制的数组)
		srcPos - 源数组中的起始位置。
		dest - 目标数组。                                            (复制到此数组)
		destPos - 目标数据中的起始位置。
		length - 要复制的数组元素的数量。
		*/
		
	}



	private static void 获取当前时间的毫秒值_计算程序运行时间() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.print("星星");
		}
		long end = System.currentTimeMillis();
		System.out.println("-----------------");
		System.out.println(end - start);   //获取上面程序的运行时间(毫秒单位)
	}



	private static void 退出java虚拟机() {
		System.exit(0);                     //退出java虚拟机,,执行后将不在执行后面的程序
		System.out.println("111111111111111");
	}

	
	
	private static void 系统垃圾回收器() {
		for(int i = 0;i < 2; i++) {
			new XinDeduixiang();
			System.gc();      //启动系统的垃圾回收器,相当于呼喊保洁阿姨
		}
	}
}

class XinDeduixiang {

	@Override
	public void finalize() throws Throwable {    //这是object类中一个启动垃圾回收器的方法 ,可是只有在垃圾走够多的时候他才会自动调用
		System.out.println("垃圾被回收了");
	}
	
	
}