package com.java.�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My6ͼƬ���� {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * ��д���������һ������ʵ�ּ���,�ڽ������������������ּ���
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {		
		try(
				FileInputStream fis = new FileInputStream("323.png");   //���Զ�����close����
				FileOutputStream fos = new FileOutputStream("333.png");
			) {
				int b;
				while((b = fis.read()) != -1) {
					fos.write(b ^ 12);
				}
			}
		

	}

}
