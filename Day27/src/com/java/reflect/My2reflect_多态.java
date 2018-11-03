package com.java.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class My2reflect_��̬ {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, Exception {

		Juicer j = new Juicer();
		j.run(new Apple());   //��������ָ���������
		j.run(new Orange());
		
		System.out.println("----------------------------");
		
		//�������ļ���ʵ�ִ�����
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));	//BufferedReader���Զ�һ��
		Class clazz = Class.forName(br.readLine());  //����ͨ��ֱ�Ӹ������ļ���ʵ�ֳ�����
		Fruit f = (Fruit) clazz.newInstance();
		Juicer ju = new Juicer();
		ju.run(f);

	}
}


//��̬
//1.��һ���߲�Ľӿ�(���а���һ������������д)
//2.�м�����ļ̳�,����д����
//3.��������ָ���������
//
interface Fruit {			//��һ���߲�Ľӿ�(���а���һ������������д)
	public void squeeze();
}

class Apple implements Fruit{			//�м�����ļ̳�,����д����
	public void squeeze() {
		System.out.println("ե��һ��ƻ��֭��");
	}
}

class Orange implements Fruit{			//�м�����ļ̳�,����д����
	public void squeeze() {
		System.out.println("ե��һ������֭��");
	}
}

class Juicer {
	public void run(Fruit a) {		//��������ָ���������
		a.squeeze();
	}
}