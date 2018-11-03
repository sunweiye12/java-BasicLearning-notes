package com.java.day11;

import com.java.Animal.Cat;
import com.java.Animal.Dog;
/*
 调用其他项目中的文件 可以现将此次项目的jar文件导入到使用的项目中然后通过设置 Build Path来实现寻找
 在导包是可以利用Alt+/的快捷键来完成
 */
public class Test1 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sleep();
		
		Dog d = new Dog();
		d.eat();
		d.sleep();
		
	}

}
