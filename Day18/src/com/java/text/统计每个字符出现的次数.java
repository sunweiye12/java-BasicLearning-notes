package com.java.text;

import java.util.HashMap;

public class ͳ��ÿ���ַ����ֵĴ��� {

	/**
* ����ͳ���ַ�����ÿ���ַ����ֵĴ���			
	 */
	public static void main(String[] args) {
		String str = "aaaaaaaabbbbb��bcccccccccc";
		char[] arr = str.toCharArray();						//���ַ���ת�����ַ�����
		HashMap<Character, Integer> hm = new HashMap<>();	//����˫�м��ϴ洢����ֵ
		
		for(char c : arr) {									//�����ַ�����
			if(!hm.containsKey(c)) {						//��������������
				hm.put(c, 1);								//�ͽ�����ֵΪ1���
			}else {											//������������
				hm.put(c, hm.get(c) + 1);					//�ͽ�����ֵ�ټ�1��ӽ���
			}
			
//			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);    //��Ԫ�����  ���㷨
			
//			Integer i = !hm.containsKey(c) ? hm.put(c, 1) : hm.put(c, hm.get(c) + 1);
		}
		
		for (Character key : hm.keySet()) {					//����˫�м���
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
