package com.java.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ���ַ������� {

	/**
�Ӽ��̽���һ���ַ���, ��������������ַ���������,�����������: helloitcast�����ӡ:acehillostt	
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//��������¼�����
		System.out.println("������һ���ַ���:");
		String line = sc.nextLine();					//������¼����ַ����洢��line��
		char[] arr = line.toCharArray();				//���ַ���ת�����ַ�����
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {   //�����ڲ��������,���䷽������д

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1.compareTo(c2);
				//int num = c1 - c2;					//�Զ�����
				return num == 0 ? 1 : num;
			}
		});
		
		for(char c : arr) {
			ts.add(c);
		}
		
		for(Character ch : ts) {
			System.out.print(ch);
		}
		
		System.out.println();
		System.out.println("-----------------------");
           System.out.println(ts);                         //��ӡ�˼��� 
	}
	

}
