package com.java.set;

import java.util.LinkedHashSet;

import com.java.bean.Person;

public class MyLinkedHashSet {

	/**
* LinkedHashSet���ص�
		* �ײ�������ʵ�ֵ�,��set������Ψһ���Ա�֤��ô�����ôȡ����
		* ���Ա�֤Ԫ�ص�Ψһ��,ԭ����hashset��ͬ; 
	 */
	public static void main(String[] args) {
		LinkedHashSet<Person> li = new LinkedHashSet<>();
		LinkedHashSet<String> lk = new LinkedHashSet<>();
		
		lk.add("a");
		lk.add("b");
		lk.add("c");
		lk.add("d");
		lk.add("e");
		lk.add("a");
		for (String str : lk) {
			System.out.println(str);
		}
		

	}

}
