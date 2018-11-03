package com.java.多线程;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class My7线程池 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2); //创建一个县城池,并且标明线程池内的线程个数
		
		pool.submit(new MyRunnable());   						//将一个线程对象添加并执行
		pool.submit(new MyRunnable());   						//将另一个线程对象添加并执行
		
		pool.shutdown();                                       //关闭线程池
	}

}
