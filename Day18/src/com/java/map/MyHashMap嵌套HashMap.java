package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class MyHashMapǶ��HashMap {

	/**
	 * * ����Ƕ��֮HashMapǶ��HashMap
	 */
	public static void main(String[] args) {
		
		//����88��
		HashMap<Student, String> hm88 = new HashMap<>(); //����ѧ������,ֵ��String����(�洢������)
		hm88.put(new Student("����", 23), "����");
		hm88.put(new Student("����", 23), "�Ϻ�");    
		hm88.put(new Student("����", 24), "����");
		hm88.put(new Student("����", 25), "����");
		System.out.println(hm88);
		//����99��
		HashMap<Student, String> hm99 = new HashMap<>(); //����ѧ������,ֵ��String����(�洢������)
		hm99.put(new Student("��ɮ", 23), "����");
		hm99.put(new Student("���", 23), "����ɽ");    
		hm99.put(new Student("�˽�", 24), "����ׯ");
		hm99.put(new Student("ɳɮ", 25), "��ɳ��");
		System.out.println(hm99);
		//����ѧУ����
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();		
		hm.put(hm88, "���ǵ�88��!");
		hm.put(hm99, "���ǵ�99��!");
		
		System.out.println(hm);
		
		for(HashMap<Student, String> h : hm.keySet()) {   // hm.keySet()�������м��ļ���  ,hm.get(h)��ָ��ȡ��Ϊh�Ķ�Ӧֵ
			String value = hm.get(h);
			//��������˫�м��϶���
			for(Student key : h.keySet()) {     //  h.keySet() ���������е�ѧ��
				String value2 = h.get(key);
				System.out.println("ѧ����Ϣ:" + key + "  ������Ϊ:" + value2 + "           �������:" + value);
			}
		}
		


	}

}
