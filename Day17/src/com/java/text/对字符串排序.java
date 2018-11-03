package com.java.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 对字符串排序 {

	/**
从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloitcast程序打印:acehillostt	
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		System.out.println("请输入一行字符串:");
		String line = sc.nextLine();					//将键盘录入的字符串存储在line中
		char[] arr = line.toCharArray();				//将字符串转换成字符数组
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {   //匿名内部类的引用,及其方法的重写

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1.compareTo(c2);
				//int num = c1 - c2;					//自动拆箱
				return num == 0 ? 1 : num;
			}
		});
		
		for(char c : arr) {
			ts.add(c);
		}
		
		for(Character ch : ts) {
			System.out.print(ch);
		}
		
		System.out.println();
		System.out.println("-----------------------");
           System.out.println(ts);                         //打印此集合 
	}
	

}
