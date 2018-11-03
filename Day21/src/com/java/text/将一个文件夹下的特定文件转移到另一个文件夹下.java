package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 将一个文件夹下的特定文件转移到另一个文件夹下 {

	/**
 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File getdir = getDir();
		File putdir = putDir();		
		copyfile(getKeyword(), getdir , putdir);
		
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入输出文件夹路径:");
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
	
	public static File putDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入输入文件夹路径:");
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
	
	public static String getKeyword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入输入文件包含的关键字");
		String line = sc.nextLine();				//将键盘录入的文件路径存储在line中
		return line;
	}
	
	public static void copyfile( String line , File dir , File dir2) throws IOException {
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile() && subFile.getName().contains(line)) {
				
				fuzhi(dir2, subFile);								
				System.out.println(subFile);
				//subFile.delete();
			} else if (subFile.isDirectory()) {
				copyfile(line , subFile ,  dir2 );
			}
		}
	}

	private static void fuzhi(File dir2, File subFile)
			throws FileNotFoundException, IOException {
		//进行复制C:\Users\Super PC\Desktop\笔记
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
		String path = dir2.getPath().concat("\\").concat(subFile.getName( ));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}	
	
}
