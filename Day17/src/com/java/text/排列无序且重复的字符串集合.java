package com.java.text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class 排列无序且重复的字符串集合 {

	/**
* 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
    */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ccc");
		list.add("ccc");
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ddd");
		
		sort(list);
		System.out.println(list);
	}
			
			/*
			 * 对集合中的元素排序,并保留重复
			 * 1,void
			 * 2,List<String> list
			 */
	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() { //定义比较器(new Comparator(){}是Comparator的子类对象)
																				//匿名内部类
			@Override
			public int compare(String s1, String s2) {						//重写compare方法
				int num = s1.compareTo(s2);									//比较内容
				return num == 0 ? 1 : num;									//如果内容一样返回一个不为0的数字即可(为了不删除重复)
			}
		});
		
		ts.addAll(list);											//将list集合中的所有元素添加到ts中(添加过程自动调用了比较器)
		
		list.clear();												//清空list
		
		list.addAll(ts);											//将ts中排序并保留重复的结果在添加到list中
	 }
	
}
