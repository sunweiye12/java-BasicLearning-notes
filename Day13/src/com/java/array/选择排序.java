package com.java.array;

public class —°‘Ò≈≈–Ú {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {13,56,32,46,99,11};
		
		—°‘Ò≈≈–Ú(arr);
		¥Ú”°(arr);

	}
	
	public static void —°‘Ò≈≈–Ú(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}
	
	public static void ¥Ú”°(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
