package com.java.stringbuffer;

import java.util.Scanner;

public class MyStringBuffer���� {

	/**
	* A:������ʾ
	* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
	* 
			������
				int[] arr = {1,2,3};	
			��������
				"[1, 2, 3]"
				
			��StringBuffer�Ĺ���ʵ��
-------------------------------------------------------------
 A:������ʾ
* 
		���󣺰��ַ�����ת
			����������¼��"abc"		
			��������"cba"
			
		��StringBuffer�Ĺ���ʵ��
-------------------------------------------------------------
	 */
	public static void main(String[] args) {
		//Text1();     //���ý�����ת�����ַ����ķ���
		//Text2();     //������������ַ���ת���

	}



	private static void Text2() {
		Scanner sc = new Scanner(System.in);  //��������¼�����
		String line = sc.nextLine();			//������¼������ݷ���line��
		
		System.out.println(revString(line));
	}
	
	
	
	private static void Text1() {
		int[] arr = {1,2,3,4};		
		System.out.println(Array2String(arr));  //���ý�����ת�����ַ����ķ���
	}
	/*
	 ��ȡ������ת��Ϊ�ַ����ķ���
	 1.����ֵ������string
	 2.�����б�Ϊint[] 
	 */
	
	public static String revString(String line) {
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		
		return sb.toString();
		
	}
	public static String Array2String(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append('[');
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				sb.append(arr[i] ).append("]");  //һ�ַ�ʽ
			} else {
				sb.append(arr[i] + ", ");        //��һ�ַ�ʽ
			}
			
		}
		return sb.toString();
	}
}
