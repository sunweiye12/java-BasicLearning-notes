package com.java.TCPЭ�齻��;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class My1�������� {

	/**
	 *�����
	* ����ServerSocket(��Ҫָ���˿ں�)
	* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
	* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
	* ���������Զ�ȡ�ͻ��������д��������
	* ���������д�����ݵ��ͻ��˵�������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(1235);     	//�����������˿�
		Socket socket = server.accept();					//��ȡ�ͻ��˵�����
		System.out.println(true);
		
		InputStream is = socket.getInputStream();			//��ȡ�ͻ��˵�������Ϣ
		OutputStream os = socket.getOutputStream();			//��ͻ��˷�����Ϣ
		
		os.write("�ٶ�һ�����֪��".getBytes());				//����Ϣд�������
		//os.write("/r/nɽ����У������".getBytes());
		
		//String line = sc.nextLine();
		//os.write(line.getBytes());
		byte[] arr = new byte[1024*8];						//��ȡ�ͻ���д������Ϣ����ӡ���
		int len = is.read(arr);
		System.out.println(new String(arr, 0, len));
		
	    socket.close();

	}

}
