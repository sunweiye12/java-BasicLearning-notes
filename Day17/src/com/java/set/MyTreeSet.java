package com.java.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.java.bean.Person;

public class MyTreeSet {

	/**
	 * @treeset集合用来
	 * 1.可以保证元素的唯一
	 * 2.用来给集合排序,调用对象compare to方法
	 * 
	 * 当存储引用数据类型元素时,该对象必须集成comparable接口  并重写里面 compare to的 方法
	 *  compare to的 方法返回为0的时候,集合存储1 个元素
	 *  为正数的时候集合按添加顺序存储,为负数的时候集合按添加顺序的反顺序存储.
	 *  
	 */
	public static void main(String[] args) {
		/*TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(8);	
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(4);
		ts.add(2);		
		System.out.println(ts);*/
		
		/*TreeSet<Person> ts = new TreeSet<>(new CompareByLength());   /
	//	ts.comparator(Person.age);
		ts.add(new Person("李四", 24));
		ts.add(new Person("张三", 23));		
		ts.add(new Person("王五", 25));
		ts.add(new Person("张三", 23));
		ts.add(new Person("赵六", 26));
		ts.add(new Person("周其", 23));*/
		
		TreeSet<String> ts = new TreeSet<>(new CompareByLength());   //利用比较器,实现按照字符串长度来排序(有比较器,优先使用比较器)
		ts.add("abdjs");
		ts.add("ajs");
		ts.add("ajd");
		ts.add("abddjs");
		ts.add("abjs");
		System.out.println(ts);
		/*for (Person per : ts) {
			System.out.println(per);
		}*/		
	}

}
class CompareByLength implements Comparator<String> {     //比较器排序的使用,,在新建treeset集合时进行调用,调用时会默认使用比较器的比较方法

	@Override
	public int compare(String s, String o) {
		int num =s.length() - o.length(); 
		return num ==0?s.compareTo(o):num ;
	}
	
}