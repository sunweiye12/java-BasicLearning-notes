    
package com.java.array;

import java.util.Arrays;



public class Arrays���� {

	/**
* A:Arrays�����
	* ���������в����Ĺ����ࡣ
	* �ṩ�����򣬲��ҵȹ��ܡ�
* B:��Ա����
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int key)
	 */
	public static void main(String[] args) {
		int[] arr = {33,22,66,44,11,43};	
		System.out.println(Arrays.toString(arr));  				//������ת�����ַ����ķ��� ,--����ӡ
		
		Arrays.sort(arr);                         			 	//����������
		System.out.println(Arrays.toString(arr));  
		
		int[] arr2 = {11,22,33,44,55,66};	      				//����ķ�����������������
		Arrays.binarySearch(arr2, 22);
		System.out.println(Arrays.binarySearch(arr2, 22));   //�ҵ�Ԫ������λ��(������������)
		System.out.println(Arrays.binarySearch(arr2, 11));
		System.out.println(Arrays.binarySearch(arr2, 23));   //���û�в��ҵ�Ԫ��,���� -�����-1(����23���뵽22��������Ϊ2:��˵õ�-2-1=-3)
	}

}
