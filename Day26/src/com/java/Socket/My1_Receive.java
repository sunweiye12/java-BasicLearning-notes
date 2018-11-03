package com.java.Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class My1_Receive {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);						//创建socket相当于创建码头(端口号为6666)
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);		//创建packet相当于创建集装箱
		
		while(true) {										//持续接受
			socket.receive(packet);												//接收货物
			byte[] arr = packet.getData();
			int len = packet.getLength();
			String ip = packet.getAddress().getHostAddress();       //获取发送方的ip
			int port = packet.getPort();							//获取发送方的端口号
			System.out.println(ip + "(" + port + ")" + ":" + new String(arr,0,len));
		}

	}

}
