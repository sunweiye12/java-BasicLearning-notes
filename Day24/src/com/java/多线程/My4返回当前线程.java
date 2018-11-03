package com.java.多线程;

public class My4返回当前线程 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread() {
			public void run () {
				System.out.println(Thread.currentThread().getName() + "........第一个线程");  //获取线程名字  加字符串
			}
		}.start();
		
		
		new Thread(
				new Runnable() {
					
					public void run() {
						System.out.println(Thread.currentThread().getName() + ".........第二个线程");  //获取线程名字  加字符串
					}
				}
		).start();
		
		
		System.out.println(Thread.currentThread().getName() + ".......主线程");     //输出主线程的名字

	}

}
