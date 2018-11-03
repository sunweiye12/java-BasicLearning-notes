package com.java.多线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class My5三个及以上的线程交流 {

	/**
	 * @param args
	 * 使三个线程分别占用
	 * 	1.同步
	* 使用ReentrantLock类的lock()和unlock()方法进行同步
* 		2.通信
	* 使用ReentrantLock类的newCondition()方法可以获取Condition对象
	* 需要等待的时候使用Condition的await()方法, 唤醒的时候用signal()方法
	* 不同的线程使用不同的Condition, 这样就能区分唤醒的时候找哪个线程了
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
	private Condition c1 = r.newCondition();    //创建三个条件
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	public  void print1() throws InterruptedException {		
		r.lock();                     			//获取锁
			if (flag != 1) {
				c1.await();               
			}
			
			System.out.print("新.");
			System.out.print("年.");
			System.out.print("快.");
			System.out.print("乐.");
			System.out.println("");
			
			flag = 2;
			c2.signal();        
					
		r.unlock();							//释放锁
	}
	
	public void print2() throws InterruptedException {            
		r.lock();
			if (flag != 2) {
				c2.await();           
			}
			System.out.print("恭");
			System.out.print("喜");
			System.out.print("发");
			System.out.print("财");
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
			System.out.print("哈");
			System.out.print("哈");
			System.out.print("哈");
			System.out.println("");
			
			flag = 1;
			c1.signal();                   
		r.unlock();
	}
}