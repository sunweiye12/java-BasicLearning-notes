package com.java.���߳�;

public class My6�߳��� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadGroup tp = new ThreadGroup("�����߳��������");
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(tp, mr, "�߳�1������");   //���� �߳��� �س��� ����
		Thread t2 = new Thread(tp, mr, "�߳�2������");
		
		System.out.println(t1.getThreadGroup().getName());   //��ӡ�߳��������
		System.out.println(t2.getThreadGroup().getName());

	}

}


class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0 ; i <= 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + "����һֻС����" + i);
		}
		
	}
	
}