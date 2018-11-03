package com.java.多线程;

public class My9同步代码块 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread() {                      //创建线程1
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Printer.print1();
				}
			}
		}.start();
		
		new Thread() {						//创建线程2
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Printer.print2();
				}
			}
		}.start();

	}

}
							//构建局部代码块的意义在于只有当这块代码执行完以后才会切换线程
class Printer {
	
	public static void print1() {
		synchronized (Printer.class) {           //可以传入随意一个对象,但是不可以传入匿名的对象
			System.out.print("新.");
			System.out.print("年.");
			System.out.print("快.");
			System.out.print("乐.");
			System.out.println("");
		}
	}
	
	public static synchronized void print2() {             //同步方法synchronized
			System.out.print("恭");
			System.out.print("喜");
			System.out.print("发");
			System.out.print("财");
			System.out.println("");
		
	}
}

class suo{}