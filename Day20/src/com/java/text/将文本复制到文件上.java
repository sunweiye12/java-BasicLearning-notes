package com.java.text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ���ı����Ƶ��ļ��� {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");  //�½����ı�
		System.out.println("������:");
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line))
				break;
			fos.write(line.getBytes());                      //д�ַ���ʱ����ת��Ϊ�ֽ�����
			fos.write("\r\n".getBytes());                    //����
		}
		
		fos.close();

	}

}
