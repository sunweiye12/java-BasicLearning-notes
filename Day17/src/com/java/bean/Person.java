package com.java.bean;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
//	public boolean equals(Object obj) {              //重写equal方法 使的认为统同姓名 同年龄为同一个人
//		System.out.println("执行了吗?");
//		Person per = (Person)obj;
//		return this.name.equals(per.name) && this.age == per.age;
//	}
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return name.hashCode() * 38 + age;       //每次新创建对象时 都会分配一个hashcode值  (为了让它不重复也是没谁了) 
//	}						//这个意思就是 不同的人去不同的座位 ,减少重复的概率,就减少了调用(无效)equals方法的次数
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	public int compareTo(Person o) {
		// TODO Auto-generated method stub                     //按照姓名长度排序,如果姓名长度相同的话比较一下姓名是否相同
		int length = this.name.length() - o.name.length();
		int num = length == 0? this.name.compareTo(o.name):length; //姓名长度如果相同就返回名字的比较值,如果不同直接返回姓名长度差值
		return num ==0 ? this.age - o.age: num;                  //最后比较年龄是否相等
	}
//----------------------------------------------------------------------------------------
	/*public int compareTo(Person o) {
		// TODO Auto-generated method stub                //按照姓名排序
		int num = this.name.compareTo(o.name);
		return num ==0 ? this.age - o.age:num;         //姓名是比较的主要条件,,年龄是次要条件
	}*/
//----------------------------------------------------------------------------------------
	/*compare to的 方法返回为0的时候,集合存储1 个元素
	  为正数的时候集合按添加顺序存储,为负数的时候集合按添加顺序的反顺序存储.*/
	/*public int compareTo(Person o) {
		// TODO Auto-generated method stub
		//return  this.age - o.age;                           //按照年龄排序                 
		//	return  -1;            
		int num = this.age - o.age;                          //年龄是比较的主要条件
		return num ==0 ? this.name.compareTo(o.name):num;    //年龄是比较的主要条件,,姓名是次要条件		
	}*/
//----------------------------------------------------------------------------------------


}
