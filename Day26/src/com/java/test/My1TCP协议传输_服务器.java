package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My1TCPЭ�鴫��_������ {
	/**
	 * �ͻ����������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ���Ƿ�ת����ַ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(54321);     		//�����������˿�
		while(true) {
			//����һ�����̷߳�����,ÿһ���յ�����ͻ������µ��߳�
			final Socket socket = server.accept();			    //��ȡ�ͻ��˵�����(�ֲ������������ڲ�����ʹ��Ҫ��Ƴ�fianal����)
			System.out.println("����������,��54321�˿�");
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //����BufferedReader�ַ���,��Ϊ������ֱ�Ӷ�ȡһ���ַ���
						PrintStream ps = new PrintStream(socket.getOutputStream());								//����PrintStream��Ϊ������ֱ�ӵ��ô�ӡ
						
						ps.println("��ӭ���ʷ�����  �˷��������Խ���������ַ�������� ������:");		//д���ͻ�����һ����Ϣ
						String line = br.readLine();        //���տͻ������ĵ�һ����Ϣ,����һ�´���(��ת)
						System.out.println("�ͻ����������ϢΪ:" + line);
						line = new StringBuffer(line).reverse().toString();  //��ʽ���
						ps.println(line);					//д���ͻ��ڶ�����Ϣ
						System.out.println("���ظ��ͻ��˵���ϢΪ:" + line);
						socket.close();		//�˴��ر�ʱͬʱҲ�ر����������
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
