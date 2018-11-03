package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 复制文件 {

	/**
  在控制台录入文件的路径,将文件拷贝到当前项目下
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = getFile();	
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
	
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件路径:");
		while(true) {
			String line = sc.nextLine();				//将键盘录入的文件路径存储在line中
			File file = new File(line);					//封装成File对象
			if (!file.exists()) {
				System.out.println("你输入的路径不存在");
			} else if (file.isDirectory()) {
				System.out.println("你输入的是文件夹路径");
			} else {
				return file;
			}
		}	
	}
}
