package com.java.reflect;

import com.java.bean.Person;

public class My1Clazz�ļ� {

	/**
	 * ��ȡ�ֽ����ļ�(.calss�ļ�)�����ַ�ʽ
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1 = Class.forName("com.java.bean.Person");
		Class clazz2 = Person.class;
		
		Person p = new Person();
		
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);

	}

}
