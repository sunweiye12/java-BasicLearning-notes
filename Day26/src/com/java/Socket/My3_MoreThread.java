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
			
			DatagramSocket socket = new DatagramSocket(6667);						//����socket�൱�ڴ�����ͷ(�˿ں�Ϊ6666)
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);		//����packet�൱�ڴ�����װ��
			
			while(true) {										//��������
				socket.receive(packet);												//���ջ���
				byte[] arr = packet.getData();
				int len = packet.getLength();
				String ip = packet.getAddress().getHostAddress();       //��ȡ���ͷ���ip
				int port = packet.getPort();							//��ȡ���ͷ��Ķ˿ں�
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
			
			DatagramSocket socket = new DatagramSocket();		  //����socket�൱�ڴ�����ͷ
			Scanner sc = new Scanner(System.in);			//��������¼�����
			
			while(true) {   								//���ϵķ���
				String str = sc.nextLine();					//������¼����󸳸�str
				if("quit".equals(str)) 						//������quitʱֹͣ����
					break;
				DatagramPacket packet = 							//����packet�൱�ڴ�����װ��
						new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6667);
				   					//����������(�����͵��ַ�����,�ַ�����ĳ���,Ҫ���͵�ip��ַ(�˴�ָ������ַ),�˿ں�(������һ����ͷ))
				socket.send(packet);		//����װ������ͷ�Ϸ���
			}
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}