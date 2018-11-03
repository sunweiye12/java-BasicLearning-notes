package com.java.text;

import java.io.File;
import java.io.FilenameFilter;

public class 输出指定目录下指定后缀的文件名 {

	/**
案例演示
	* 需求：判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\");
		
//		String[] arr = dir.list();
//		for (String string : arr) {
//			if (string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
//		File[] subfile = dir.listFiles();             //通常用的方法
//		for (File subFile : subfile) {
//			if (subFile.isFile() && subFile.getName().endsWith(".jpg")) {
//				System.out.println(subFile.getName());
//			}
//		}
		
		String[] arr = dir.list(new FilenameFilter() {      //文件名过滤器
			
			@Override
			public boolean accept(File dir, String name) {   //将符合条件的文件名存储到上面数组里
				// TODO Auto-generated method stub
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {                     //遍历上面的数组
			System.out.println(string);
		}
	}

}
