package com.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.java.bean.Student;

public class MyLinkedHashMap {

	/**
        * LinkedHashMap���ص�
		* �ײ�������ʵ�ֵ�   !!!!!!���Ա�֤��ô�����ôȡ
	 */
	public static void main(String[] args) {
		LinkedHashMap<Student, String> hm = new LinkedHashMap<>(); //����ѧ������,ֵ��String����(�洢������)
		hm.put(new Student("����", 23), "����");
		hm.put(new Student("����", 23), "�Ϻ�");     //û�и���ԭ��:�Զ������û����дhashcode��equals����!!!!!!
		hm.put(new Student("����", 24), "����");
		hm.put(new Student("����", 25), "����");			
		 
		for (Entry<Student, String> en : hm.entrySet()) {              //����ǿforѭ�����б���
			System.out.println(en.getKey() + " =" + en.getValue());
		}
		
		System.out.println(hm);

	}

}
