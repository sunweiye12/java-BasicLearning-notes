package com.java.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.java.bean.Student;

public class ¼�뿼����Ϣ������ {

	/**
	* ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
			
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������5��ѧ���ɼ���ʽ��:(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�)");
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();			//����ѧ�����ܳɼ���������
				return num == 0 ? 1 : num;
			}
		});
		
		while(ts.size() < 5) {        //����¼�����ѧ����Ϣ
			String line = sc.nextLine();
			try {
				String[] arr = line.split(",");              //����,(����)��ȡ�ַ���
				int chinese = Integer.parseInt(arr[1]);				//ת�����ĳɼ�
				int math = Integer.parseInt(arr[2]);				//ת����ѧ�ɼ�
				int english = Integer.parseInt(arr[3]);				//ת��Ӣ��ɼ�
				ts.add(new Student(arr[0], chinese, math, english));
			} catch (Exception e) {
				System.out.println("¼���ʽ����,����5��ѧ���ɼ���ʽ������:(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
			}
			
		}
		
		System.out.println("������ѧ���ɼ���:");
		for (Student s : ts) {
			System.out.println(s);
		}

	}

}
