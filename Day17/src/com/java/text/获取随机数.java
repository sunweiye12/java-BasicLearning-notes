package com.java.text;

import java.util.HashSet;
import java.util.Random;

public class ��ȡ����� {

	/**
	* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��		
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();		//�������϶���
		Random r = new Random();					//�������������
		
		while(hs.size() < 10) {                     //ʹ���ϵĳ���Ϊ10 ��Ԫ��
			int num = r.nextInt(20) + 1;			//����1��20�������
			hs.add(num);
		}
		
		for (Integer ig : hs) {				//��������
			System.out.println(ig);			//��ӡÿһ��Ԫ��(��Ϊinteger����)
		}
	}

}
