package com.java.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class My2TCPЭ�鴫��_�ͻ��� {

	/**
	 *1.��ʾҪ�ϴ����ļ�·��,���ж��Ƿ���ڼ��Ƿ�Ϊ�ļ���
	 *2.�����ļ�����������
	 *6.���ܽ��,������ڸ�����ʾ,����ֱ���˳�
	 *7.���������,����Fileinputstream,д��������
	 *
	 *���Ե�ַ     D:\��Ӱ\52 ��Ԩ����_����.mp4
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.��ʾҪ�ϴ����ļ�·��,���ж��Ƿ���ڼ��Ƿ�Ϊ�ļ���
		File file = Getfile();
		//2.�����ļ�����������
		Socket socket = new Socket("127.0.0.1", 54321);  	//�����ͻ��˶˿�,���������������
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file.getName());
		
		String result = br.readLine();			//��ȡ���������ؽ��
		//6.���ܽ��,������ڸ�����ʾ,����ֱ���˳�
		if ("����".equals(result)) {
			System.out.println("���ϴ����ļ��Ѿ�����,�벻Ҫ�ظ��ϴ�!");
			socket.close();
			return;
		}
		//7.���������,����Fileinputstream,д��������
		FileInputStream fis = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len;
		
		while((len = fis.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		fis.close();
		socket.close();

	}

	public static File Getfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ļ�·��,���ǽ���Ϊ���ϴ���������:");
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("��������ļ�·��������,����������ȷ·��:");
			} else if (file.isDirectory()) {
				System.out.println("����������ļ���·��,���������ļ���·��:");
			} else {
				return file;
			}
		}
	}
	

}
