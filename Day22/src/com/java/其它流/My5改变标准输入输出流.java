package com.java.������;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class My5�ı��׼��������� {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		��׼������();
		System.setIn(new FileInputStream("a.txt"));  //�ı��׼������,��ԭ���������������ļ�a.txt,���ڻ�ȡ����                          InputStream�ǳ����� ��˴����������� 
		System.setOut(new PrintStream("b.txt"));	//�ı��׼����� ,�������������̨,����д��b.txt�ļ���
		
		InputStream is = System.in;    //��ȡ��׼������,Ĭ��ָ�����,�ı��ָ���ļ�a.txt
		PrintStream ps = System.out;   //��ȡ��׼�����,Ĭ��ָ�����̨,�ı��ָ���ļ�b.txt
		
		int b;                         //���������е����ݸ��Ƶ��������       
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		
		is.close();						//����
		ps.close();

	}

	private static void ��׼������() throws IOException {
		InputStream is = System.in;       	//��ȡ��׼������,��ȡ�������� ����Ϣ
		int i = is.read();                  //(ֻ��ȡ��һ���ֽ�)���������е����ݶ�ȡ����ֵ��i
		System.out.println(i);
		
		is.close();       //����!!!!!(����Ҳ���Ե������������ļ�ʱһ��Ҫ��)
	}

}
