package com.java.day11;

import com.java.bean.Student;
/*
 ��ͬһ����Ŀ��ͬһ�����µ��ļ����õ��� ֮������໥��
 ��ͬһ����Ŀ�� ��ͬ�����ļ� ��Ҫͨ��������ʵ������ �˴�Ҳ�ǽ���Alt+/�Ŀ�ݼ�����ɵ�
 */

public class Test2 {
	public static void main(String[] args) {
		Student s = new Student("����","19283");  //Student������������Ҫ����
//		s.setName("����");
//		s.setNum("10202");
	//	System.out.println(s.getName() + "��ѧ����:" + s.getNum());
		System.out.println(s.toString());
		
//		HelloWorld h = new HelloWorld();       //HelloWorld�ʹ��ļ���ͬһ������ ��˲���Ҫ����
//		h.print();
	}
}

