package com.java.collection;

import java.util.ArrayList;
import java.util.List;



public class MyList {

	/**
* void add(int index,E element)     //��ָ��λ�����Ԫ��
	* E remove(int index)			//��ָ��λ��ɾ��Ԫ��(����ɾ����Ԫ��)  (ɾ����ʱ�򲻿����Զ�װ��)
	* E get(int index)				//�õ�ָ��λ��Ԫ��
	* E set(int index,E element)    //�޸�ָ��λ�õ�Ԫ��
	* 
���Ͽ��(ListIterator)(�˽�)
* boolean hasNext()�Ƿ�����һ��
* boolean hasPrevious()�Ƿ���ǰһ��
* Object next()������һ��Ԫ��
* Object previous();������һ��Ԫ��
	 */
	public static void main(String[] args) {
		List li = new ArrayList();     //�ӿڲ���ֱ�Ӵ���  ���������������
		
		li.add("e");
		li.add("a");
		li.add("d");
		li.add("f");
		li.add("g");
		
		li.add(2, "gg");
		System.out.println(li);
		
		

	}

}
