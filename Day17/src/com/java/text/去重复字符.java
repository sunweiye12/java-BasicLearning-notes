package com.java.text;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ȥ�ظ��ַ� {

	/**
* ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
	* aaaabbbcccddd
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			//��������¼�����
//		Scanner sc1 = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String line = sc.nextLine();					//������¼����ַ����洢��line��
		char[] arr = line.toCharArray();				//���ַ���ת�����ַ�����
		
	//	HashSet<Character> hs = new HashSet<>();		//����HashSet���϶���   			//�����ȡ
		LinkedHashSet<Character> hs =new LinkedHashSet<Character>();     				//˳���ȡ
		
		for(char c : arr) {								//�����ַ�����
			hs.add(c);									//���ַ������е��ַ���ӵ�������   (ȥ�ظ�)
		}
		
		for (Character ch : hs) {						//��������
			System.out.println(ch);
		}

	}

}
