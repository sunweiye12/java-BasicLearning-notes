package com.java.array;

public class Ã°ÅİÅÅĞò {

	/**
	 °¸ÀıÑİÊ¾
	* Êı×é¸ß¼¶Ã°ÅİÅÅĞò´úÂë

	 */
	public static void main(String[] args) {
	int[] arr =  {13,153,114,92,64};
	
	Ã°ÅİÅÅĞò(arr);
	´òÓ¡(arr);
	}
	
	public static void Ã°ÅİÅÅĞò(int[] arr) {
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
	
	public static void ´òÓ¡(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
