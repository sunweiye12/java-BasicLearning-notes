package com.java.myScanner;

import java.util.Scanner;

public class TextScanner {

	/*
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   	 	//����¼��

		System.out.println("������һ������:");
		if(sc.hasNextInt()) {                  		//hasNextInt()����,�жϼ���¼����Ƿ�Ϊһ��int������
//			int i = sc.nextInt();					//��ȡ����¼������� �洢��i��
			String i = sc.nextLine();
			System.out.println("�һ�ȡ��������:" + i);
		} else {
			System.out.println("������һ��int��!!");
		}
		
		/*
		 * ��int���ͺ�string����һ�����¼���ʱ��Ҫ�������ζ���
		 */
		System.out.println();//����
		
		Scanner sc2 = new Scanner(System.in);   	//���´�������
		System.out.println("������һ���ַ���:");
		String line = sc2.nextLine();	  			//��ȡ����¼����ַ���    �ڴ�¼��ǰ��������س���\r\n������Զ�����
		System.out.println("�һ�ȡ���ַ�����:" + line);
		
	}

}
