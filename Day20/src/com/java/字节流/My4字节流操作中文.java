package com.java.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My4字节流操作中文 {

	/**
	 * 
* 字节流读取中文的问题
	* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
* 字节流写出中文的问题
	* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
	* 写出回车换行 write("\r\n".getBytes());
	 * @throws IOException 

	 */
	public static void main(String[] args) throws IOException {
		//字节流读取中文();
		//字节流写出中文();

	}

	private static void 字节流写出中文() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		fos.write("我爱你,中华".getBytes());   //将字符串转化为字节数组
		fos.write("\r\n".getBytes());         //回车
		fos.write("我爱你,中国".getBytes());
		fos.close();
	}

	private static void 字节流读取中文() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[4];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));     //将字节数组转化为字符串
		}
		
		fis.close();
	}

}
