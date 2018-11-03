package com.java.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My2TCPЭ�鴫��_������_�ϴ��ļ� {

	/**
	 * 3.�������̵߳ķ�����
	 * 4.��ȡ�ļ�
	 * 5.�ж��ļ��Ƿ����,��������ظ��ͻ���
	 * 8.����Fileoutputstream,����·��ȡ����,���浽����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//3.�������̵߳ķ�����
		ServerSocket server = new ServerSocket(54321);     		//�����������˿�
		System.out.println("����������,��54321�˿�");
		while(true) {
			//����һ�����̷߳�����,ÿһ���յ�����ͻ������µ��߳�
			final Socket socket = server.accept();			    //��ȡ�ͻ��˵�����(�ֲ������������ڲ�����ʹ��Ҫ��Ƴ�fianal����)
			new Thread() {
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));   //����BufferedReader�ַ���,��Ϊ������ֱ�Ӷ�ȡһ���ַ���
						PrintStream ps = new PrintStream(socket.getOutputStream());								//����PrintStream��Ϊ������ֱ�ӵ��ô�ӡ
						//4.��ȡ�ļ�
						String fileName = br.readLine();		//��ȡ�ļ���
						
						File dir = new File("update");		//�ڷ���������һ��update�ļ��д����ϴ��ļ�
						dir.mkdir();
						
						File file = new File(dir, fileName);		//�����������ļ�����װ��update���Ӽ�Ŀ¼
						//5.�ж��ļ��Ƿ����,��������ظ��ͻ���
						if (file.exists()) {
							ps.println("����");			//����������Ѿ���������ļ��ͷ��ظ��ͻ�����Ϣ
							socket.close();
							return;
						} else {
							ps.println("������");
						}
						//8.����Fileoutputstream,����·��ȡ����,���浽����
						FileOutputStream fos = new FileOutputStream(file);
						
						byte[] arr = new byte[8192];
						int len;
						
						while((len = is.read(arr)) != -1) {
							ps.write(arr, 0, len);
						}
						
						is.close();
						socket.close();		//�˴��ر�ʱͬʱҲ�ر����������
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}

	}

}
