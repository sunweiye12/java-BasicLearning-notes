package com.java.多线程;

public class My6守护线程 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {   			//创建线程1 并输出两次
			public void run () {
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "...aaa");
				}
			}
		};
		
		
		Thread t2 = new Thread() {				//创建线程2 并输出50次
			public void run () {
				for (int i = 0; i < 50; i++) {
					System.out.println(getName() + "...bbbbbbbbbbbbbbb");
				}
			}
		};
		
		t2.setDaemon(true);           //将线程2 设置为守护线程 ,负责守护线程1 ,当线程1结束它也随之结束,不过会有些许延迟
		t1.start();   	//开启线程
		t2.start();		//开启线程

	}

}
