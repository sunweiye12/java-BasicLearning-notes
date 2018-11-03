package com.java.text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 将文本复制到文件上 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");  //新建的文本
		System.out.println("请输入:");
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line))
				break;
			fos.write(line.getBytes());                      //写字符串时必须转换为字节数组
			fos.write("\r\n".getBytes());                    //换行
		}
		
		fos.close();

	}

}
