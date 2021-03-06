package com.java.新特性;

import java.util.ArrayList;
import java.util.Iterator;

public class 增强for循环 {

	/**
 A:增强for概述
	* 简化数组和Collection集合的遍历
* B:格式：
	for(元素数据类型 变量 : 数组或者Collection集合) {
		使用变量即可，该变量就是元素
	}
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};		
		for(int i :arr) {							//增强for循环 来遍历数组(快捷键 fore)
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		
		for (String str : list) {                    //增强for循环 来遍历集合
			System.out.println(str);
		}
		
		Iterator<String> it = list.iterator();      //利用迭代器 实现集合的遍历
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
}
