package com.java.text;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ��ӡ {

	/**
	 * @param args
	 * ����һ���ļ�������,����read(byte[] b)����,��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  //�����ڴ滺����
		
		int len = 5;                              //��С����ķ�ʽ��������ת��
		Byte[] arr = new Byte[len];
		while((len = fis.read()) != -1) {
			baos.write(len);
		}
		
		fis.close();
		System.out.println(baos);
		

	}

}
