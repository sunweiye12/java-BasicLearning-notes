package com.java.���߳�;

public class My8�߳����ȼ� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {                    //�����߳�t1
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName() + "....aaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {                    //�����߳�t1
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName() + "....bb");
				}
			}
		};
		
		t1.setPriority(10);  //�������ȼ� ���Ϊ10  ��СΪ1  Ĭ��Ϊ5   
		t2.setPriority(1);   //���ò�̫����
		
		t1.start();
		t2.start();

	}

}
