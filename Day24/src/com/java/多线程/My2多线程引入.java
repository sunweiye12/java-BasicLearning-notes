package com.java.���߳�;

public class My2���߳����� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();   		//4�����̵߳����෽��
		mt.start();								//5����start���������߳�
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("��Ȼ........");
		}
	}

}

class MyThread extends Thread {         		//1�̳�Thread

	public void run() {							//2��дrun			
		for (int i = 0; i < 1000; i++) {
			System.out.println("���");			//3��Ҫִ�еĴ���д��run������
		}
		
	}
	
}