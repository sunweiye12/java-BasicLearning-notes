package com.java.text;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 打印 {

	/**
	 * @param args
	 * 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  //创建内存缓存区
		
		int len = 5;                              //以小数组的方式进行数据转移
		Byte[] arr = new Byte[len];
		while((len = fis.read()) != -1) {
			baos.write(len);
		}
		
		fis.close();
		System.out.println(baos);
		

	}

}
