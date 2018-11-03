package com.java.���߳�;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class My5���������ϵ��߳̽��� {

	/**
	 * @param args
	 * ʹ�����̷ֱ߳�ռ��
	 * 	1.ͬ��
	* ʹ��ReentrantLock���lock()��unlock()��������ͬ��
* 		2.ͨ��
	* ʹ��ReentrantLock���newCondition()�������Ի�ȡCondition����
	* ��Ҫ�ȴ���ʱ��ʹ��Condition��await()����, ���ѵ�ʱ����signal()����
	* ��ͬ���߳�ʹ�ò�ͬ��Condition, �����������ֻ��ѵ�ʱ�����ĸ��߳���
	 */
	public static void main(String[] args) {
		
		final Printer2 p = new Printer2();
		
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
				
				new Thread() {
					public void run() {
						while(true) {
							try {
								p.print3();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}.start();
		
		}

}

class Printer2 {
	
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();    //������������
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	public  void print1() throws InterruptedException {		
		r.lock();                     			//��ȡ��
			if (flag != 1) {
				c1.await();               
			}
			
			System.out.print("��.");
			System.out.print("��.");
			System.out.print("��.");
			System.out.print("��.");
			System.out.println("");
			
			flag = 2;
			c2.signal();        
					
		r.unlock();							//�ͷ���
	}
	
	public void print2() throws InterruptedException {            
		r.lock();
			if (flag != 2) {
				c2.await();           
			}
			System.out.print("��");
			System.out.print("ϲ");
			System.out.print("��");
			System.out.print("��");
			System.out.println("");
			
			flag = 3;
			c3.signal();                    
		r.unlock();
	}
	
	public void print3() throws InterruptedException {            
		r.lock();
			if (flag != 3) {
				c3.await();           
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("");
			
			flag = 1;
			c1.signal();                   
		r.unlock();
	}
}