package com.java.bean;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * @param args
	 */
	String name;
	int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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

}
