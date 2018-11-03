package com.java.多线程;

import java.io.IOException;

public class My2Runtime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r1 = Runtime.getRuntime();		//获取运行时对象
		//r1.exec("shutdown -s -t 3000");         //关机倒计时3000分钟
		r1.exec("shutdown -a"); 				  //取消关机计划
	}

}
