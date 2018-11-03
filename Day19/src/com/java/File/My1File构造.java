package com.java.File;

import java.io.File;
import java.io.FileInputStream;
/*
构造方法
	* File(String pathname)：根据一个路径得到File对象
	* File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
	* File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class My1File构造 {
	public static void main(String[] args) {
		//构造1();
		//构造2();
		构造3();
	}

	private static void 构造3() {
		File parent =new File("D:\\电影");
		String child = "[OPFansMaplesnow][One_Piece][826][MP4].mp4";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}	

	private static void 构造2() {
		String parent = "D:\\电影";
		String child = "[OPFansMaplesnow][One_Piece][826][MP4].mp4";
		File file =new File(parent,child);
		System.out.println(file.exists());
	}

	private static void 构造1() {
		File file = new File("D:\\电影\\[OPFansMaplesnow][One_Piece][826][MP4].mp4");  //文件的后缀也要加上
		file.exists();                                    //文件存在返回是true 不存在返回是false
		System.out.println(file.exists());
		
		File file1 = new File("xxx.txt");   //默认的是相对路径,即该文件夹下的路径
		System.out.println(file1.exists());
		
		File file2 = new File("yyy.txt");
		System.out.println(file2.exists());
	}

}
