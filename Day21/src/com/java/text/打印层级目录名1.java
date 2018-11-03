package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ��ӡ�㼶Ŀ¼��1 {

	/**
 ����:�Ӽ����������һ���ļ���·��,��ӡ�����ļ��������е�.java�ļ���
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File dir = getDir();
		printJavaDir(dir);
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ�·��:");
		while(true) {
			String line = sc.nextLine();				//������¼����ļ�·���洢��line��
			File file = new File(line);					//��װ��File����
			if (!file.exists()) {
				System.out.println("�������·��������");
			} else if (file.isFile()) {
				System.out.println("����������ļ�·��");
			} else {
				return file;
			}
		}	
	}
	
	public static void printJavaDir(File dir)  {
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile() && subFile.getName().endsWith(".avi")) {
				System.out.println(subFile);				
			} else if (subFile.isDirectory()) {
				printJavaDir(subFile);
			}
		}
	}	}
	
	