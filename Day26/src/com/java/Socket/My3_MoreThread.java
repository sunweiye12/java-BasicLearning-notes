package com.java.Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class My3_MoreThread {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new Receive().start();
		Thread.sleep(1000); 
		new Send().start();
		
	}

}

class Receive extends Thread {
	public void run() {
		
		try {
			
			DatagramSocket socket = new DatagramSocket(6667);						//创建socket相当于创建码头(端口号为6666)
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);		//创建packet相当于创建集装箱
			
			while(true) {										//持续接受
				socket.receive(packet);												//接收货物
				byte[] arr = packet.getData();
				int len = packet.getLength();
				String ip = packet.getAddress().getHostAddress();       //获取发送方的ip
				int port = packet.getPort();							//获取发送方的端口号
				System.out.println(ip + "(" + port + ")" + ":" + new String(arr,0,len));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

class Send extends Thread {
	public void run() {
		try {
			
			DatagramSocket socket = new DatagramSocket();		  //创建socket相当于创建码头
			Scanner sc = new Scanner(System.in);			//创建键盘录入对象
			
			while(true) {   								//不断的发送
				String str = sc.nextLine();					//将键盘录入对象赋给str
				if("quit".equals(str)) 						//当输入quit时停止接受
					break;
				DatagramPacket packet = 							//创建packet相当于创建集装箱
						new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6667);
				   					//参数的意义(所发送的字符数组,字符数组的长度,要发送的ip地址(此处指本机地址),端口号(发向哪一个码头))
				socket.send(packet);		//将集装箱在码头上发货
			}
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}