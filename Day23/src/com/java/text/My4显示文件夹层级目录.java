package com.java.text;

import java.io.File;

public class My4��ʾ�ļ��в㼶Ŀ¼ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = My1ͳ���ļ��д�С.getDir();
		printLve(dir,0);

	}

	public static void printLve(File dir, int lev) {
		// TODO Auto-generated method stub
		File[] sunFiles = dir.listFiles();
		for (File subFile : sunFiles) {
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");
			}
			
			System.out.println(subFile.getName());
			if (subFile.isDirectory()) {
				printLve(subFile, lev + 1 );
			}
		}
		
	}

}
