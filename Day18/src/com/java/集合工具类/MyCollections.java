package com.java.���Ϲ�����;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollections {

	/**
 A:Collections�����
	                                 * ��Լ��ϲ��� �Ĺ�����
* B:Collections�����ķ���
* 
		public static <T> void sort(List<T> list)   //��list��������
		public static <T> int binarySearch(List<?> list,T key)    //���ֲ��ҷ�(�������򼯺�) ��Ԫ�� ��������
		public static <T> T max(Collection<?> coll)
		public static void reverse(List<?> list)           //��ת����
		public static void shuffle(List<?> list)        //ʹ��������û�  (�൱��ϴ��)	
	 */
	public static void main(String[] args) {
// Collections�����з������Ǿ�̬��������ķ�������ֱ��( ����. )���е���
		ArrayList<String> list = new ArrayList<>();
		list.add("d");
		list.add("c");
		list.add("a");
		list.add("b");
	//	list.add("b");
		list.add("e");
	//	System.out.println(list);
		
		Collections.sort(list);     //��list��������
		System.out.println(list);
		
//		int i = Collections.binarySearch(list , "c" );  //���ֲ��ҷ�(�������򼯺�) ��Ԫ�� ��������
//		System.out.println(i);
		
//		System.out.println(Collections.max(list));       //�������ֵ
//		System.out.println(Collections.min(list));       //������Сֵ
		
		Collections.reverse(list);  //��ת����
//		System.out.println(list);
		
		Collections.shuffle(list);  //ʹ��������û�  (�൱��ϴ��)		
		System.out.println(list);
		

	}

}
