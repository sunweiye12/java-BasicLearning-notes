package com.java.������;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.java.bean.Person;

public class My4��ӡ�� {

	/**
	 * @param args
	 * �������Ժܷ���Ľ������toString()������, �����Զ����ϻ���, ���ҿ���ʹ���Զ�ˢ����ģʽ
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����1();  //�ֽ���
		//����2();  //�ַ���

	}

	private static void ����2() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("f.txt");  //��ȡ��׼����ַ���.����������f.txt�ļ�
		
		pw.println(97);
		
		pw.write(97);
		
		pw.close();
	}

	private static void ����1() {
		//System.out.println("aaa");
		PrintStream ps = System.out;   //��ȡ��׼�����.��������������̨
		
		ps.write(97);       //������� �ҵ���Ӧ��a ����ӡ
		ps.println(97);     //����ת�����ַ�����ӡ
	
		Person p1 = new Person("����", 23);
		ps.println(p1);     //Ĭ�ϵ���toString
				
		ps.close();
	}

}
