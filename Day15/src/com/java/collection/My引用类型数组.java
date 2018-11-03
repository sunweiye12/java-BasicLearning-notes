package com.java.collection;

import com.java.bean.Student;

public class My引用类型数组 {

	/**
案例演示
	* 需求：我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
* 
		Student[] arr = new Student[5];					//存储学生对象
		arr[0] = new Student("张三", 23);
		arr[1] = new Student("李四", 24);
		arr[2] = new Student("王五", 25);
		arr[3] = new Student("赵六", 26);
		arr[4] = new Student("马哥", 20);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	 */
	public static void main(String[] args) {
		// int arr[]= new int[5];           //基本类型数组
		Student[] arr = new Student[5];     //创建引用数据类型的数组
		arr[0] = new Student("张三",20);    //打印引用时调用的是引用对象的ToString方法,因此应该在Student类中重写ToString方法(这样打印的就不是地址值而是属性值),
		arr[1] = new Student("李四",24);    //因此在便利引用数据类型数组时,引用类要重写tostring方法
		arr[2] = new Student("王五",22);
		arr[3] = new Student("刘六",21);
//		arr[4] = new Student("孙七",24);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
