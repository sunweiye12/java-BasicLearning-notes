package com.java.�ֽ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My5���쳣���� {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//�汾1_6����IO�쳣();
		//�汾1_7�������();
		
	}

	private static void �汾1_7�������() throws IOException, FileNotFoundException {
		try(
			FileInputStream fis = new FileInputStream("xxx.txt");   //���Զ�����close����
			FileOutputStream fos = new FileOutputStream("yyy.txt");
		) {
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}

	private static void �汾1_6����IO�쳣() throws FileNotFoundException, IOException {
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
		finally{//Ŀ����������ζ�Ҫ�ر�������
			try{
				if (fis != null) {                      //try finallyǶ�׵�Ŀ����Ϊ�˾����رն��������
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
