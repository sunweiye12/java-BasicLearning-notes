package com.java.text;

import java.io.File;
import java.io.FilenameFilter;

public class ���ָ��Ŀ¼��ָ����׺���ļ��� {

	/**
������ʾ
	* �����ж�D��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\");
		
//		String[] arr = dir.list();
//		for (String string : arr) {
//			if (string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
//		File[] subfile = dir.listFiles();             //ͨ���õķ���
//		for (File subFile : subfile) {
//			if (subFile.isFile() && subFile.getName().endsWith(".jpg")) {
//				System.out.println(subFile.getName());
//			}
//		}
		
		String[] arr = dir.list(new FilenameFilter() {      //�ļ���������
			
			@Override
			public boolean accept(File dir, String name) {   //�������������ļ����洢������������
				// TODO Auto-generated method stub
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {                     //�������������
			System.out.println(string);
		}
	}

}
