package com.java.���߳�;

public class My6�ػ��߳� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {   			//�����߳�1 ���������
			public void run () {
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "...aaa");
				}
			}
		};
		
		
		Thread t2 = new Thread() {				//�����߳�2 �����50��
			public void run () {
				for (int i = 0; i < 50; i++) {
					System.out.println(getName() + "...bbbbbbbbbbbbbbb");
				}
			}
		};
		
		t2.setDaemon(true);           //���߳�2 ����Ϊ�ػ��߳� ,�����ػ��߳�1 ,���߳�1������Ҳ��֮����,��������Щ���ӳ�
		t1.start();   	//�����߳�
		t2.start();		//�����߳�

	}

}
