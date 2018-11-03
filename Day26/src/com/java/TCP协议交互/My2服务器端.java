package com.java.TCP协议交互;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My2服务器端 {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(12345);     	//建立服务器端口
		Socket socket = server.accept();					//获取客户端的请求
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //创建BufferedReader字符流,因为它可以直接读取一行字符串
		PrintStream ps = new PrintStream(socket.getOutputStream());								//创建PrintStream因为它可以直接调用打印
		
		ps.println("百度一下你就知道");
		System.out.println(br.readLine());  //读取的时候以\r\n为分界线
		ps.println("山东技校找蓝翔");
	//	System.out.println(br.readLine());
		
		
	    socket.close();
	}
}
