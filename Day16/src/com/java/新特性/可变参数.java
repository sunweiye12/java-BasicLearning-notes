package com.java.������;

public class �ɱ���� {

	/**
  A:��
	* ���巽����ʱ��֪���ö�����ٸ�����
* B:��ʽ
	* ���η� ����ֵ���� ������(�������͡�  ������){}
* C:ע�����
	* ����ı�����ʵ��һ������
	* ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
//		print(arr);
		print(11,22,33,44);
		
	}
	
	
	public static void print(int x,int ... arr) {         //�ɱ������һ������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
