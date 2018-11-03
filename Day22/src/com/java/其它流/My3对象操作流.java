package com.java.������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.java.bean.Person;

public class My3��������� {

	/**
	 * @param args
	 *  �������Խ�һ������д��, ���߶�ȡһ�����󵽳�����. Ҳ����ִ�������л��ͷ����л��Ĳ���.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//���������ݴ洢();
		//������������ȡ����();
		Person p1 = new Person("����", 23);    //�����д˶���������л� �˶���ͱ��� ʵ��Serializable�ӿ�
		Person p2 = new Person("����", 24);
		Person p3 = new Person("����", 25);
		Person p4 = new Person("����", 26);
		
		ArrayList<Person> arr = new ArrayList<>();   //��ÿ�������ض��浽������,Ȼ�����������ϴ��,�����ȡ��ʱ��Ҳ�ü��Ͻ��ܾ�����
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(arr);
		oos.close();
		//------------------------------------------------------------------------------
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));  //��e.txt�ļ��н������ȡ����
		ArrayList<Person> arr1 = new ArrayList<>();
		arr1 = (ArrayList<Person>) ois.readObject();
		ois.close();
		for (Person person : arr1) {
			System.out.println(person);
		}
	}

	
	
	private static void ������������ȡ����() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));  //��e.txt�ļ��н������ȡ����
		Person p1 = (Person) ois.readObject();                              //�˴��漰��ǿ��ת��
		Person p2 = (Person) ois.readObject();
		
		ois.close();														//����
		System.out.println(p1);
		System.out.println(p2);
	}

	private static void ���������ݴ洢() throws IOException, FileNotFoundException {
		Person p1 = new Person("����", 23);    //�����д˶���������л� �˶���ͱ��� ʵ��Serializable�ӿ�
		Person p2 = new Person("����", 24);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));  //������洢��e.txt�ļ��� //���洢��������.��Ϊû�б�Ҫ�ܿ���,ֻҪ����˳������������
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
	}

}
