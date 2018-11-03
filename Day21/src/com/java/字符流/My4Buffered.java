package com.java.�ַ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class My4Buffered {
	
	/*
	 * BufferedReader��readLine()�������Զ�ȡһ���ַ�(���������з���)
	 * BufferedWriter��newLine()�������һ����ƽ̨�Ļ��з���"\r\n"
	 */
	public static void main(String[] args) throws IOException {
		//һ��һ�еĶ�ȡ();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		String line;                                        //����һ���ַ���,br.readLine()ÿ�ζ����Զ�ȡһ�е�����
		while((line = br.readLine()) != null) { 
			bw.write(line);
			bw.newLine();           //д���س����з�
			//bw.write("\r\n");     //д���س�����
		}
		
		br.close();
		bw.close();
	}

	private static void һ��һ�еĶ�ȡ() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		String line;                                        //����һ���ַ���,br.readLine()ÿ�ζ����Զ�ȡһ�е�����
		while((line = br.readLine()) != null) { 
			System.out.println(line);
		}
		
		br.close();
		bw.close();
	}

}
