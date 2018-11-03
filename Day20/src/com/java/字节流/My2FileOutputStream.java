package com.java.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My2FileOutputStream {

	/**
	 * 写文件
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("yyy.txt",false);  //可以之前不存在yyy.txt文件.但路径必须存在(自动创建文件)
//		fos.write(97);                                         //当后面false时 不是追加,当后面true时 为在原有内容上追加
//		fos.write(98);
//		fos.write(99);
		fos.write(103);
		fos.close();                                            //输入和输出在结束时都要关闭

	}

}
