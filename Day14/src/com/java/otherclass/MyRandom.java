package com.java.otherclass;

import java.util.Random;

public class MyRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();   //							ÿ�����н���ı�
		int x = r.nextInt();       //����һ�������int��                      
		System.out.println(x);
		
		System.out.println("------------------------");
		Random r2 = new Random(111111);   //	(�Ӹ�����)		ÿ�����н������
		int y = r2.nextInt();             //����һ�������int��                 
		System.out.println(y);            //�������nһ���̶�������� 
		
		System.out.println("------------------------");
		Random r3 = new Random();   
		int z = r3.nextInt(10);     //������һ�� 0��9 ������  ***************
		System.out.println(z);    
		
		//********������ʹÿ�ε�����̶�    ��NextInt��������޶��������ȡֵ��Χ
	}

}
