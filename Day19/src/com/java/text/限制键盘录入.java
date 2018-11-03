package com.java.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class 限制键盘录入 {

	/**
    * 键盘录入一个int类型的整数,对其求二进制表现形式
	 * 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
	 * 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
	 * 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");		
		
		while(true) {
			String line = sc.nextLine();	
			try {
				int i = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(i));
			} catch (Exception e) {
				 try {
					 new BigInteger(line);
					 System.out.println("录入错误,您输入的整数过大,请您重新输入一个整数: ");
				} catch (Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("录入错误,您输入的为一个小数,请您重新输入一个整数: ");
					} catch (Exception e2) {					
						System.out.println("录入错误,您输入的是非法字符,请您重新输入一个整数: ");
					} 
				}
			}
		} 
		

	}

}
