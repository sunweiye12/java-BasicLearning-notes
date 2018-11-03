package com.java.Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class My2_Send {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();		  //创建socket相当于创建码头
		Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		
		while(true) {   								//不断的发送
			String str = sc.nextLine();					//将键盘录入对象赋给str
			if("quit".equals(str)) 						//当输入quit时停止接受
				break;
			DatagramPacket packet = 							//创建packet相当于创建集装箱
					new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("172.23.18.38"), 9999);
			   					//参数的意义(所发送的字符数组,字符数组的长度,要发送的ip地址(此处指本机地址),端口号(发向哪一个码头))
			socket.send(packet);		//将集装箱在码头上发货
		}
		socket.close();

	}

}
