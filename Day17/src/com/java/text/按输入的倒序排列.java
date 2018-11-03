package com.java.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 按输入的倒序排列 {

	/**
	 * 
	 * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
	 * 1.建立键盘录入对象
	 * 2.创建treeset集合,并且添加比较器
	 * 3.无限循环,获取录入信息,直到受到quit跳出循环
	 * 4.遍历集合
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) { 
		//		int num = s1 - s2;
		//		int num = s1.compareTo(s2);
		//		return num == 0 ? 1 : num ;  //可以存放重复的int数
				return -1;
			}
		});
		
		while(true) {
			String line = sc.nextLine();
			if("qult".equals(line)) {
				break;
			}
			Integer in = Integer.parseInt(line);
			ts.add(in);
		}
		
		for (Integer in : ts) {
			System.out.println(in);
		}
		//System.out.println(ts);
	}

}
