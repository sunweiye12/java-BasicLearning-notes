package com.java.字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class My4Buffered {
	
	/*
	 * BufferedReader的readLine()方法可以读取一行字符(不包含换行符号)
	 * BufferedWriter的newLine()可以输出一个跨平台的换行符号"\r\n"
	 */
	public static void main(String[] args) throws IOException {
		//一行一行的读取();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		String line;                                        //定义一个字符串,br.readLine()每次都可以读取一行的数据
		while((line = br.readLine()) != null) { 
			bw.write(line);
			bw.newLine();           //写出回车换行符
			//bw.write("\r\n");     //写出回车换行
		}
		
		br.close();
		bw.close();
	}

	private static void 一行一行的读取() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		String line;                                        //定义一个字符串,br.readLine()每次都可以读取一行的数据
		while((line = br.readLine()) != null) { 
			System.out.println(line);
		}
		
		br.close();
		bw.close();
	}

}
