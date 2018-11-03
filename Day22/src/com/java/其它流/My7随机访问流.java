package com.java.其它流;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class My7随机访问流 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");   //创建随机访问流,此流可读可写,格式可设置.()
        //raf.write(97);
        int i = raf.read();
        System.out.println(i);
        raf.seek(5);                      //设置指针.可用于多线程下载 ,在指定位置读取和写入字符
        raf.write(99);
        raf.close();
	}

}
