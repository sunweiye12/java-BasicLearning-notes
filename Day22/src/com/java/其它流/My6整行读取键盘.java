package com.java.其它流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class My6整行读取键盘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //创建BufferedReader字符输入流,关联键盘
		String line;
		line = br.readLine();           //整行读取数据,记录到line字符串中
		System.out.println(line);
		
//		Scanner sc = new Scanner(System.in);            //与上面代码一样的作用  推荐使用!!!!
//		String line1 = sc.nextLine();
//		System.out.println(line1);
//		sc.close();               //没有关联文件可以不关流
		
	}
}
