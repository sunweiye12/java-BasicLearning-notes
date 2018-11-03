package com.java.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class My2TCP协议传输_客户端 {

	/**
	 *1.提示要上传的文件路径,并判断是否存在及是否为文件夹
	 *2.发送文件名到服务器
	 *6.接受结果,如果存在给予提示,程序直接退出
	 *7.如果不存在,定义Fileinputstream,写出到网络
	 *
	 *测试地址     D:\电影\52 临渊而行_超清.mp4
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.提示要上传的文件路径,并判断是否存在及是否为文件夹
		File file = Getfile();
		//2.发送文件名到服务器
		Socket socket = new Socket("127.0.0.1", 54321);  	//建立客户端端口,想服务器发送请求
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file.getName());
		
		String result = br.readLine();			//读取服务器返回结果
		//6.接受结果,如果存在给予提示,程序直接退出
		if ("存在".equals(result)) {
			System.out.println("您上传的文件已经存在,请不要重复上传!");
			socket.close();
			return;
		}
		//7.如果不存在,定义Fileinputstream,写出到网络
		FileInputStream fis = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len;
		
		while((len = fis.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		fis.close();
		socket.close();

	}

	public static File Getfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入文件路径,我们将会为您上传至服务器:");
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("您输入的文件路径不存在,请您输入正确路径:");
			} else if (file.isDirectory()) {
				System.out.println("您输入的是文件夹路径,请您输入文件的路径:");
			} else {
				return file;
			}
		}
	}
	

}
