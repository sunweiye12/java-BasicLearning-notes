package com.java.stringbuffer;

public class MyStringBufferɾ�� {

	/**
 A:StringBuffer��ɾ������
	* public StringBuffer deleteCharAt(int index):
		* ɾ��ָ��λ�õ��ַ��������ر���
	* public StringBuffer delete(int start,int end):
		* ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���

	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234");
		System.out.println(sb);
		
		sb.deleteCharAt(2);   //ɾ���Ĳ��ǵ�2���ַ�,��������ֵΪ2λ���ϵ��ַ�
		System.out.println(sb);
		
		sb.append("wodejava");
		System.out.println(sb);
		
		sb.delete(4, 6);
		System.out.println(sb); //ɾ����������ֵ�ڵ�4�͵�5���ַ�  (����ͷ������β)
		
		sb.delete(0, sb.length());//��ջ���

	}

}
