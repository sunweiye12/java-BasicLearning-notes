package com.java.���߳�;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class My7�̳߳� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2); //����һ���سǳ�,���ұ����̳߳��ڵ��̸߳���
		
		pool.submit(new MyRunnable());   						//��һ���̶߳�����Ӳ�ִ��
		pool.submit(new MyRunnable());   						//����һ���̶߳�����Ӳ�ִ��
		
		pool.shutdown();                                       //�ر��̳߳�
	}

}
