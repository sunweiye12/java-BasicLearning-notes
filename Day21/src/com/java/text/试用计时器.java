package com.java.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ���ü�ʱ�� {

	/**
	 * @param args
	 * @throws IOException 
	 * ��������10��
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("num.txt"));
		
		String line = br.readLine();
		int times = Integer.parseInt(line);
		
		if(times >0) {
			System.out.println("����ʹ�ô�������" + times-- + "��");
			FileWriter fw = new FileWriter("num.txt");
			fw.write(times + "");
			fw.close();
			
		} else {
			System.out.println("�������ô����ѵ�,�빺������");
		}
		br.close();
	}

}
