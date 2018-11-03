package com.java.File;

import java.io.File;
import java.io.FileInputStream;
/*
���췽��
	* File(String pathname)������һ��·���õ�File����
	* File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
	* File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 */
public class My1File���� {
	public static void main(String[] args) {
		//����1();
		//����2();
		����3();
	}

	private static void ����3() {
		File parent =new File("D:\\��Ӱ");
		String child = "[OPFansMaplesnow][One_Piece][826][MP4].mp4";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}	

	private static void ����2() {
		String parent = "D:\\��Ӱ";
		String child = "[OPFansMaplesnow][One_Piece][826][MP4].mp4";
		File file =new File(parent,child);
		System.out.println(file.exists());
	}

	private static void ����1() {
		File file = new File("D:\\��Ӱ\\[OPFansMaplesnow][One_Piece][826][MP4].mp4");  //�ļ��ĺ�׺ҲҪ����
		file.exists();                                    //�ļ����ڷ�����true �����ڷ�����false
		System.out.println(file.exists());
		
		File file1 = new File("xxx.txt");   //Ĭ�ϵ������·��,�����ļ����µ�·��
		System.out.println(file1.exists());
		
		File file2 = new File("yyy.txt");
		System.out.println(file2.exists());
	}

}
