package com.java.字符流;

import java.io.FileWriter;
import java.io.IOException;

public class My2FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("大家好,哈哈哈!");
		fw.write(97);
		fw.close();

	}

}
