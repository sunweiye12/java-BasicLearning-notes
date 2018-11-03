package com.java.������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class My8Properties���� {

	/**
	 * @param args
	 * Properties��hashtable������˫�м���
	 *                * Properties ���ʾ��һ���־õ����Լ���
	 *                  Properties �ɱ��������л�����м��ء�
	 *                  �����б���ÿ���������Ӧֵ����һ���ַ���
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		����1();
		Properties pr = new Properties();
		pr.load(new FileInputStream("config.properties"));  //�������ļ��е�������
		
		System.out.println(pr);
		
		pr.setProperty("tel", "15226715663");   //���ڴ����޸������ļ�
		pr.store(new FileOutputStream("config.properties"), "�޸�����");   //���޸ĺ������д�������ļ���  �ڶ����Ƕ�����޸ĵ�����
		
		System.out.println(pr);
		
		
	}

	private static void ����1() {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
//		pr.put("abc", 123);
//		pr.put("k", 2);
		pr.setProperty("����", "����");
		pr.setProperty("tel", "123456789098");
		
	//	System.out.println(pr);     //��ӡ˫�м���
		//ͨ������Enumeration���б���
		Enumeration<String> en = (Enumeration<String>) pr.propertyNames();  //ǿ��ת��
		while(en.hasMoreElements()) {
			String key = en.nextElement();  //����ֵ����key 
			String value = pr.getProperty(key); //ͨ����ֵ���ֵ
			System.out.println(key + "=" + value);
		}
	}

}
