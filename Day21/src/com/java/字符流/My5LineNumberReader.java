package com.java.�ַ���;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class My5LineNumberReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		
		String line;
		lnr.setLineNumber(100);                   //��������  ��  ��ȡ����
		while((line = lnr.readLine()) != null) {
			System.out.println( lnr.getLineNumber()+ " " +line);
		}
		
		lnr.close();
	}

}
