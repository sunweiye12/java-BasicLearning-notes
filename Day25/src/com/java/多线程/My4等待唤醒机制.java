package com.java.���߳�;

public class My4�ȴ����ѻ��� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}
                     //�ȴ����ѻ���
class Printer {
	private int flag = 1;
	public  void print1() throws InterruptedException {		//ͬ��������������ʹ�Ķ��̴߳���ʱ���ִ�������ݵ�������
		synchronized (this) {               //���Դ�������һ������,���ǲ����Դ��������Ķ���
			
			if (flag != 1) {
				this.wait();               //�Ȳ�ִ�������߳�,ʹ�䴦�ڵȴ�״̬,ֻ�н�һ�²��ܼ������,���������ʱ��ִ��if���
			}
			
			System.out.print("��.");
			System.out.print("��.");
			System.out.print("��.");
			System.out.print("��.");
			System.out.println("");
			
			flag = 2;
			this.notify();                     //������һ���ȴ��е��߳�
					
		}
	}
	
	public void print2() throws InterruptedException {             //ͬ������synchronized
		synchronized (this) {
			if (flag != 2) {
				this.wait();              //�Ȳ�ִ�������߳�,ʹ�䴦�ڵȴ�״̬,ֻ�н�һ�²��ܼ������,���������ʱ��ִ��if���
			}
			System.out.print("��");
			System.out.print("ϲ");
			System.out.print("��");
			System.out.print("��");
			System.out.println("");
			
			flag = 1;
			this.notify();                     //������һ���ȴ��е��߳�
		}
	}
}