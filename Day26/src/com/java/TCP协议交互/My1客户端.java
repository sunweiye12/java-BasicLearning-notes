package com.java.TCPЭ�齻��;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class My1�ͻ��� {

	/**
	 * �ͻ���
	* ����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
	* ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
	* ���������Զ�ȡ����������д��������
	* ���������д�����ݵ�����˵�������
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 1235);  	//�����ͻ��˶˿�,���������������
		//Scanner sc = new Scanner(System.in);
		InputStream is = socket.getInputStream();			//��ȡ�������˵���Ϣ
		OutputStream os = socket.getOutputStream();			//��������˷�����Ϣ
		
		//String line = sc.nextLine();
		os.write("�ھ�������ļ�ǿ".getBytes());				//����Ϣд�������
		//os.write(line.getBytes());
	
		byte[] arr = new byte[1024*8];						//��ȡ��������д������Ϣ����ӡ���
		int len = is.read(arr);
		System.out.println(new String(arr, 0, len));
		
		socket.close();
	}

}
