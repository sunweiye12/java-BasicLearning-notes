package com.java.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class My1FileInputStream {

	/**
	 * 读文件
	 * @param args
	 * @throws IOException 
	 *  read()方法读取的是一个字节,为什么返回是int(代表4个字节),而不是byte:(字节)(一个字节为8位)
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//读取数据();                
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x;
		while ((x = fis.read()) != -1) {  //当读取到-1时代表文本结束
			System.out.println(x);			//输出所有字节的阿斯科马表
		}
		
	}

	private static void 读取数据() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");  //创建文件输入流时将一个地址赋给它(xxx.txt必须存在)
		int x = fis.read();                                    //从硬盘上读取一个字节,有指针效应///此处要抛出错误,因为有可能文件不可读
		int y = fis.read();									   //以-1结束	
		System.out.println(x);
		System.out.println(y);
		fis.close();                                        //在执行完操作后要将输入流关闭,释放资源
	}

}
