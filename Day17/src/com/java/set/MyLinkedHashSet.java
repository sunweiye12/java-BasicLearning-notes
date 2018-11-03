package com.java.set;

import java.util.LinkedHashSet;

import com.java.bean.Person;

public class MyLinkedHashSet {

	/**
* LinkedHashSet的特点
		* 底层是链表实现的,是set集合中唯一可以保证怎么存就怎么取的类
		* 可以保证元素的唯一性,原理与hashset相同; 
	 */
	public static void main(String[] args) {
		LinkedHashSet<Person> li = new LinkedHashSet<>();
		LinkedHashSet<String> lk = new LinkedHashSet<>();
		
		lk.add("a");
		lk.add("b");
		lk.add("c");
		lk.add("d");
		lk.add("e");
		lk.add("a");
		for (String str : lk) {
			System.out.println(str);
		}
		

	}

}
