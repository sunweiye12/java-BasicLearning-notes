package com.java.text;

public class My5쳲��������� {

	/**
	 * @param args
	 *  ��������
		* ���µô���Ԫ1202��˵�𣬻�˵��һλ��������꣬����쳲�������
		* ������һ�������������һ����Ȥ�����⣺����һ�Ըճ�����С��һ���º���ܳ��ɴ��ã��ٹ�һ���¾�������һ��С�ã����Ҵ˺�ÿ���¶���һ��С�ã�һ����û�з���������
		* �ʣ�һ�Ըճ��������ӣ�һ���ڷ�ֳ�ɶ��ٶ�����?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(12));
	}

	public static int fun(int i) {
		// TODO Auto-generated method stub
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return fun(i - 1) + fun(i - 2);
		}
		
	}

	
}
