package com.java.stringbuffer;

public class MyStringBuffer���� {

/**
	 * A:StringBuffer�Ĺ��췽����
	 	* public StringBuffer():�޲ι��췽��
	 	* public StringBuffer(int capacity):ָ���������ַ�������������
	 	* public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
	 * B:StringBuffer�ķ�����
	 	* public int capacity()�����ص�ǰ������	����ֵ(������)
	 	* public int length():���س��ȣ��ַ������� ʵ��ֵ
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());	//�����е��ַ�����,ʵ��ֵ
		System.out.println(sb.capacity());	//�����ĳ�������,����ֵ
		
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("mystringbuffer");
		System.out.println(sb3.length());    //ʵ���ַ��ĸ���
		System.out.println(sb3.capacity());  //�ַ�����length + ��ʼ����(16)

	}

}
