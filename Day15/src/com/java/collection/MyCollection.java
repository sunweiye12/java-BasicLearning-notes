package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.java.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked", "unused" })    //Ctrl+1 实现 去掉无用的警告
public class MyCollection {

	/**
 A:案例演示	 
		基本功能演示
		boolean add(E e)
		boolean remove(Object o)
		void clear()
		boolean contains(Object o)  //判断是否包含o
		boolean isEmpty()
		int size()
带All的功能演示	
		boolean addAll(Collection c)
		boolean removeAll(Collection c)      //删除的是集合的交集
		boolean containsAll(Collection c)
		boolean retainAll(Collection c)      //取交集合  (调用的集合只要发生改变就是true)
	 		
		
		迭代器的实用  集合遍历
		
* B:注意:
* 		Collection属于接口类 因此不可以实例化 可以通过父类引用指向子类对象的方法
		collectionXxx.java使用了未经检查或不安全的操作.
		注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
		java编译器认为该程序存在安全隐患
		温馨提示:这不是编译失败,所以先不用理会,等学了泛型你就知道了
	 */
	public static void main(String[] args) {
			Collection c = new ArrayList<Object>();  //父类引用指向子类对象
			
			c.add("e");
			c.add("a");			
			c.add("e");
			c.add("b");
			c.remove("e");
			c.remove("e");  //删除制定元素
//			c.clear();       //清空集合
//			c.removeAll(c);  //清除 所有
			
			System.out.println(c.contains("a"));          //判断是否包含o
			System.out.println(c.isEmpty());              //判断集合是否为空
			
			int i = c.size();                           //获取元素的个数	
			System.out.println(c);
			System.out.println(i);
			
		    Iterator ite = c.iterator();            //获取一个迭代器用于 遍历集合
		    while (ite.hasNext()) {                 //判断集合中是否存在元素(具有指针效应)
		    	System.out.println(ite.next());     //获取该元素并打印
		    }
		
			
			
			//添加(c);

	}

	private static void 添加(Collection c) {
		boolean b1 = c.add("哈哈");         //在集合中不能存储基本数据类型(因此此处存在自动装箱)
		boolean b2 = c.add(100); 
		boolean b3 = c.add('a'); 
		boolean b4 = c.add(true); 
		boolean b5 = c.add(new Student("张四",14));
		boolean b6 = c.add("哈哈");         //因为arraylist可以存储相同的数据  因此以上返回的都是true
		
		System.out.println(c);   			//打印集合
	}

}
