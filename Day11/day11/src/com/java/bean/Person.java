package com.java.bean;

public class Person {
	private String name;
	private int age;
	/*
	 ��java bean���б�д���췽����set get������������Shift+Alt+s�Ŀ�ݼ���ʽ�����
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
