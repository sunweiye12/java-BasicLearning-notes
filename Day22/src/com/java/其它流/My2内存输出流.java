package com.java.������;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class My2�ڴ������ {

	/**
	 * @param args
	 * 
	 * ��������������ڴ���д����, ���ڴ浱��һ��������, д��֮�����һ���Ի�ȡ����������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); //���ڴ��д�����һ�������������ڴ�����   //����Ҫ����
		//����toString����ֱ�ӷ��ص��Ǵ��뻺�������ַ���
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);
		}
		
//		byte[] arr = baos.toByteArray();                   //�������ڴ��е����ݴ�ŵ�arr������
//		System.out.println(new String(arr));
		
//		System.out.println(baos.toString());
		System.out.println(baos);
		
		fis.close();                      //����
		

	}

}
