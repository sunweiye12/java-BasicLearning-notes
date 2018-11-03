    
package com.java.array;

import java.util.Arrays;



public class Arrays方法 {

	/**
* A:Arrays类概述
	* 针对数组进行操作的工具类。
	* 提供了排序，查找等功能。
* B:成员方法
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int key)
	 */
	public static void main(String[] args) {
		int[] arr = {33,22,66,44,11,43};	
		System.out.println(Arrays.toString(arr));  				//将数组转换成字符串的方法 ,--并打印
		
		Arrays.sort(arr);                         			 	//将数组排序
		System.out.println(Arrays.toString(arr));  
		
		int[] arr2 = {11,22,33,44,55,66};	      				//下面的方法必须用有序数组
		Arrays.binarySearch(arr2, 22);
		System.out.println(Arrays.binarySearch(arr2, 22));   //找到元素所在位置(用于有序数组)
		System.out.println(Arrays.binarySearch(arr2, 11));
		System.out.println(Arrays.binarySearch(arr2, 23));   //如果没有查找的元素,返回 -插入点-1(例如23插入到22后面插入点为2:因此得到-2-1=-3)
	}

}
