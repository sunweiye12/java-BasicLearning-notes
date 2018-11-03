package com.java.字符流;

public class My7递归 {

	/**
递归:自己调用自己
* 5的阶乘	
	 */
	public static void main(String[] args) {
//		int x = 1;
//		for (int i = 1 ;i <= 5 ; i++) {
//			x = x * i;
//		}
//				System.out.println(x);
		System.out.println(fun(4));
	}
	//                      递归的核心代码
	public static int fun( int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * fun(num - 1);
		}
	}

}
