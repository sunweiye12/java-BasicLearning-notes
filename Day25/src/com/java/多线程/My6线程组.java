package com.java.多线程;

public class My6线程组 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadGroup tp = new ThreadGroup("我是线程组的名字");
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(tp, mr, "线程1的名字");   //参数 线程组 县城类 名字
		Thread t2 = new Thread(tp, mr, "线程2的名字");
		
		System.out.println(t1.getThreadGroup().getName());   //打印线程组的名字
		System.out.println(t2.getThreadGroup().getName());

	}

}


class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0 ; i <= 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + "我是一只小蜻蜓" + i);
		}
		
	}
	
}