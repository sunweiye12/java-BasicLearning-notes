package com.java.新特性;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Person;

public class My泛型 {

	/**
* A:泛型概述
* B:泛型好处
	* 提高安全性(将运行期的错误转换到编译期) 
	* 省去强转的麻烦
* C:泛型基本使用
	* <>中放的必须是引用数据类型 
* D:泛型使用注意事项
	* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)
	* --------------------------------------------------------------------
 A:泛型通配符<?>														使用说明
	* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
* B:? extends E
	* 向下限定，E及其子类
* C:? super E
	* 向上限定，E及其父类



	 */ 
	public static void main(String[] args) {
		//泛型概述();
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		
		System.out.println(list);                 //打印此集合
		
		Iterator<String> it = list.iterator();    //遍历此集合	
		while(it.hasNext()) {                   
			System.out.println(it.next());
		}
		

	}

	private static void 泛型概述() {
		ArrayList<Person> list = new ArrayList<Person>();
	//	ArrayList<Person> list1 = new ArrayList<>();    //  后面可以不加   1.7版本特性

		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();              //使用泛型就不用强转了
			System.out.println(p.getAge());			
		}
	}

}
