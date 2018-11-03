package com.java.多线程;

public class My7插队线程 {

	/**
	 * @param args
	 * * join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
	 * join(int), 可以等待指定的毫秒之后继续
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread t1 = new Thread() {                    //创建线程t1
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(getName() + "....aaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {                    //创建线程t2
			public void run() {
				for (int i = 0; i < 10; i++) {
					if (i == 2) {
						try {
							//t1.join();          //在匿名内部类里使用局部变量,因此必须将t1设置为final类型
							//加入线程类似于插队操作,当t2执行两次的时候t1插队,使t1执行完以后再执行t2
							t1.join(10); //后面跟的是毫秒值,也就是插队10毫秒结束.  然后继续交替执行t1和t2
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "....bb");
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
