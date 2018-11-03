package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.java.bean.Person;

public class My3reflect {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.java.bean.Person");			//获取字段
		Constructor c = clazz.getConstructor(String.class,int.class);	//获取有参构造
		Person p = (Person) c.newInstance("张三",23);					//通过有参构造创建对象
		
		System.out.println(p);
		
//		Field f = clazz.getField("name");   //对于类中public的成员变量可以通过此方法获取和修改
//		f.set(p, "李四");
		System.out.println("------------------------");
		
		Field fi = clazz.getDeclaredField("name"); 	//暴力反射获取字段(对于私有的成员变量)
		fi.setAccessible(true);						//去除私有权限
		fi.set(p, "李四");
		
		System.out.println(p);
		
		System.out.println("-----------");
		
		Method m1 = clazz.getMethod("eat");	//通过反射过去方法
		m1.invoke(p);						//让指定对象执行方法
		
		Method m2 = clazz.getMethod("eat", int.class);  //获取有参方法
		m2.invoke(p, 2);
		
	}

}
