package com.java.�ַ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class My6io��ת�� {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 * ��utf-8������ļ����Ƶ� gbk������ļ���
	 */
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
		
		int b;
		while((b = isr.read()) != -1) {
			osw.write(b);
		}
		isr.close();
		osw.close();

	}

}
