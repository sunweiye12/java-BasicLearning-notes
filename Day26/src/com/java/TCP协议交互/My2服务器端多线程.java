package com.java.TCPЭ�齻��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My2�������˶��߳� {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(12345);     	//�����������˿�
		while(true) {
			//����һ�����̷߳�����,ÿһ���յ�����ͻ������µ��߳�
			final Socket socket = server.accept();			    //��ȡ�ͻ��˵�����(�ֲ������������ڲ�����ʹ��Ҫ��Ƴ�fianal����)
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //����BufferedReader�ַ���,��Ϊ������ֱ�Ӷ�ȡһ���ַ���
						PrintStream ps = new PrintStream(socket.getOutputStream());								//����PrintStream��Ϊ������ֱ�ӵ��ô�ӡ
						ps.println("�ٶ�һ�����֪��");
						System.out.println(br.readLine());  //��ȡ��ʱ����\r\nΪ�ֽ���
						ps.println("ɽ����У������");
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
			
			
		}
		
	}
}
