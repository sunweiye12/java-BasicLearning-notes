package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class MyHashMap嵌套HashMap {

	/**
	 * * 集合嵌套之HashMap嵌套HashMap
	 */
	public static void main(String[] args) {
		
		//定义88班
		HashMap<Student, String> hm88 = new HashMap<>(); //键是学生对象,值是String对象(存储归属地)
		hm88.put(new Student("张三", 23), "北京");
		hm88.put(new Student("赵六", 23), "上海");    
		hm88.put(new Student("李四", 24), "广州");
		hm88.put(new Student("王五", 25), "深圳");
		System.out.println(hm88);
		//定义99班
		HashMap<Student, String> hm99 = new HashMap<>(); //键是学生对象,值是String对象(存储归属地)
		hm99.put(new Student("唐僧", 23), "长安");
		hm99.put(new Student("悟空", 23), "花果山");    
		hm99.put(new Student("八戒", 24), "高老庄");
		hm99.put(new Student("沙僧", 25), "流沙河");
		System.out.println(hm99);
		//定义学校集合
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();		
		hm.put(hm88, "这是第88班!");
		hm.put(hm99, "这是第99班!");
		
		System.out.println(hm);
		
		for(HashMap<Student, String> h : hm.keySet()) {   // hm.keySet()代表集合中键的集合  ,hm.get(h)是指获取键为h的对应值
			String value = hm.get(h);
			//遍历键的双列集合对象
			for(Student key : h.keySet()) {     //  h.keySet() 集合中所有的学生
				String value2 = h.get(key);
				System.out.println("学生信息:" + key + "  所属地为:" + value2 + "           所在年纪:" + value);
			}
		}
		


	}

}
