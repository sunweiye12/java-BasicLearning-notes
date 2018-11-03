package com.java.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class 反转文本行 {

	/*
	 * * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		
		ArrayList<String> list = new ArrayList<>();
		
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		for(int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		
		bw.close();
	}

}
