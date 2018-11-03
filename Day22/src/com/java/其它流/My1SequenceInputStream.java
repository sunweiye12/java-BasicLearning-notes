package com.java.������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class My1SequenceInputStream {

	/**
	 * @param args
	 * SequenceInputStream(InputStream s1, InputStream s2)    ������
	 *  ���������ǽ������ֽ���,��ӵ�һ����������,һ����в���
	 * @throws IOException 
	 * SequenceInputStream(Enumeration<? extends InputStream> e) 
	 *  ���϶���ֽ���
	 */
	public static void main(String[] args) throws IOException {
		//����1();
        //����2();    //��������������
		�����֮�������();

	}

	private static void �����֮�������() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");   
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();   	//�������϶���
		v.add(fis1);									//���ַ������뼯����
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e); //�����������ϵ�һ��
		
		FileOutputStream fos = new FileOutputStream("d.txt");
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}

	private static void ����2() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");   
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();   //�м�!!һ��Ҫ����
		fos.close();
	}

	private static void ����1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");   //���������� �����ļ�a.txt   //�ǵù���
		FileOutputStream fos = new FileOutputStream("c.txt");  //��������� �����ļ�c.txt
		
		int x;
		while((x = fis1.read()) != -1) {
			fos.write(x); 
		}
		fis1.close();                                			//��a.txt���ļ����ݸ��Ƶ�c.txt��,����IO���翪����ͷ���Դ
		
		FileInputStream fis2 = new FileInputStream("b.txt");
		int y;
		while((y = fis2.read()) != -1) {
			fos.write(y);
		}
		
		fis2.close();
		fos.close();
	}

}
