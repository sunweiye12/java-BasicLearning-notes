package com.java.jibenleixingclass;

public class MyInteger {

	/**
* A:Integer�����
	* Integer ���ڶ����а�װ��һ���������� int ��ֵ,
	* �����ṩ�˶������������ int ���ͺ� String ����֮�以��ת����
	* ���ṩ�˴��� int ����ʱ�ǳ����õ�����һЩ�����ͷ���
* B:���췽��
	* public Integer(int value)
	* public Integer(String s)(���봫�������ַ���)
* C:������ʾ
	* ʹ�ù��췽����������
------------------------------------------------
 String��int���͵��໥ת��
* A:int -- String
	* a:��""����ƴ�� 
	* b:public static String valueOf(int i)
	* c:int -- Integer -- String(Integer���toString����())
	* d:public static String toString(int i)(Integer��ľ�̬����)
* B:String -- int
	* a:String -- Integer -- int
	* public static int parseInt(String s)
--------------------------------------------------
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);  //int���ֵ
		System.out.println(Integer.MIN_VALUE);  //int��Сֵ
		
		Integer i1 = new Integer(100);         //�вι���,����ֱ�Ӹ�intֵ
		System.out.println(i1);
		
		Integer i2 = new Integer("100");       //����ֱ�ӽ�string����ת��Ϊint����
		System.out.println(i2);
		
		String i4 = "123";
		int i5 = Integer.parseInt(i4);       //ֱ������ת���Ŀ��ٷ���
		System.out.println(i5);
		
		
	   
	}

}
