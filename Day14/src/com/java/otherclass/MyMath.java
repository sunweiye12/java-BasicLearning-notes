package com.java.otherclass;

public class MyMath {

	/**
* A:Math�����
	* Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
* B:��Ա����
	* public static int abs(int a)
	* public static double ceil(double a)
	* public static double floor(double a)
	* public static int max(int a,int b) min��ѧ
	* public static double pow(double a,double b)
	* public static double random()
	* public static int round(float a) ����Ϊdouble����ѧ
	* public static double sqrt(double a)
	 */
	public static void main(String[] args) {
		
		System.out.println(Math.random());			//�õ�[0.0  1.0)��С��
		System.out.println(Math.PI);            	//��ӡԲ���ʵ�ֵ
		System.out.println(Math.abs(-10));      	//ȡ����ֵ
		System.out.println(Math.round(28.4));		//�õ��������������
		System.out.println(Math.ceil(12.5));    	//����ȡ�� �õ�doubleֵ
		System.out.println(Math.floor(12.5));   	//����ȡ�� �õ�doubleֵ
		System.out.println(Math.max(10,20));		//��ȡ��ֵ
		System.out.println(Math.pow(2,3));		    //��ȡ2��3�η� �õ�doubleֵ
		System.out.println(Math.sqrt(2));           //��2��ƽ��
			
	}

}
