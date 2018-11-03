package com.java.bean;

public class Person {
	private String name;
	private int age;
	/*
	 在java bean类中编写构造方法和set get方法可以利用Shift+Alt+s的快捷键方式来完成
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
}
