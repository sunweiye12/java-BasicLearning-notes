package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MyArrayList {

	/**
* ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	* ˼·�������¼��Ϸ�ʽ

			
 *  A:������ʾ
 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * ˼·�������¼��Ϸ�ʽ
 
A:������ʾ
	* ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
* B:ע������
	* ��дequals()������      remove��contains�����ײ㶼����equals���� ��ʱҪ��д��һ����
 */

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add("a");
//		list.add("a");
//		list.add("b");
//		list.add("b");
//		list.add("b");
//		list.add("c");
//		list.add("c");
//		list.add("c");
		list.add(new Person("����", 23));
		list.add(new Person("����", 23));
		
		System.out.println(list);
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	
	/*
	 * ȥ���ظ�
	 * 1,����ArrayList
	 * 2,�����б�ArrayList
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();			//����һ���¼���
		Iterator it = list.iterator();					//��ȡ������
		while(it.hasNext()) {							//�ж��ϼ������Ƿ���Ԫ��
//			String temp = (String)it.next();			//��ÿһ��Ԫ����ʱ��¼ס
			Object temp = it.next();			                       //��ÿһ��Ԫ����ʱ��¼ס
			if(!newList.contains(temp)) {				//����¼����в�������Ԫ��
				newList.add(temp);						//����Ԫ����ӵ��¼�����
			}
		}
		return newList;									//���¼��Ϸ���
	}
}
