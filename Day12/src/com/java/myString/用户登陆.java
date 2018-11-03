package com.java.myString;

import java.util.Scanner;

public class 用户登陆 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i < 3;i++){
			System.out.println("请输入用户名:");
			String userName = sc.nextLine();
			System.out.println("请输入登录密码:");
			String passWord = sc.nextLine();
	
			if ("admin".equals(userName) && "admin".equals(passWord)) {
				System.out.println("欢迎" + userName + "登陆本系统");
				break;
			} else {
				if (i==2) {
					System.out.println("您的机会用完啦,请明天再来吧!");
				} else {
					System.out.println("您输入的用户名或密码有误,你还剩"+ (2-i) + "次机会!");
				}
			}
		}
	}

}
