package com.java.�ַ���;

import java.io.FileWriter;
import java.io.IOException;

public class My2FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("��Һ�,������!");
		fw.write(97);
		fw.close();

	}

}
