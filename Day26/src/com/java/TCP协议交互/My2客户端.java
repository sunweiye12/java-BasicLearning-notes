package com.java.TCPЭ�齻��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class My2�ͻ��� {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 12345);  	//�����ͻ��˶˿�,���������������
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		System.out.println(br.readLine());
		ps.println("�ھ�������ļ�ǿ");
		System.out.println(br.readLine());
	
		
		socket.close();
	}
}
