package com.java.多线程;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class My3计时器 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		//设置某一时间来完成MyTimerTask中的run方法,最后一个参数为重复执行的时间间隔
		t.schedule(new MyTimerTask(), new Date(118, 2, 10, 19, 41, 20) ,3000);  
		
		while (true) {
			Thread.sleep(1000);              //延迟一秒
			System.out.println(new Date());  //打印当前时间	
		}
	}

}

class MyTimerTask extends TimerTask {


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("起床背英语");
	}
	
}