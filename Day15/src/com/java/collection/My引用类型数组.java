package com.java.collection;

import com.java.bean.Student;

public class My������������ {

	/**
������ʾ
	* ��������5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
* 
		Student[] arr = new Student[5];					//�洢ѧ������
		arr[0] = new Student("����", 23);
		arr[1] = new Student("����", 24);
		arr[2] = new Student("����", 25);
		arr[3] = new Student("����", 26);
		arr[4] = new Student("���", 20);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	 */
	public static void main(String[] args) {
		// int arr[]= new int[5];           //������������
		Student[] arr = new Student[5];     //���������������͵�����
		arr[0] = new Student("����",20);    //��ӡ����ʱ���õ������ö����ToString����,���Ӧ����Student������дToString����(������ӡ�ľͲ��ǵ�ֵַ��������ֵ),
		arr[1] = new Student("����",24);    //����ڱ�������������������ʱ,������Ҫ��дtostring����
		arr[2] = new Student("����",22);
		arr[3] = new Student("����",21);
//		arr[4] = new Student("����",24);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
