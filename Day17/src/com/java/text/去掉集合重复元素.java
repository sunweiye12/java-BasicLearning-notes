package com.java.text;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class 去掉集合重复元素 {

	/**
* 将集合中的重复元素去掉
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		System.out.println(list);
		System.out.println("去除重复后:");
		getSingle(list);
		System.out.println(list);
	}
	
	/*
	 * 将集合中的重复元素去掉
	 * 1,void
	 * 2,List<String> list
	 */
	
	public static void getSingle(List<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);									//将list集合中的所有元素添加到lhs  自动会去除重复的元素
	//	System.out.println(lhs + "哈哈");
		list.clear();										//清空原集合
		list.addAll(lhs);									//将去除重复的元素添回到list中
	}

}
