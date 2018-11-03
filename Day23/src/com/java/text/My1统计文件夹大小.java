package com.java.text;

import java.io.File;
import java.util.Scanner;

public class My1ͳ���ļ��д�С {

	/**
	 * @param args
	 * �Ӽ��̽���һ���ļ���·��,ͳ�Ƹ��ļ��д�С  !!!�����ļ����ļ��еĴ�С
	 * 
	 * �Ӽ��̽���һ���ļ���·��
	 * 1.��������¼�����
	 * 2.����һ������ѭ��
	 * 3.������¼����Ϣ��װ��File����
	 * 4.�ж�file�����Ƿ��ļ���
	 * 5.����file
	 * 
	 * ͳ���ļ��д�С
	 * 1.����һ����ͱ���
	 * 2.��ȡ�ļ��������е��ļ����ļ���(listfiles����)
	 * 3.��������
	 * 4.�ж��Ƿ�Ϊ�ļ�,����������С���ۼ�
	 * 5.��Ϊ�ļ�����ݹ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = getDir();
		if (file.isFile()) {
			System.out.println("�ļ���СΪ:" + getFileLength(file) + "�ֽ�");
		} else {
			System.out.println("�ļ��д�СΪ:" + getFileLength(file) + "�ֽ�");
		}
			
	}
	
	public static File getDir() {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ����ļ���·��:");
//		2.����һ������ѭ��BBC.doc
		while(true) {
			String line = sc.nextLine();
//			3.������¼����Ϣ��װ��File����
			File dir = new File(line);
//			4.�ж�file�����Ƿ��ļ���
			if (!dir.exists()) {
				System.out.println("������ĵ�ַ������,����������:");
			} else  {
//				5.����file
				return dir;
			}
		} 
	}
	
	//ͳ���ļ��д�С
	//����ֵ���� long
	//�����б� File dir
	public static long getFileLength(File dir) {
//		1.����һ����ͱ���
		long len = 0;
//		2.�жϴ�����Ƿ�Ϊ�ļ�,����ֱ�������С
		if (dir.isFile()) {
			len = dir.length();
//		3.�жϴ�����Ƿ�Ϊ�ļ�,��������ݹ�
		} else {
//			��ȡ�ļ��������е��ļ����ļ���(listfiles����)
			File[] subFiles = dir.listFiles();
//			��������
			for (File subFile : subFiles) {
//				�ж��Ƿ�Ϊ�ļ�,����������С���ۼ�
				if (subFile.isFile()) {
					len = len + subFile.length();
				} else {
//				��Ϊ�ļ�����ݹ����
					len = len + getFileLength(subFile);
				}
			}
		}
		
		return len;
		
	}
	

}
