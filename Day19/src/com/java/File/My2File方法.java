package com.java.File;

import java.io.File;
import java.io.IOException;

public class My2File方法 {

	/**
创建功能
    * public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
	* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
	* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
重命名和删除功能
	* public boolean renameTo(File dest):把文件重命名为指定的文件路径
	* public boolean delete():删除文件或者文件夹 (文件内部不可以包含内容)
判断功能
	* public boolean isDirectory():判断是否是目录(目录就是文件夹)
	* public boolean isFile():判断是否是文件
	* public boolean exists():判断是否存在
	* public boolean canRead():判断是否可读
	* public boolean canWrite():判断是否可写
	* public boolean isHidden():判断是否隐藏
获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取构造方法中的路径
	* public String getName():获取文件或文件夹的名称
	* public long length():获取文件内容的长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		创建();
		
		File file1 = new File("xxx.txt");
		File file2 = new File("zzz.txt");
		System.out.println(file1.renameTo(file2));   //修改文件名
		
//		File file3 = new File("zzz.txt");
//		File file4 = new File("D\\z.txt");
//		System.out.println(file2.renameTo(file4));   //剪切并修改文件名

	}

	private static void 创建() throws IOException {
		// 创建文件		
		File file = new File("yyy.txt");
//		file.createNewFile();                       //创建一个file(前面已经定义好)的文件!如果可以创建返回true
		System.out.println(file.createNewFile());
		
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());     //创建一个dir1(前面已经定义好)的文件夹!如果可以创建返回true
		
		File dir2 = new File("ccc\\ddd");
		System.out.println(dir2.mkdirs());   //创建一个多级的文件夹!如果可以创建返回true
	}

}
