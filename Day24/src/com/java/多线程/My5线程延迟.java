package com.java.���߳�;

public class My5�߳��ӳ� {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 10; i > 0; i--) {
			Thread.sleep(1000);            //��������Ǻ���ֵ,���1000������һ��,�Ӷ�������һ��һ�������
			System.out.println("����ʱ��" + i + "��");
		}
		Thread.sleep(1000); 
		System.out.println("����-------------------------------------------------->");

	}

}
