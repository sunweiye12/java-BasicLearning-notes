package com.java.text;

import java.util.ArrayList;

public class My6Լɪ�� {

	/**
	 * @param args
	 * * ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLuckyNum(8));
	}
	
	//�������ַ���
	//����ֵ���� int num
	//�����б� int num
	public static int getLuckyNum( int num) {
		ArrayList<Integer> list = new ArrayList<>();    //����һ��������������
		for(int i = 1; i <= num;i++) {					//�����ݴ嵽������
			list.add(i);
		}
		int count = 1;
		for (int i = 0; list.size() != 1; i++) {
			if (i == list.size()) {
				i = 0;
			}
			
			if (count % 3 == 0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}
}
