package com.java.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My5流异常处理 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//版本1_6处理IO异常();
		//版本1_7处理代码();
		
	}

	private static void 版本1_7处理代码() throws IOException, FileNotFoundException {
		try(
			FileInputStream fis = new FileInputStream("xxx.txt");   //会自动调用close方法
			FileOutputStream fos = new FileOutputStream("yyy.txt");
		) {
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}

	private static void 版本1_6处理IO异常() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		} 
		finally{//目的是无论如何都要关闭流对象
			try{
				if (fis != null) {                      //try finally嵌套的目的是为了尽量关闭多的流对象
					fis.close();                            
				}
			} finally {
				if (fos != null) {
					fos.close();
				}
			}	
		}
	}

}
