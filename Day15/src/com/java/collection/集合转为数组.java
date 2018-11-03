package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class 集合转为数组 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c = new ArrayList<Object>();  //父类引用指向子类对象		
		c.add("e");
		c.add("ahah哈");			
		c.add("e");
		c.add("d");
		
		Object[] arr = c.toArray();             //将集合转换成一个object类型的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
