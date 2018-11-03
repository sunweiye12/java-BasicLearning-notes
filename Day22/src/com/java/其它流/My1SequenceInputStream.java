package com.java.其它流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class My1SequenceInputStream {

	/**
	 * @param args
	 * SequenceInputStream(InputStream s1, InputStream s2)    序列流
	 *  他的作用是将两个字节流,添加到一个容器里面,一起进行操作
	 * @throws IOException 
	 * SequenceInputStream(Enumeration<? extends InputStream> e) 
	 *  整合多个字节流
	 */
	public static void main(String[] args) throws IOException {
		//方法1();
        //方法2();    //整合两个输入流
		多个流之间的整合();

	}

	private static void 多个流之间的整合() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");   
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();   	//创建集合对象
		v.add(fis1);									//将字符流放入集合中
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e); //将三个流整合到一起
		
		FileOutputStream fos = new FileOutputStream("d.txt");
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}

	private static void 方法2() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");   
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();   //切记!!一定要关流
		fos.close();
	}

	private static void 方法1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");   //创建输入流 关联文件a.txt   //记得关流
		FileOutputStream fos = new FileOutputStream("c.txt");  //创建输出流 换件文件c.txt
		
		int x;
		while((x = fis1.read()) != -1) {
			fos.write(x); 
		}
		fis1.close();                                			//将a.txt的文件内容复制到c.txt上,并且IO流早开早关释放资源
		
		FileInputStream fis2 = new FileInputStream("b.txt");
		int y;
		while((y = fis2.read()) != -1) {
			fos.write(y);
		}
		
		fis2.close();
		fos.close();
	}

}
