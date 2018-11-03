package com.java.多线程;

public class My1多线程 {

	/**
	 * @param args
	 * 1.什么是线程
	* 线程是程序执行的一条路径, 一个进程中可以包含多条线程
	* 多线程并发执行可以提高程序的效率, 可以同时完成多项工作
*	 2.多线程的应用场景
	* 红蜘蛛同时共享屏幕给多个电脑
	* 迅雷开启多条线程一起下载
	* QQ同时和多个人一起视频
	* 服务器同时处理多个客户端请求
    多线程并行和并发的区别
* 并行就是两个任务同时运行，就是甲任务进行的同时，乙任务也在进行。(需要多核CPU)
* 并发是指两个任务都请求运行，而处理器只能按受一个任务，就把这两个任务安排轮流进行，由于时间间隔较短，使人感觉两个任务都在运行。
* 比如我跟两个网友聊天，左手操作一个电脑跟甲聊，同时右手用另一台电脑跟乙聊天，这就叫并行。
* 如果用一台电脑我先给甲发个消息，然后立刻再给乙发消息，然后再跟甲聊，再跟乙聊。这就叫并发。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100000; i++) {              //两条线是交叉执行,而不是执行完第一项后执行的第二项
			new demo();									//因此可以看出jvm虚拟机是多线程的
		}
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("我是主线程");
		}

	}
	
	

}

class demo{

	@Override
	public void finalize()  {   //当内存占用过多时   系统自动执行此方法
		// TODO Auto-generated method stub
		System.out.println("垃圾被清理了");
	}
	
}
