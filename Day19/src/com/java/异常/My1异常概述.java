package com.java.�쳣;

public class My1�쳣���� {

	/**
	 * ���й��̳��ֵĴ���(�ɲ鿴API�е�Throwable)
	 * 
	 * NullPointerException ��ָ���쳣
	 * ArrayIndexOutOfBoundsException  ����Խ���쳣
	 * ClassCastException  ����ת���쳣
	 * 
	 * �쳣�ļ̳���ϵ
	* Throwable
		* Error	
		* Exception
			* RuntimeException(����ʱ���ֵ��쳣)
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
	//	arr = null;
		System.out.println(arr[10]);
	}

}
