package com.java.其它流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class My5改变标准输入输出流 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		标准输入流();
		System.setIn(new FileInputStream("a.txt"));  //改变标准输入流,是原本的输入流关联文件a.txt,不在获取键盘                          InputStream是抽象类 因此创建它的子类 
		System.setOut(new PrintStream("b.txt"));	//改变标准输出流 ,不在输出到控制台,而是写到b.txt文件上
		
		InputStream is = System.in;    //获取标准输入流,默认指向键盘,改变后指向文件a.txt
		PrintStream ps = System.out;   //获取标准输出流,默认指向控制台,改变后指向文件b.txt
		
		int b;                         //将输入流中的数据复制到输出流中       
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		
		is.close();						//关流
		ps.close();

	}

	private static void 标准输入流() throws IOException {
		InputStream is = System.in;       	//获取标准输入流,获取键盘输入 的信息
		int i = is.read();                  //(只读取第一个字节)将输入流中的数据读取并赋值给i
		System.out.println(i);
		
		is.close();       //关流!!!!!(不关也可以当输入流关联文件时一定要关)
	}

}
