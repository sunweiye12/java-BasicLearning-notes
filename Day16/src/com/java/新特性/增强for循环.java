package com.java.������;

import java.util.ArrayList;
import java.util.Iterator;

public class ��ǿforѭ�� {

	/**
 A:��ǿfor����
	* �������Collection���ϵı���
* B:��ʽ��
	for(Ԫ���������� ���� : �������Collection����) {
		ʹ�ñ������ɣ��ñ�������Ԫ��
	}
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};		
		for(int i :arr) {							//��ǿforѭ�� ����������(��ݼ� fore)
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		
		for (String str : list) {                    //��ǿforѭ�� ����������
			System.out.println(str);
		}
		
		Iterator<String> it = list.iterator();      //���õ����� ʵ�ּ��ϵı���
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
}
