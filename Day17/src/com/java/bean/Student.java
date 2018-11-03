package com.java.bean;

public class Student {

	

	public int getSum() {
		return sum;
	}

	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum = this.english + this.chinese + this.math;
	}

	private String name;
		private int chinese;
		private int math;
		private int english;
		private int sum;
	public static void main(String[] args) {
		

	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name + chinese + "," + math + "," + english + "," + sum;
	}

}
