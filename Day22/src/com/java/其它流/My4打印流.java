package com.java.其它流;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.java.bean.Person;

public class My4打印流 {

	/**
	 * @param args
	 * 该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//方法1();  //字节流
		//方法2();  //字符流

	}

	private static void 方法2() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("f.txt");  //获取标准输出字符流.将结果输出到f.txt文件
		
		pw.println(97);
		
		pw.write(97);
		
		pw.close();
	}

	private static void 方法1() {
		//System.out.println("aaa");
		PrintStream ps = System.out;   //获取标准输出流.将结果输出到控制台
		
		ps.write(97);       //查找码表 找到对应的a 并打印
		ps.println(97);     //将其转换成字符串打印
	
		Person p1 = new Person("张三", 23);
		ps.println(p1);     //默认调用toString
				
		ps.close();
	}

}
