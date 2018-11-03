package com.java.其它流;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class My2内存输出流 {

	/**
	 * @param args
	 * 
	 * 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); //在内存中创建了一个可以增长的内存数组   //不需要关流
		//调用toString方法直接返回的是传入缓冲区的字符串
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);
		}
		
//		byte[] arr = baos.toByteArray();                   //将缓冲内存中的数据存放到arr数组中
//		System.out.println(new String(arr));
		
//		System.out.println(baos.toString());
		System.out.println(baos);
		
		fis.close();                      //关流
		

	}

}
