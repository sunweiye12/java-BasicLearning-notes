package com.java.regex;

import java.util.Scanner;

public class MyRegex {

	/**
 A:正则表达式
	* 是指一个用来描述或者匹配一系列符合某个语法规则的字符串的单个字符串。其实就是一种规则。有自己特殊的应用。
	* 作用:比如注册邮箱,邮箱有用户名和密码,一般会对其限制长度,这个限制长度的事情就是正则表达式做的
* B:案例演示
	* 需求：校验qq号码.
		* 1:要求必须是5-15位数字
		* 2:0不能开头
		* 3:必须都是数字
		* 校验qq
		* 1.明确返回值类型 boolean
		* 2.参数列表 String qq
	* a:非正则表达式实现
	* b:正则表达式实现
	 */
	public static void main(String[] args) {
//		* 需求：校验qq号码.
//		* 1:要求必须是5-15位数字
//		* 2:0不能开头
//		* 3:必须都是数字
//		* 校验qq
//		* 1.明确返回值类型 boolean
//		* 2.参数列表 String qq
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您注册的QQ号码:");
		
		String qq = sc.nextLine();
		//System.out.println(qq);
		System.out.println(checkqq(qq));
//                                                 运用原来学的知识设计
	}
	public static boolean checkqq(String qq) {
		boolean falg = true;
		if(qq.length() <= 15 && qq.length() >= 5) {
			if(!qq.startsWith("0")) {
				char arr[] = qq.toCharArray();  //将字符串转化为字符数组
				for (int i = 0;  i < arr.length; i++) {
					if(!(arr[i] >= '0' && arr[i] <= '9')) {						
						falg = false;    //不是数字返回false
						System.out.println("必须都是数字");
						break;
					}
				}
			} else {
				falg = false;         //如果以0开头则返回false
				System.out.println("0不能开头");
			}
		} else {
			falg = false;             //如果字符串长度不符合要求就返回false
			System.out.println("要求必须是5-15位数字");
		}
		if(falg == true) {
			System.out.println("注册成功!");
		}
		return falg;
		
	}
}
