package com.java.TCP协议交互;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class My1客户端 {

	/**
	 * 客户端
	* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
	* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
	* 输入流可以读取服务端输出流写出的数据
	* 输出流可以写出数据到服务端的输入流
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 1235);  	//建立客户端端口,想服务器发送请求
		//Scanner sc = new Scanner(System.in);
		InputStream is = socket.getInputStream();			//获取服务器端的信息
		OutputStream os = socket.getOutputStream();			//向服务器端发送信息
		
		//String line = sc.nextLine();
		os.write("挖掘机技术哪家强".getBytes());				//将信息写入输出流
		//os.write(line.getBytes());
	
		byte[] arr = new byte[1024*8];						//读取服务器端写来的信息并打印输出
		int len = is.read(arr);
		System.out.println(new String(arr, 0, len));
		
		socket.close();
	}

}
