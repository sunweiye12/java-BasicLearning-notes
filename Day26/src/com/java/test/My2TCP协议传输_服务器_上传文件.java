package com.java.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My2TCP协议传输_服务器_上传文件 {

	/**
	 * 3.建立多线程的服务器
	 * 4.读取文件
	 * 5.判断文件是否存在,将结果返回给客户端
	 * 8.定义Fileoutputstream,从网路读取数据,储存到本地
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//3.建立多线程的服务器
		ServerSocket server = new ServerSocket(54321);     		//建立服务器端口
		System.out.println("服务器启动,绑定54321端口");
		while(true) {
			//创建一个多线程服务器,每一接收到请求就会生成新的线程
			final Socket socket = server.accept();			    //获取客户端的请求(局部变量在匿名内部类中使用要设计成fianal类型)
			new Thread() {
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));   //创建BufferedReader字符流,因为它可以直接读取一行字符串
						PrintStream ps = new PrintStream(socket.getOutputStream());								//创建PrintStream因为它可以直接调用打印
						//4.读取文件
						String fileName = br.readLine();		//读取文件名
						
						File dir = new File("update");		//在服务器创建一个update文件夹储存上传文件
						dir.mkdir();
						
						File file = new File(dir, fileName);		//将传过来的文件名封装成update的子集目录
						//5.判断文件是否存在,将结果返回给客户端
						if (file.exists()) {
							ps.println("存在");			//如果服务器已经存在这个文件就返回给客户端信息
							socket.close();
							return;
						} else {
							ps.println("不存在");
						}
						//8.定义Fileoutputstream,从网路读取数据,储存到本地
						FileOutputStream fos = new FileOutputStream(file);
						
						byte[] arr = new byte[8192];
						int len;
						
						while((len = is.read(arr)) != -1) {
							ps.write(arr, 0, len);
						}
						
						is.close();
						socket.close();		//此处关闭时同时也关闭输入输出流
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}

	}

}
