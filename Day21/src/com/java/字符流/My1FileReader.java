package com.java.�ַ���;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class My1FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//������();
		������_��������();
	}

	private static void ������_��������() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int c;
		while((c = fr.read()) != -1) {
			char x = (char)c;     //���Ҫ�ִ�����ת��,ת��Ϊ���ַ�����
			System.out.print(x);
		}
		fr.close();
	}

	private static void ������() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int x = fr.read();    //��ȡ����һ���ַ� ����ֵ��intʱ �Զ���������(read��ָ��Ч��)
		System.out.println(x);
		char c = (char)x;     //���Ҫ�ִ�����ת��,ת��Ϊ���ַ�����
		System.out.println(c);
		fr.close();
	}

}
