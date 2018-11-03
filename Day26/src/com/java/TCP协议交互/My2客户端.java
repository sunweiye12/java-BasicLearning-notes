package com.java.TCP协议交互;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class My2客户端 {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 12345);  	//建立客户端端口,想服务器发送请求
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		System.out.println(br.readLine());
		ps.println("挖掘机技术哪家强");
		System.out.println(br.readLine());
	
		
		socket.close();
	}
}
