package com.java.多线程;

public class My5线程延迟 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 10; i > 0; i--) {
			Thread.sleep(1000);            //后面跟的是毫秒值,因此1000毫秒是一秒,从而构成了一个一秒的振荡器
			System.out.println("倒计时第" + i + "秒");
		}
		Thread.sleep(1000); 
		System.out.println("发射-------------------------------------------------->");

	}

}
