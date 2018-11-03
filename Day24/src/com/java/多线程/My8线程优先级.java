package com.java.多线程;

public class My8线程优先级 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {                    //创建线程t1
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName() + "....aaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {                    //创建线程t1
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName() + "....bb");
				}
			}
		};
		
		t1.setPriority(10);  //设置优先级 最大为10  最小为1  默认为5   
		t2.setPriority(1);   //作用不太明显
		
		t1.start();
		t2.start();

	}

}
