package com.java.array;

public class ð������ {

	/**
	 ������ʾ
	* ����߼�ð���������

	 */
	public static void main(String[] args) {
	int[] arr =  {13,153,114,92,64};
	
	ð������(arr);
	��ӡ(arr);
	}
	
	public static void ð������(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
			
		}
	}
	
	public static void ��ӡ(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
