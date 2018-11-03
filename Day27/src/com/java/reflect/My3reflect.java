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
		Class clazz = Class.forName("com.java.bean.Person");			//��ȡ�ֶ�
		Constructor c = clazz.getConstructor(String.class,int.class);	//��ȡ�вι���
		Person p = (Person) c.newInstance("����",23);					//ͨ���вι��촴������
		
		System.out.println(p);
		
//		Field f = clazz.getField("name");   //��������public�ĳ�Ա��������ͨ���˷�����ȡ���޸�
//		f.set(p, "����");
		System.out.println("------------------------");
		
		Field fi = clazz.getDeclaredField("name"); 	//���������ȡ�ֶ�(����˽�еĳ�Ա����)
		fi.setAccessible(true);						//ȥ��˽��Ȩ��
		fi.set(p, "����");
		
		System.out.println(p);
		
		System.out.println("-----------");
		
		Method m1 = clazz.getMethod("eat");	//ͨ�������ȥ����
		m1.invoke(p);						//��ָ������ִ�з���
		
		Method m2 = clazz.getMethod("eat", int.class);  //��ȡ�вη���
		m2.invoke(p, 2);
		
	}

}
