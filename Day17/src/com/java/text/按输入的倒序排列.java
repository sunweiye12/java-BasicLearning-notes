package com.java.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ������ĵ������� {

	/**
	 * 
	 * ����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
	 * 1.��������¼�����
	 * 2.����treeset����,������ӱȽ���
	 * 3.����ѭ��,��ȡ¼����Ϣ,ֱ���ܵ�quit����ѭ��
	 * 4.��������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) { 
		//		int num = s1 - s2;
		//		int num = s1.compareTo(s2);
		//		return num == 0 ? 1 : num ;  //���Դ���ظ���int��
				return -1;
			}
		});
		
		while(true) {
			String line = sc.nextLine();
			if("qult".equals(line)) {
				break;
			}
			Integer in = Integer.parseInt(line);
			ts.add(in);
		}
		
		for (Integer in : ts) {
			System.out.println(in);
		}
		//System.out.println(ts);
	}

}
