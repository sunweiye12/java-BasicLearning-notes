package com.java.������;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Person;

public class My���� {

	/**
* A:���͸���
* B:���ͺô�
	* ��߰�ȫ��(�������ڵĴ���ת����������) 
	* ʡȥǿת���鷳
* C:���ͻ���ʹ��
	* <>�зŵı����������������� 
* D:����ʹ��ע������
	* ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���)
	* --------------------------------------------------------------------
 A:����ͨ���<?>														ʹ��˵��
	* �������ͣ����û����ȷ����ô����Object�Լ������Java����
* B:? extends E
	* �����޶���E��������
* C:? super E
	* �����޶���E���丸��



	 */ 
	public static void main(String[] args) {
		//���͸���();
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		
		System.out.println(list);                 //��ӡ�˼���
		
		Iterator<String> it = list.iterator();    //�����˼���	
		while(it.hasNext()) {                   
			System.out.println(it.next());
		}
		

	}

	private static void ���͸���() {
		ArrayList<Person> list = new ArrayList<Person>();
	//	ArrayList<Person> list1 = new ArrayList<>();    //  ������Բ���   1.7�汾����

		list.add(new Person("����", 23));
		list.add(new Person("����", 24));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();              //ʹ�÷��;Ͳ���ǿת��
			System.out.println(p.getAge());			
		}
	}

}
