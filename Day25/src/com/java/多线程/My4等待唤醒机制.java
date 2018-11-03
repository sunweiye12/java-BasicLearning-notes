package com.java.多线程;

public class My4等待唤醒机制 {

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
                     //等待唤醒机制
class Printer {
	private int flag = 1;
	public  void print1() throws InterruptedException {		//同步带代码块的设置使的多线程处理时保持代码块内容的完整性
		synchronized (this) {               //可以传入随意一个对象,但是不可以传入匿名的对象
			
			if (flag != 1) {
				this.wait();               //先不执行这条线程,使其处于等待状态,只有叫一下才能继续输出,因此醒来的时候不执行if语句
			}
			
			System.out.print("新.");
			System.out.print("年.");
			System.out.print("快.");
			System.out.print("乐.");
			System.out.println("");
			
			flag = 2;
			this.notify();                     //唤醒另一条等待中的线程
					
		}
	}
	
	public void print2() throws InterruptedException {             //同步方法synchronized
		synchronized (this) {
			if (flag != 2) {
				this.wait();              //先不执行这条线程,使其处于等待状态,只有叫一下才能继续输出,因此醒来的时候不执行if语句
			}
			System.out.print("恭");
			System.out.print("喜");
			System.out.print("发");
			System.out.print("财");
			System.out.println("");
			
			flag = 1;
			this.notify();                     //唤醒另一条等待中的线程
		}
	}
}