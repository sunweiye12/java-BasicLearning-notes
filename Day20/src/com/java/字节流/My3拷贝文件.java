package com.java.�ֽ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My3�����ļ� {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//�����ֽڿ���();
		//�ֽ����鿽��();   ���Ƽ� �ÿ��ܵ����ڴ����
		//С���鿽��();     �Ƽ�
		//������������();
		
		
	}

	private static void ������������() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//��������������,����123.png�ļ�
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//�������������,����copy.png�ļ�
		BufferedInputStream bis = new BufferedInputStream(fis);     //��������������������
		BufferedOutputStream bos = new BufferedOutputStream(fos);	//�������������������
		int a;
		while ((a = bis.read()) != -1) {     	//��ȡ�������е��ֽ�,ֱ������
			bos.write(a);						//���������д�ֽ�
		}
		bis.close();							//�ر�����������,�ͷ���Դ
		bos.close();
	}

	private static void С���鿽��() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//��������������,����123.png�ļ�
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//�������������,����copy.png�ļ�
		byte[] arr = new byte[1024 * 8];                                 //����һ������Ϊ2 ���ֽ�������Ϊ����
		int len;                                                  //����ÿ�������е���Ч�ַ�����
		while((len = fis.read(arr)) != -1) {                      //�����ַ������ȡ�������е�����,��ȡÿ�ε���Ч����,ֱ������
			fos.write(arr, 0, len);                               //�������д���ַ������е���Ч�ַ�
		} 
		fis.close();
		fos.close();
	}

	private static void �ֽ����鿽��() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//��������������,����123.png�ļ�
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//�������������,����copy.png�ļ�
//		int len = fis.available();     //�õ�����ȡ���ļ����ֽ���
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];       //����һ���ֽ�����
		fis.read(arr);                                //ͨ������ʵ��һ����ת���ļ�����
		fos.write(arr);
		
		fis.close();
		fos.close();
	}

	private static void �����ֽڿ���() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//��������������,����123.png�ļ�
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//�������������,����copy.png�ļ�
		
		int a;
		while ((a = fis.read()) != -1) {     	//��ȡ�������е��ֽ�,ֱ������
			fos.write(a);						//���������д�ֽ�
		}
		fis.close();							//�ر�����������,�ͷ���Դ
		fos.close();
	}

}
