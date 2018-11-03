package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MyArrayList {

	/**
* 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
	* 思路：创建新集合方式

			
 *  A:案例演示
 * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * 思路：创建新集合方式
 
A:案例演示
	* 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
* B:注意事项
	* 重写equals()方法的      remove和contains方法底层都依赖equals方法 用时要重写这一方法
 */

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add("a");
//		list.add("a");
//		list.add("b");
//		list.add("b");
//		list.add("b");
//		list.add("c");
//		list.add("c");
//		list.add("c");
		list.add(new Person("张三", 23));
		list.add(new Person("张三", 23));
		
		System.out.println(list);
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	
	/*
	 * 去除重复
	 * 1,返回ArrayList
	 * 2,参数列表ArrayList
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();			//创建一个新集合
		Iterator it = list.iterator();					//获取迭代器
		while(it.hasNext()) {							//判断老集合中是否有元素
//			String temp = (String)it.next();			//将每一个元素临时记录住
			Object temp = it.next();			                       //将每一个元素临时记录住
			if(!newList.contains(temp)) {				//如果新集合中不包含该元素
				newList.add(temp);						//将该元素添加到新集合中
			}
		}
		return newList;									//将新集合返回
	}
}
