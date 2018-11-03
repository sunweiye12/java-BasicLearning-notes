package com.java.TCP协议交互;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My1服务器端 {

	/**
	 *服务端
	* 创建ServerSocket(需要指定端口号)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(1235);     	//建立服务器端口
		Socket socket = server.accept();					//获取客户端的请求
		System.out.println(true);
		
		InputStream is = socket.getInputStream();			//获取客户端的请求信息
		OutputStream os = socket.getOutputStream();			//向客户端发送信息
		
		os.write("百度一下你就知道".getBytes());				//将信息写入输出流
		//os.write("/r/n山东技校找蓝翔".getBytes());
		
		//String line = sc.nextLine();
		//os.write(line.getBytes());
		byte[] arr = new byte[1024*8];						//读取客户端写来的信息并打印输出
		int len = is.read(arr);
		System.out.println(new String(arr, 0, len));
		
	    socket.close();

	}

}
