package com.java.�ַ���;

public class My7�ݹ� {

	/**
�ݹ�:�Լ������Լ�
* 5�Ľ׳�	
	 */
	public static void main(String[] args) {
//		int x = 1;
//		for (int i = 1 ;i <= 5 ; i++) {
//			x = x * i;
//		}
//				System.out.println(x);
		System.out.println(fun(4));
	}
	//                      �ݹ�ĺ��Ĵ���
	public static int fun( int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * fun(num - 1);
		}
	}

}
