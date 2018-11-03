package com.java.day11;

import com.java.bean.Student;
/*
 在同一个项目中同一个包下的文件不用导包 之间可以相互用
 在同一个项目中 不同包下文件 需要通过导包来实现利用 此处也是借用Alt+/的快捷键来完成的
 */

public class Test2 {
	public static void main(String[] args) {
		Student s = new Student("李四","19283");  //Student在其它包下需要导包
//		s.setName("張三");
//		s.setNum("10202");
	//	System.out.println(s.getName() + "的学号是:" + s.getNum());
		System.out.println(s.toString());
		
//		HelloWorld h = new HelloWorld();       //HelloWorld和此文件在同一个包下 因此不需要导包
//		h.print();
	}
}

