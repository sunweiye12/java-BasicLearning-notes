package com.java.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.java.bean.Student;

/*
 *
 *  TreeMap���ϼ���Studentֵ��String�İ���
 *  ������Ĺ���//(������Ҫʵ��Comparable�ӿ�)��д�������е�compare to����   (ȷ����αȽ�)
 *             //�����ڹ���ʱ����Ƚ���
 */

public class MyTreeMap {
	
	public static void main(String[] args) {
		
//		TreeMap<Student, String> hm = new TreeMap<>(); //����ѧ������,ֵ��String����(�洢������)
//		hm.put(new Student("����", 23), "����");
//		hm.put(new Student("����", 21), "�Ϻ�");     //û�и���ԭ��:�Զ������û����дhashcode��equals����!!!!!!
//		hm.put(new Student("����", 24), "����");
//		hm.put(new Student("����", 25), "����");			
//		System.out.println(hm);
		
		TreeMap<Student, String> hm = new TreeMap<>(new Comparator<Student>() {   //ͨ������ʱ����Ƚ������бȽ�
			@Override
			public int compare(Student s1, Student s2) {    
				int num = s1.getAge() - s2.getAge();           //�����ǱȽϵ���Ҫ����
				return num == 0 ? s1.getName().compareTo(s2.getName()) : num ;
			}	
		});		
		//����ѧ������,ֵ��String����(�洢������)
		hm.put(new Student("����", 23), "����");
		hm.put(new Student("����", 27), "�Ϻ�");     //û�и���ԭ��:�Զ������û����дhashcode��equals����!!!!!!
		hm.put(new Student("����", 24), "����");
		hm.put(new Student("����", 25), "����");			
		System.out.println(hm);
		
	}

}
