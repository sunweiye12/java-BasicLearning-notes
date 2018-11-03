package com.java.stringbuffer;

public class MyStringBuffer���� {

	/**
* A:StringBuffer���滻����
	* public StringBuffer replace(int start,int end,String str):
		* ��start��ʼ��end��str�滻
* B:StringBuffer�ķ�ת����
	* public StringBuffer reverse():
		* �ַ�����ת
------------------------------------------------------------
 A:StringBuffer�Ľ�ȡ����
	* public String substring(int start):
		* ��ָ��λ�ý�ȡ��ĩβ
	* public String substring(int start,int end):
		* ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
* B:ע������
	* ע��:����ֵ���Ͳ�����StringBuffer�������string
------------------------------------------------------------
 A:String ת��Ϊ StringBuffer
	* a:ͨ�����췽�� 
	* b:ͨ��append()����
* B:StringBuffer ת��Ϊ String
	* a:ͨ�����췽��
	* b:ͨ��toString()����
	* c:ͨ��subString(0,length);
------------------------------------------------------------

	 */
	public static void main(String[] args) {
		//�滻��ת();
		//��ȡ����();
		//String��StringBufferת��();
		
	}

	private static void String��StringBufferת��() {
		StringBuffer sb = new StringBuffer("wodejava"); //ͨ�����췽����String ת��Ϊ StringBuffer
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();  //ͨ��append������String ת��Ϊ StringBuffer
		sb1.append("java");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("javahaha"); //ͨ������StringBuffer ת��Ϊ String
		String st = new String(sb2);
		System.out.println(st);
		
		StringBuffer sb3 = new StringBuffer("javaxuexi");//ͨ��toString����StringBuffer ת��Ϊ String
		String st1 = sb3.toString();
		System.out.println(st1);
		
		StringBuffer sb4 = new StringBuffer("xuexi");//ͨ����ȡ�����ַ����ķ���StringBuffer ת��Ϊ String
		String st2 = sb4.substring( 0, sb4.length());
		System.out.println(st2);
	}

	private static void ��ȡ����() {
		StringBuffer sb = new StringBuffer("wodejavaxuexi");
		System.out.println(sb);
		
		String sb1 = sb.substring(3);     //����ֵΪһ��string����ֵ���Ҫ���´���һ��string����������
		System.out.println(sb1);
		
		String sb2 = sb.substring(4, 8); //����ͷ������β
		System.out.println(sb2);
		System.out.println(sb);   		//���ϲ���sb�����ݲ������ı�
	}

	private static void �滻��ת() {
		StringBuffer sb = new StringBuffer("wodejava");
		System.out.println(sb);
		
		sb.replace(2, 4, "hahaha"); //���м��滻�ַ���(����ͷ������β)
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);    //ʹ�����е��ַ�����ת
	}

}
