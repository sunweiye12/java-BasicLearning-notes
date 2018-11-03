package com.java.集合工具类;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollections {

	/**
 A:Collections类概述
	                                 * 针对集合操作 的工具类
* B:Collections常见的方法
* 
		public static <T> void sort(List<T> list)   //对list集合排序
		public static <T> int binarySearch(List<?> list,T key)    //二分查找法(用于有序集合) 找元素 返回索引
		public static <T> T max(Collection<?> coll)
		public static void reverse(List<?> list)           //反转集合
		public static void shuffle(List<?> list)        //使集合随机置换  (相当于洗牌)	
	 */
	public static void main(String[] args) {
// Collections中所有方法都是静态的因此它的方法可以直接( 类名. )进行调用
		ArrayList<String> list = new ArrayList<>();
		list.add("d");
		list.add("c");
		list.add("a");
		list.add("b");
	//	list.add("b");
		list.add("e");
	//	System.out.println(list);
		
		Collections.sort(list);     //对list集合排序
		System.out.println(list);
		
//		int i = Collections.binarySearch(list , "c" );  //二分查找法(用于有序集合) 找元素 返回索引
//		System.out.println(i);
		
//		System.out.println(Collections.max(list));       //返回最大值
//		System.out.println(Collections.min(list));       //返回最小值
		
		Collections.reverse(list);  //反转集合
//		System.out.println(list);
		
		Collections.shuffle(list);  //使集合随机置换  (相当于洗牌)		
		System.out.println(list);
		

	}

}
