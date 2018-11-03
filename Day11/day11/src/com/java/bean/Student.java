package com.java.bean;

	

public class Student {

	private String name;
	private String num;
	
	public Student() {
		super();
		
	}
	public Student(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "学生的名字是:" + name + "      学号为:" + num + "";
	}

}
