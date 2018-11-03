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
		DatagramSocket socket = new DatagramSocket(6666);						//����socket�൱�ڴ�����ͷ(�˿ں�Ϊ6666)
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);		//����packet�൱�ڴ�����װ��
		
		while(true) {										//��������
			socket.receive(packet);												//���ջ���
			byte[] arr = packet.getData();
			int len = packet.getLength();
			String ip = packet.getAddress().getHostAddress();       //��ȡ���ͷ���ip
			int port = packet.getPort();							//��ȡ���ͷ��Ķ˿ں�
			System.out.println(ip + "(" + port + ")" + ":" + new String(arr,0,len));
		}

	}

}
