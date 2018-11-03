package com.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.java.bean.Student;

public class MyLinkedHashMap {

	/**
        * LinkedHashMap的特点
		* 底层是链表实现的   !!!!!!可以保证怎么存就怎么取
	 */
	public static void main(String[] args) {
		LinkedHashMap<Student, String> hm = new LinkedHashMap<>(); //键是学生对象,值是String对象(存储归属地)
		hm.put(new Student("张三", 23), "北京");
		hm.put(new Student("张三", 23), "上海");     //没有覆盖原因:自定义对象没有重写hashcode和equals方法!!!!!!
		hm.put(new Student("李四", 24), "广州");
		hm.put(new Student("王五", 25), "深圳");			
		 
		for (Entry<Student, String> en : hm.entrySet()) {              //用增强for循环进行遍历
			System.out.println(en.getKey() + " =" + en.getValue());
		}
		
		System.out.println(hm);

	}

}
