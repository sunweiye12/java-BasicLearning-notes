package com.java.字节流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My3拷贝文件 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//单个字节拷贝();
		//字节数组拷贝();   不推荐 用可能导致内存溢出
		//小数组拷贝();     推荐
		//缓冲区拷贝法();
		
		
	}

	private static void 缓冲区拷贝法() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//创建输入流对象,关联123.png文件
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//创建输出流对象,关联copy.png文件
		BufferedInputStream bis = new BufferedInputStream(fis);     //创建缓冲区输入流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);	//创建缓冲区输出流对象
		int a;
		while ((a = bis.read()) != -1) {     	//读取输入流中的字节,直到结束
			bos.write(a);						//在输出流中写字节
		}
		bis.close();							//关闭输入和输出流,释放资源
		bos.close();
	}

	private static void 小数组拷贝() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//创建输入流对象,关联123.png文件
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//创建输出流对象,关联copy.png文件
		byte[] arr = new byte[1024 * 8];                                 //定义一个长度为2 的字节数组作为容器
		int len;                                                  //定义每次数组中的有效字符个数
		while((len = fis.read(arr)) != -1) {                      //利用字符数组读取输入流中的数据,获取每次的有效个数,直到结束
			fos.write(arr, 0, len);                               //在输出流写入字符数组中的有效字符
		} 
		fis.close();
		fos.close();
	}

	private static void 字节数组拷贝() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//创建输入流对象,关联123.png文件
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//创建输出流对象,关联copy.png文件
//		int len = fis.available();     //拿到所读取的文件的字节数
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];       //创建一个字节数组
		fis.read(arr);                                //通过数组实现一次性转移文件内容
		fos.write(arr);
		
		fis.close();
		fos.close();
	}

	private static void 单个字节拷贝() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("123.png");    	//创建输入流对象,关联123.png文件
		FileOutputStream fos = new FileOutputStream("copy.png"); 	//创建输出流对象,关联copy.png文件
		
		int a;
		while ((a = fis.read()) != -1) {     	//读取输入流中的字节,直到结束
			fos.write(a);						//在输出流中写字节
		}
		fis.close();							//关闭输入和输出流,释放资源
		fos.close();
	}

}
