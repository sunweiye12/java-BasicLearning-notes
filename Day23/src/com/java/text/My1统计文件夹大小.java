package com.java.text;

import java.io.File;
import java.util.Scanner;

public class My1统计文件夹大小 {

	/**
	 * @param args
	 * 从键盘接收一个文件夹路径,统计该文件夹大小  !!!计算文件或文件夹的大小
	 * 
	 * 从键盘接受一个文件夹路径
	 * 1.创建键盘录入对象
	 * 2.定义一个无限循环
	 * 3.将键盘录入信息封装成File对象
	 * 4.判断file对象是否文件夹
	 * 5.返回file
	 * 
	 * 统计文件夹大小
	 * 1.定义一个求和变量
	 * 2.获取文件夹下所有的文件和文件夹(listfiles方法)
	 * 3.遍历数组
	 * 4.判断是否为文件,若是则计算大小并累加
	 * 5.若为文件夹则递归调用
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = getDir();
		if (file.isFile()) {
			System.out.println("文件大小为:" + getFileLength(file) + "字节");
		} else {
			System.out.println("文件夹大小为:" + getFileLength(file) + "字节");
		}
			
	}
	
	public static File getDir() {
//		1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件或文件夹路径:");
//		2.定义一个无限循环BBC.doc
		while(true) {
			String line = sc.nextLine();
//			3.将键盘录入信息封装成File对象
			File dir = new File(line);
//			4.判断file对象是否文件夹
			if (!dir.exists()) {
				System.out.println("您输入的地址不存在,请重新输入:");
			} else  {
//				5.返回file
				return dir;
			}
		} 
	}
	
	//统计文件夹大小
	//返回值类型 long
	//参数列表 File dir
	public static long getFileLength(File dir) {
//		1.定义一个求和变量
		long len = 0;
//		2.判断传入的是否为文件,若是直接输出大小
		if (dir.isFile()) {
			len = dir.length();
//		3.判断传入的是否为文件,若不是则递归
		} else {
//			获取文件夹下所有的文件和文件夹(listfiles方法)
			File[] subFiles = dir.listFiles();
//			遍历数组
			for (File subFile : subFiles) {
//				判断是否为文件,若是则计算大小并累加
				if (subFile.isFile()) {
					len = len + subFile.length();
				} else {
//				若为文件夹则递归调用
					len = len + getFileLength(subFile);
				}
			}
		}
		
		return len;
		
	}
	

}
