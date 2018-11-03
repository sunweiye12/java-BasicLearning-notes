package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class �����ļ� {

	/**
  �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = getFile();	
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
	
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ�·��:");
		while(true) {
			String line = sc.nextLine();				//������¼����ļ�·���洢��line��
			File file = new File(line);					//��װ��File����
			if (!file.exists()) {
				System.out.println("�������·��������");
			} else if (file.isDirectory()) {
				System.out.println("����������ļ���·��");
			} else {
				return file;
			}
		}	
	}
}
