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
		DatagramSocket socket = new DatagramSocket();		  //����socket�൱�ڴ�����ͷ
		Scanner sc = new Scanner(System.in);			//��������¼�����
		
		while(true) {   								//���ϵķ���
			String str = sc.nextLine();					//������¼����󸳸�str
			if("quit".equals(str)) 						//������quitʱֹͣ����
				break;
			DatagramPacket packet = 							//����packet�൱�ڴ�����װ��
					new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("172.23.18.38"), 9999);
			   					//����������(�����͵��ַ�����,�ַ�����ĳ���,Ҫ���͵�ip��ַ(�˴�ָ������ַ),�˿ں�(������һ����ͷ))
			socket.send(packet);		//����װ������ͷ�Ϸ���
		}
		socket.close();

	}

}
