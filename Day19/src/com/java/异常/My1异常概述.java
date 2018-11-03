package com.java.异常;

public class My1异常概述 {

	/**
	 * 运行过程出现的错误(可查看API中的Throwable)
	 * 
	 * NullPointerException 空指针异常
	 * ArrayIndexOutOfBoundsException  索引越界异常
	 * ClassCastException  类型转换异常
	 * 
	 * 异常的继承体系
	* Throwable
		* Error	
		* Exception
			* RuntimeException(运行时出现的异常)
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
	//	arr = null;
		System.out.println(arr[10]);
	}

}
