package com.java.���߳�;

public class My4���ص�ǰ�߳� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread() {
			public void run () {
				System.out.println(Thread.currentThread().getName() + "........��һ���߳�");  //��ȡ�߳�����  ���ַ���
			}
		}.start();
		
		
		new Thread(
				new Runnable() {
					
					public void run() {
						System.out.println(Thread.currentThread().getName() + ".........�ڶ����߳�");  //��ȡ�߳�����  ���ַ���
					}
				}
		).start();
		
		
		System.out.println(Thread.currentThread().getName() + ".......���߳�");     //������̵߳�����

	}

}
