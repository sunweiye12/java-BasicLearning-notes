package com.java.�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My4�ֽ����������� {

	/**
	 * 
* �ֽ�����ȡ���ĵ�����
	* �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
* �ֽ���д�����ĵ�����
	* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
	* д���س����� write("\r\n".getBytes());
	 * @throws IOException 

	 */
	public static void main(String[] args) throws IOException {
		//�ֽ�����ȡ����();
		//�ֽ���д������();

	}

	private static void �ֽ���д������() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		fos.write("�Ұ���,�л�".getBytes());   //���ַ���ת��Ϊ�ֽ�����
		fos.write("\r\n".getBytes());         //�س�
		fos.write("�Ұ���,�й�".getBytes());
		fos.close();
	}

	private static void �ֽ�����ȡ����() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[4];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));     //���ֽ�����ת��Ϊ�ַ���
		}
		
		fis.close();
	}

}
