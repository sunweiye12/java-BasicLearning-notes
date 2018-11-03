package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class MyHashMap {

	/**
* HashMap集合键是Student值是String的案例
	 */
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>(); //键是学生对象,值是String对象(存储归属地)
		hm.put(new Student("张三", 23), "北京");
		hm.put(new Student("张三", 23), "上海");  //没有覆盖原因:自定义对象没有重写hashcode和equals方法!!!!!!
		hm.put(new Student("李四", 24), "广州");
		hm.put(new Student("王五", 25), "深圳");

		System.out.println(hm);
	}

}
