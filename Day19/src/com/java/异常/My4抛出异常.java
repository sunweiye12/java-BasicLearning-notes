package com.java.异常;

public class My4抛出异常 {

	/**
	 * 在功能方法内部出现某种情况，程序不能继续运行，需要进行跳转时，就用throw把异常对象抛出。
	 * throw new RuntimeException("年龄非法");                   //抛出运行时异常(执行到着时不在执行)
	 * 
	 * throws和throw的区别
	* a:throws
		* 用在方法声明后面，跟的是异常类名
		* 可以跟多个异常类名，用逗号隔开
		* 表示抛出异常，由该方法的调用者来处理
	* b:throw
		* 用在方法体内，跟的是异常对象名
		* 只能抛出一个异常对象名
		* 表示抛出异常，由方法体内的语句处理
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-17);                                            //在调用着个方法时会抛出异常
		System.out.println(p.getAge());

	}

}

class Person {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
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
		if (age > 0 && age <= 100) {
			this.age = age;
		} else {
			//在此处抛出异常时,当抛出的异常直接定义为Exception时应该在方法和调用此方法时标注出(throws Exception)
			//但当抛出RuntimeException时则不用在方法中标出,因此多用RuntimeException////
			throw new RuntimeException("年龄非法");                   //抛出运行时异常(执行到着时不在执行) 这个不需要定义错误
			
	//		throw new 年龄超出异常("年龄非法");						  //这定义需要定义错误
		}
	}
}