package com.java.���߳�;

public class My3�߳�����2 {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();			//4����ʵ����Runnable����
		new Thread(mt).start(); 				//5ͨ����������Thread��mt����������start���������߳�
										
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("�Ǻ�");
		}
	}
}

class MyThread2 implements Runnable {  			//1����һ����ʵ��Runnable�ӿ�

	@Override
	public void run() {							//2��дrun����
		// TODO Auto-generated method stub		//3��Ҫд�ķ���������д��
		for (int i = 0; i < 1000; i++) {
			System.out.println("����������");
		}
	}
	
}