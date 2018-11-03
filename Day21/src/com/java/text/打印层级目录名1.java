package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 打印层级目录名1 {

	/**
 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File dir = getDir();
		printJavaDir(dir);
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件路径:");
		while(true) {
			String line = sc.nextLine();				//将键盘录入的文件路径存储在line中
			File file = new File(line);					//封装成File对象
			if (!file.exists()) {
				System.out.println("你输入的路径不存在");
			} else if (file.isFile()) {
				System.out.println("你输入的是文件路径");
			} else {
				return file;
			}
		}	
	}
	
	public static void printJavaDir(File dir)  {
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile() && subFile.getName().endsWith(".avi")) {
				System.out.println(subFile);				
			} else if (subFile.isDirectory()) {
				printJavaDir(subFile);
			}
		}
	}	}
	
	