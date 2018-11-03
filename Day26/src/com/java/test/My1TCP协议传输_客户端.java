package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class My1TCP协议传输_客户端 {

	/**
	 *客户端向服务器写字符串(键盘录入),服务器(多线程)将字符串反转后写回,客户端再次读取到是反转后的字符串 
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1", 54321);  	//建立客户端端口,想服务器发送请求
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());

		System.out.println(br.readLine());  		//接受服务器发送的第一个信息并且打印
		ps.println(sc.nextLine());              //向服务器发送第一条信息
		System.out.println(br.readLine());      //读取服务器写过来的信息第二条信息并打印
		
		socket.close();
	}

}
