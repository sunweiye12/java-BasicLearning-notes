package com.java.多线程;

public class My3线程引入2 {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();			//4创建实现了Runnable的类
		new Thread(mt).start(); 				//5通过匿名创建Thread将mt传入来调用start方法开启线程
										
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("呵呵");
		}
	}
}

class MyThread2 implements Runnable {  			//1定义一个类实现Runnable接口

	@Override
	public void run() {							//2重写run方法
		// TODO Auto-generated method stub		//3将要写的方法在润中写入
		for (int i = 0; i < 1000; i++) {
			System.out.println("哈哈哈哈哈");
		}
	}
	
}