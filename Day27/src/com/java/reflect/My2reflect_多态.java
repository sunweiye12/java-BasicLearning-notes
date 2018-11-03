package com.java.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class My2reflect_多态 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, Exception {

		Juicer j = new Juicer();
		j.run(new Apple());   //父类引用指向子类对象
		j.run(new Orange());
		
		System.out.println("----------------------------");
		
		//用配置文件来实现此问题
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));	//BufferedReader可以读一行
		Class clazz = Class.forName(br.readLine());  //可以通过直接改配置文件来实现程序表达
		Fruit f = (Fruit) clazz.newInstance();
		Juicer ju = new Juicer();
		ju.run(f);

	}
}


//多态
//1.有一个高层的接口(其中包含一个方法用来重写)
//2.有几个类的继承,并重写方法
//3.父类引用指向子类对象
//
interface Fruit {			//有一个高层的接口(其中包含一个方法用来重写)
	public void squeeze();
}

class Apple implements Fruit{			//有几个类的继承,并重写方法
	public void squeeze() {
		System.out.println("榨出一杯苹果汁儿");
	}
}

class Orange implements Fruit{			//有几个类的继承,并重写方法
	public void squeeze() {
		System.out.println("榨出一杯橘子汁儿");
	}
}

class Juicer {
	public void run(Fruit a) {		//父类引用指向子类对象
		a.squeeze();
	}
}