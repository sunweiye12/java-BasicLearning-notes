package com.java.myScanner;

import java.util.Scanner;

public class TextScanner {

	/*
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   	 	//键盘录入

		System.out.println("请输入一个整数:");
		if(sc.hasNextInt()) {                  		//hasNextInt()方法,判断键盘录入的是否为一个int类型数
//			int i = sc.nextInt();					//获取键盘录入的整数 存储到i中
			String i = sc.nextLine();
			System.out.println("我获取的数字是:" + i);
		} else {
			System.out.println("请输入一个int数!!");
		}
		
		/*
		 * 当int类型和string类型一起键盘录入的时候要创建两次对象
		 */
		System.out.println();//换行
		
		Scanner sc2 = new Scanner(System.in);   	//重新创建对象
		System.out.println("请输入一个字符串:");
		String line = sc2.nextLine();	  			//获取键盘录入的字符串    在此录入前如果遇到回车键\r\n此语句自动结束
		System.out.println("我获取的字符串是:" + line);
		
	}

}
