package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class My1TCPЭ�鴫��_�ͻ��� {

	/**
	 *�ͻ����������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ���Ƿ�ת����ַ��� 
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1", 54321);  	//�����ͻ��˶˿�,���������������
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());

		System.out.println(br.readLine());  		//���ܷ��������͵ĵ�һ����Ϣ���Ҵ�ӡ
		ps.println(sc.nextLine());              //����������͵�һ����Ϣ
		System.out.println(br.readLine());      //��ȡ������д��������Ϣ�ڶ�����Ϣ����ӡ
		
		socket.close();
	}

}
