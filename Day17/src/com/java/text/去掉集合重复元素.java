package com.java.text;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ȥ�������ظ�Ԫ�� {

	/**
* �������е��ظ�Ԫ��ȥ��
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		System.out.println(list);
		System.out.println("ȥ���ظ���:");
		getSingle(list);
		System.out.println(list);
	}
	
	/*
	 * �������е��ظ�Ԫ��ȥ��
	 * 1,void
	 * 2,List<String> list
	 */
	
	public static void getSingle(List<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);									//��list�����е�����Ԫ����ӵ�lhs  �Զ���ȥ���ظ���Ԫ��
	//	System.out.println(lhs + "����");
		list.clear();										//���ԭ����
		list.addAll(lhs);									//��ȥ���ظ���Ԫ����ص�list��
	}

}
