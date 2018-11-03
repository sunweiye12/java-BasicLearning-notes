package com.java.×Ö·ûÁ÷;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class My3¿½±´ {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//µ¥¸ö×Ö·û¿½±´();
		//×Ö·ûÊý×é¿½±´();
		//×Ö·û»º³åÇø¿½±´();
	}

	private static void ×Ö·û»º³åÇø¿½±´() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		int b;
		while((b = br.read()) != -1) {
			bw.write(b);
		}
		
		br.close();
		bw.close();
	}

	private static void ×Ö·ûÊý×é¿½±´() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		
		char[] arr = new char[1024];
		int len;
		while ((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		fw.close();
		fr.close();
	}

	private static void µ¥¸ö×Ö·û¿½±´() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		
		int b;
		while((b = fr.read()) != -1) {
			fw.write((char)b);
		}
		
		fr.close();
		fw.close();
	}

}
