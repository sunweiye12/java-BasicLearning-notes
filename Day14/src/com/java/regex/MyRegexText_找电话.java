package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexText_�ҵ绰 {

	/**
��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
		���ַ�����ԭ��:����Ҫѧ��̡���
--------------------------------------------------------------------------
���󣺰�һ���ַ����е��ֻ������ȡ����
*      ��ȡһ�������е��ֻ���

 
	 */
	public static void main(String[] args) {

		//a();
		b();
	
	}

	private static void b() {
		String s ="�������õ��ֻ�����:17801020179,��ԭ���õ��ֻ�����15732028636.";
		
//		String regex = "1[3578]\\d{9}";            //�õ��ֻ��ŵ�������ʽ
//		Pattern p =Pattern.compile(regex);         //��������ʽת����һ��ģʽ
//		Matcher m = p.matcher("17801020179");		//p.matcher(String)��ȡһ��ƥ����,��ƥ�����е�������ģʽ���Ա�
//		boolean b = m.matches();					//m.matches()��ȡƥ�����Ľ��
//		System.out.println(b);   					//shuchu
		
		String regex = "1[3578]\\d{9}";            //�õ��ֻ��ŵ�������ʽ
	/*	
	
		Pattern p =Pattern.compile(regex);    	  //��������ʽת����һ��ģʽ
		Matcher m = p.matcher(s);				  //����ģʽ�浽ƥ������,����ƥ�����д���Ŀ���ַ���
		boolean b = m.find();                      //��s��Ѱ���Ƿ���������ʽ������
		System.out.println(b);
		System.out.println(m.group());             //�����������ʽһ�µ�����
		boolean b2 = m.find();
		System.out.println(m.group());
    */

		Pattern p =Pattern.compile(regex);    	  //��������ʽת����һ��ģʽ
		Matcher m = p.matcher(s);				  //����ģʽ�浽ƥ������,����ƥ�����д���Ŀ���ַ���
		while (m.find()) {                           //����ѭ��,�������ƥ����   
			//find������ָ������,��Ѱ�ҵ�һ��Ŀ����´�Ѱ��ʱ������Ѿ�Ѱ�ҵ�Ŀ��
			System.out.println(m.group());		
		}
	}

	private static void a() {
		String str = "����....��...����.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String regex = "\\.+";       //    . ������\\.����ʾ           +��ʾһ������
		String s1 = str.replaceAll(regex, "");   //�����е�. �ÿ��ַ����(��ɾ�����е�.)
		System.out.println(s1);
		String s2 = s1.replaceAll("(.)\\1+", "$1");   //   (.)\\1+ ���������ַ�������һ�ε����    $1�����һ���е�����
		System.out.println(s2);
	}

}
