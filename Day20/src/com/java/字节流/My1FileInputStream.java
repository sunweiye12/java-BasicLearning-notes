package com.java.�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class My1FileInputStream {

	/**
	 * ���ļ�
	 * @param args
	 * @throws IOException 
	 *  read()������ȡ����һ���ֽ�,Ϊʲô������int(����4���ֽ�),������byte:(�ֽ�)(һ���ֽ�Ϊ8λ)
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��ȡ����();                
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x;
		while ((x = fis.read()) != -1) {  //����ȡ��-1ʱ�����ı�����
			System.out.println(x);			//��������ֽڵİ�˹�����
		}
		
	}

	private static void ��ȡ����() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");  //�����ļ�������ʱ��һ����ַ������(xxx.txt�������)
		int x = fis.read();                                    //��Ӳ���϶�ȡһ���ֽ�,��ָ��ЧӦ///�˴�Ҫ�׳�����,��Ϊ�п����ļ����ɶ�
		int y = fis.read();									   //��-1����	
		System.out.println(x);
		System.out.println(y);
		fis.close();                                        //��ִ���������Ҫ���������ر�,�ͷ���Դ
	}

}
