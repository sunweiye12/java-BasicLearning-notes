package com.java.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class My1FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//初级版();
		升级版_连续读出();
	}

	private static void 升级版_连续读出() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int c;
		while((c = fr.read()) != -1) {
			char x = (char)c;     //因此要字词向下转型,转换为你字符类型
			System.out.print(x);
		}
		fr.close();
	}

	private static void 初级版() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int x = fr.read();    //读取的是一个字符 当赋值给int时 自动类型提升(read有指针效果)
		System.out.println(x);
		char c = (char)x;     //因此要字词向下转型,转换为你字符类型
		System.out.println(c);
		fr.close();
	}

}
