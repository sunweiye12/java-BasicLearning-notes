package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class My3拷贝文件或文件夹 {

	/**
	 * @param args
	 * 通过My1获取两个有效路径(第二个路径不可以为文件路径)
	 * 
	 * 拷贝文件的方法
	 * 1.将拷贝的文件在目标文件中创建
	 * 2.将源文件中的所有文件或文件夹放入数组中
	 * 3.遍历该数组
	 * 4.若为文件则通过io流来进行复制
	 * 5.若为文件夹则进行遍历
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File srt = My1统计文件夹大小.getDir();
		File dest = My1统计文件夹大小.getDir();
		if (srt.equals(dest)) {
			System.out.println("目标文件夹是员文件件的自文件夹");  //当两个地址相同时,会不不断循环生成,知道内存耗尽
			                                                     //有毒.可以用来制作毒文件,可以用.My2中删除来解毒
		} else {
			dirCopy(srt, dest);
		}
		System.out.println("复制完成!!");
	}
	
	//拷贝文件的方法
	//返回值类型 void
	//参数列表   File srt , File dest
	
	public static void dirCopy(File srt , File dest) throws IOException {
//		1.将拷贝的文件在目标文件中创建
		File newDir = new File(dest, srt.getName());
		newDir.mkdir();                             //创建该路径下的文件夹!!!!
//		2.将源文件中的所有文件或文件夹放入数组中
		File[] subFiles = srt.listFiles();
//		3.遍历该数组
		for (File subFile : subFiles) {
//			 4.若为文件则通过io流来进行复制
			if (subFile.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
				
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				
				bis.close();
				bos.close();
				
			} else {
				dirCopy(subFile, newDir);
			}
		}
	}

}
