package com.java.stringbuffer;

import java.util.Scanner;

public class MyStringBuffer案例 {

	/**
	* A:案例演示
	* 需求：把数组中的数据按照指定个格式拼接成一个字符串
	* 
			举例：
				int[] arr = {1,2,3};	
			输出结果：
				"[1, 2, 3]"
				
			用StringBuffer的功能实现
-------------------------------------------------------------
 A:案例演示
* 
		需求：把字符串反转
			举例：键盘录入"abc"		
			输出结果："cba"
			
		用StringBuffer的功能实现
-------------------------------------------------------------
	 */
	public static void main(String[] args) {
		//Text1();     //调用将数组转换成字符串的方法
		//Text2();     //将键盘输入的字符反转输出

	}



	private static void Text2() {
		Scanner sc = new Scanner(System.in);  //创建键盘录入对象
		String line = sc.nextLine();			//将键盘录入的数据放入line中
		
		System.out.println(revString(line));
	}
	
	
	
	private static void Text1() {
		int[] arr = {1,2,3,4};		
		System.out.println(Array2String(arr));  //调用将数组转换成字符串的方法
	}
	/*
	 抽取将数组转换为字符串的方法
	 1.返回值类型是string
	 2.参数列表为int[] 
	 */
	
	public static String revString(String line) {
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		
		return sb.toString();
		
	}
	public static String Array2String(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append('[');
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				sb.append(arr[i] ).append("]");  //一种方式
			} else {
				sb.append(arr[i] + ", ");        //另一种方式
			}
			
		}
		return sb.toString();
	}
}
