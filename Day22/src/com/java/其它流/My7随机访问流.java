package com.java.������;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class My7��������� {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");   //�������������,�����ɶ���д,��ʽ������.()
        //raf.write(97);
        int i = raf.read();
        System.out.println(i);
        raf.seek(5);                      //����ָ��.�����ڶ��߳����� ,��ָ��λ�ö�ȡ��д���ַ�
        raf.write(99);
        raf.close();
	}

}
