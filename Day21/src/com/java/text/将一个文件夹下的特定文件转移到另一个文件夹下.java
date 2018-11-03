package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ��һ���ļ����µ��ض��ļ�ת�Ƶ���һ���ļ����� {

	/**
 ����:�Ӽ����������һ���ļ���·��,��ӡ�����ļ��������е�.java�ļ���
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File getdir = getDir();
		File putdir = putDir();		
		copyfile(getKeyword(), getdir , putdir);
		
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ļ���·��:");
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
	
	public static File putDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ļ���·��:");
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
	
	public static String getKeyword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ļ������Ĺؼ���");
		String line = sc.nextLine();				//������¼����ļ�·���洢��line��
		return line;
	}
	
	public static void copyfile( String line , File dir , File dir2) throws IOException {
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile() && subFile.getName().contains(line)) {
				
				fuzhi(dir2, subFile);								
				System.out.println(subFile);
				//subFile.delete();
			} else if (subFile.isDirectory()) {
				copyfile(line , subFile ,  dir2 );
			}
		}
	}

	private static void fuzhi(File dir2, File subFile)
			throws FileNotFoundException, IOException {
		//���и���C:\Users\Super PC\Desktop\�ʼ�
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
		String path = dir2.getPath().concat("\\").concat(subFile.getName( ));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}	
	
}
