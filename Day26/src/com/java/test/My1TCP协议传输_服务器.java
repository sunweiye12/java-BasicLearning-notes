package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My1TCP协议传输_服务器 {
	/**
	 * 客户端向服务器写字符串(键盘录入),服务器(多线程)将字符串反转后写回,客户端再次读取到是反转后的字符串
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(54321);     		//建立服务器端口
		while(true) {
			//创建一个多线程服务器,每一接收到请求就会生成新的线程
			final Socket socket = server.accept();			    //获取客户端的请求(局部变量在匿名内部类中使用要设计成fianal类型)
			System.out.println("服务器启动,绑定54321端口");
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //创建BufferedReader字符流,因为它可以直接读取一行字符串
						PrintStream ps = new PrintStream(socket.getOutputStream());								//创建PrintStream因为它可以直接调用打印
						
						ps.println("欢迎访问服务器  此服务器可以将你输入的字符反向输出 请输入:");		//写给客户端以一条信息
						String line = br.readLine();        //接收客户发来的第一条信息,并作一下处理(反转)
						System.out.println("客户端输入的信息为:" + line);
						line = new StringBuffer(line).reverse().toString();  //链式编程
						ps.println(line);					//写给客户第二条信息
						System.out.println("返回给客户端的信息为:" + line);
						socket.close();		//此处关闭时同时也关闭输入输出流
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
