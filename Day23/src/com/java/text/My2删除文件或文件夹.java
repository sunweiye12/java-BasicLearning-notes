package com.java.text;

import java.io.File;
import java.io.ObjectInputStream.GetField;

public class My2删除文件或文件夹 {

	/**
	 * @param args
	 * 从键盘接收一个文件夹路径,删除该文件夹
	 * 
	 * 获取一个文件夹路径(通过案例1中的getdir()方法获取)
	 * 
	 * 删除文件或文件夹
	 * 1.若是文件直接删除,若为文件夹另操作
	 * 2.获取文件夹的目录数组
	 * 3.遍历这个数组
	 * 4.若为文件则直接删除
	 * 5.若为文件夹则递归调用
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = My1统计文件夹大小.getDir();  //获取有效路径
		deleteDir(file);
		System.out.println("已删除!!");
	}
	
	//删除文件
	//返回值类型 viod
	//参数列表 File dir
	
	public static void deleteDir(File dir) {
//		1.若是文件直接删除,若为文件夹另操作
		if (dir.isFile()) {
			dir.delete();
		} else {
//			2.获取文件夹的目录数组
			File[] subFiles = dir.listFiles();
//			3.遍历这个数组
			for (File subFile : subFiles) {
				if (subFile.isFile()) {
//					4.若为文件则直接删除
					subFile.delete();
				} else {
//					5.若为文件夹则递归调用
					deleteDir(subFile);
				}
			}
			dir.delete();
		}
		
	}

}
