package com.java.text;

import java.io.File;
import java.io.ObjectInputStream.GetField;

public class My2ɾ���ļ����ļ��� {

	/**
	 * @param args
	 * �Ӽ��̽���һ���ļ���·��,ɾ�����ļ���
	 * 
	 * ��ȡһ���ļ���·��(ͨ������1�е�getdir()������ȡ)
	 * 
	 * ɾ���ļ����ļ���
	 * 1.�����ļ�ֱ��ɾ��,��Ϊ�ļ��������
	 * 2.��ȡ�ļ��е�Ŀ¼����
	 * 3.�����������
	 * 4.��Ϊ�ļ���ֱ��ɾ��
	 * 5.��Ϊ�ļ�����ݹ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = My1ͳ���ļ��д�С.getDir();  //��ȡ��Ч·��
		deleteDir(file);
		System.out.println("��ɾ��!!");
	}
	
	//ɾ���ļ�
	//����ֵ���� viod
	//�����б� File dir
	
	public static void deleteDir(File dir) {
//		1.�����ļ�ֱ��ɾ��,��Ϊ�ļ��������
		if (dir.isFile()) {
			dir.delete();
		} else {
//			2.��ȡ�ļ��е�Ŀ¼����
			File[] subFiles = dir.listFiles();
//			3.�����������
			for (File subFile : subFiles) {
				if (subFile.isFile()) {
//					4.��Ϊ�ļ���ֱ��ɾ��
					subFile.delete();
				} else {
//					5.��Ϊ�ļ�����ݹ����
					deleteDir(subFile);
				}
			}
			dir.delete();
		}
		
	}

}
