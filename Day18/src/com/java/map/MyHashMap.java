package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class MyHashMap {

	/**
* HashMap���ϼ���Studentֵ��String�İ���
	 */
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>(); //����ѧ������,ֵ��String����(�洢������)
		hm.put(new Student("����", 23), "����");
		hm.put(new Student("����", 23), "�Ϻ�");  //û�и���ԭ��:�Զ������û����дhashcode��equals����!!!!!!
		hm.put(new Student("����", 24), "����");
		hm.put(new Student("����", 25), "����");

		System.out.println(hm);
	}

}
