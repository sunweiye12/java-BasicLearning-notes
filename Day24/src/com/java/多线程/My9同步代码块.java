package com.java.���߳�;

public class My9ͬ������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread() {                      //�����߳�1
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Printer.print1();
				}
			}
		}.start();
		
		new Thread() {						//�����߳�2
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Printer.print2();
				}
			}
		}.start();

	}

}
							//�����ֲ���������������ֻ�е�������ִ�����Ժ�Ż��л��߳�
class Printer {
	
	public static void print1() {
		synchronized (Printer.class) {           //���Դ�������һ������,���ǲ����Դ��������Ķ���
			System.out.print("��.");
			System.out.print("��.");
			System.out.print("��.");
			System.out.print("��.");
			System.out.println("");
		}
	}
	
	public static synchronized void print2() {             //ͬ������synchronized
			System.out.print("��");
			System.out.print("ϲ");
			System.out.print("��");
			System.out.print("��");
			System.out.println("");
		
	}
}

class suo{}