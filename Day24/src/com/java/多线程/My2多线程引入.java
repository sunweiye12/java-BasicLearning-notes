package com.java.多线程;

public class My2多线程引入 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();   		//4创建线程的子类方法
		mt.start();								//5调用start方法开启线程
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("当然........");
		}
	}

}

class MyThread extends Thread {         		//1继承Thread

	public void run() {							//2重写run			
		for (int i = 0; i < 1000; i++) {
			System.out.println("你好");			//3将要执行的代码写到run方法中
		}
		
	}
	
}