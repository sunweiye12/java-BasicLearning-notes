package com.java.���߳�;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class My3��ʱ�� {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		//����ĳһʱ�������MyTimerTask�е�run����,���һ������Ϊ�ظ�ִ�е�ʱ����
		t.schedule(new MyTimerTask(), new Date(118, 2, 10, 19, 41, 20) ,3000);  
		
		while (true) {
			Thread.sleep(1000);              //�ӳ�һ��
			System.out.println(new Date());  //��ӡ��ǰʱ��	
		}
	}

}

class MyTimerTask extends TimerTask {


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�𴲱�Ӣ��");
	}
	
}