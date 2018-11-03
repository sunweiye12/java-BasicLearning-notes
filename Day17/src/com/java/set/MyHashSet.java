package com.java.set;

import java.util.HashSet;

import com.java.bean.Person;

public class MyHashSet {

	/**
	 * Set集合:无索引,无可以重复,存取无序
* 1.HashSet原理
	* 我们使用Set集合都是需要去掉重复元素的, 如果在存储的时候逐个equals()比较, 效率较低,哈希算法提高了去重复的效率, 降低了使用equals()方法的次数
	* 当HashSet调用add()方法存储对象的时候, 先调用对象的hashCode()方法得到一个哈希值, 然后在集合中查找是否有哈希值相同的对象
		* 如果没有哈希值相同的对象就直接存入集合
		* 如果有哈希值相同的对象, 就和哈希值相同的对象逐个进行equals()比较,比较结果为false就存入, true则不存
* 2.将自定义类的对象存入HashSet去重复
	* 类中必须重写hashCode()和equals()方法
	* hashCode(): 属性相同的对象返回值必须相同, 属性不同的返回值尽量不同(提高效率)
	* equals(): 属性相同返回true, 属性不同返回false,返回false的时候存储
	 */
	public static void main(String[] args) {
		//存储String元素();	
		//存储引用对象();
		
		
		
		
		
	}

	private static void 存储引用对象() {
		HashSet< Person> hs = new HashSet<>(); 
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("李四", 24));
		hs.add(new Person("王五", 25));
		hs.add(new Person("赵六", 26));
		hs.add(new Person("张三", 23));                //对于引用数据类型 只有重写了equals方法 才可以认为相同属性的对象为同一个人
													   //此处不但要重写equals方法 还要重写hashcode方法
		/*在hashset集合添加 指定对象时 在添加时就会调用hashcode方法当返回的hashcode值相同时会继续调用equals方法    */
		System.out.println(hs);			//打印集合
		
		for (Person per : hs) {			//遍历集合
			System.out.println(per);
		}
	}

	private static void 存储String元素() {
		HashSet< String> hs = new HashSet<>();            //创建一个hashset集合对象     
		hs.add("a");										//set集合和list集合的最大区别在于set集合可以保证元素的唯一性
		boolean b1 = hs.add("a");										//因此不能添加相同元素
		hs.add("b");										//存储相同元素时返回为false
		hs.add("c"); 										//hashset继承体系中重写了tostring方法
		hs.add("d");
		for (String str : hs) {								//只要可以用迭代器 迭代的就可以用增强for循环来遍历
			System.out.println(str);
		}
		System.out.println(b1);
	}

}
