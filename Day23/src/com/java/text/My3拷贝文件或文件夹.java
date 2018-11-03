package com.java.text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class My3�����ļ����ļ��� {

	/**
	 * @param args
	 * ͨ��My1��ȡ������Ч·��(�ڶ���·��������Ϊ�ļ�·��)
	 * 
	 * �����ļ��ķ���
	 * 1.���������ļ���Ŀ���ļ��д���
	 * 2.��Դ�ļ��е������ļ����ļ��з���������
	 * 3.����������
	 * 4.��Ϊ�ļ���ͨ��io�������и���
	 * 5.��Ϊ�ļ�������б���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File srt = My1ͳ���ļ��д�С.getDir();
		File dest = My1ͳ���ļ��д�С.getDir();
		if (srt.equals(dest)) {
			System.out.println("Ŀ���ļ�����Ա�ļ��������ļ���");  //��������ַ��ͬʱ,�᲻����ѭ������,֪���ڴ�ľ�
			                                                     //�ж�.���������������ļ�,������.My2��ɾ�����ⶾ
		} else {
			dirCopy(srt, dest);
		}
		System.out.println("�������!!");
	}
	
	//�����ļ��ķ���
	//����ֵ���� void
	//�����б�   File srt , File dest
	
	public static void dirCopy(File srt , File dest) throws IOException {
//		1.���������ļ���Ŀ���ļ��д���
		File newDir = new File(dest, srt.getName());
		newDir.mkdir();                             //������·���µ��ļ���!!!!
//		2.��Դ�ļ��е������ļ����ļ��з���������
		File[] subFiles = srt.listFiles();
//		3.����������
		for (File subFile : subFiles) {
//			 4.��Ϊ�ļ���ͨ��io�������и���
			if (subFile.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
				
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				
				bis.close();
				bos.close();
				
			} else {
				dirCopy(subFile, newDir);
			}
		}
	}

}
