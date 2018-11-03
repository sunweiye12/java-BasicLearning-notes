package com.java.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My6图片加密 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * 在写出是异或上一个数字实现加密,在解密是在异或上这个数字即可
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {		
		try(
				FileInputStream fis = new FileInputStream("323.png");   //会自动调用close方法
				FileOutputStream fos = new FileOutputStream("333.png");
			) {
				int b;
				while((b = fis.read()) != -1) {
					fos.write(b ^ 12);
				}
			}
		

	}

}
