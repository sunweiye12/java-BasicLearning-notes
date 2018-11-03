package com.java.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.java.bean.Student;

/*
 *
 *  TreeMap集合键是Student值是String的案例
 *  有排序的功能//(引用类要实现Comparable接口)重写引用类中的compare to方法   (确立如何比较)
 *             //或者在构造时传入比较器
 */

public class MyTreeMap {
	
	public static void main(String[] args) {
		
//		TreeMap<Student, String> hm = new TreeMap<>(); //键是学生对象,值是String对象(存储归属地)
//		hm.put(new Student("张三", 23), "北京");
//		hm.put(new Student("张三", 21), "上海");     //没有覆盖原因:自定义对象没有重写hashcode和equals方法!!!!!!
//		hm.put(new Student("李四", 24), "广州");
//		hm.put(new Student("王五", 25), "深圳");			
//		System.out.println(hm);
		
		TreeMap<Student, String> hm = new TreeMap<>(new Comparator<Student>() {   //通过构造时传入比较器进行比较
			@Override
			public int compare(Student s1, Student s2) {    
				int num = s1.getAge() - s2.getAge();           //年龄是比较的首要条件
				return num == 0 ? s1.getName().compareTo(s2.getName()) : num ;
			}	
		});		
		//键是学生对象,值是String对象(存储归属地)
		hm.put(new Student("张三", 23), "北京");
		hm.put(new Student("张三", 27), "上海");     //没有覆盖原因:自定义对象没有重写hashcode和equals方法!!!!!!
		hm.put(new Student("李四", 24), "广州");
		hm.put(new Student("王五", 25), "深圳");			
		System.out.println(hm);
		
	}

}
