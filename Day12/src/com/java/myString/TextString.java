package com.java.myString;

public class TextString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";					//�൱��  Person p = new Person;��������Թ�set�������ı�p���������
		System.out.println(str);			//��string���͵�һ����ֵ���޷��ı���ֵ
		System.out.println("-----------------------");
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		String s4 = "bc";
		String s5 = "a";
		
		System.out.println(s1.equals(s2));        		//true          //�ж��ַ����Ƿ����(���ִ�Сд)
		System.out.println(s1.equals(s3));     			//false
		System.out.println(s1.equalsIgnoreCase(s3));     //true          (�����ִ�Сд)
		System.out.println(s1.contains(s4));    		//true           //�ж��Ƿ����
		System.out.println(s1.startsWith(s5));  		//true           //�ж��Ƿ���s5�ַ�����ͷ
		System.out.println(s1.endsWith(s4));    		//true           //�ж��Ƿ���s4�ַ�����β
		System.out.println(s1.isEmpty());      			//false          //�ж��Ƿ�Ϊ���ַ���
		
		System.out.println("-----------------------");
		
		
		
		
		
		
		
	}

}
