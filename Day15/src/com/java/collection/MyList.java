package com.java.collection;

import java.util.ArrayList;
import java.util.List;



public class MyList {

	/**
* void add(int index,E element)     //在指定位置添加元素
	* E remove(int index)			//在指定位置删除元素(返回删除的元素)  (删除的时候不可以自动装箱)
	* E get(int index)				//得到指定位置元素
	* E set(int index,E element)    //修改指定位置的元素
	* 
集合框架(ListIterator)(了解)
* boolean hasNext()是否有下一个
* boolean hasPrevious()是否有前一个
* Object next()返回下一个元素
* Object previous();返回上一个元素
	 */
	public static void main(String[] args) {
		List li = new ArrayList();     //接口不能直接创建  父类引用子类对象
		
		li.add("e");
		li.add("a");
		li.add("d");
		li.add("f");
		li.add("g");
		
		li.add(2, "gg");
		System.out.println(li);
		
		

	}

}
