package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ����תΪ���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c = new ArrayList<Object>();  //��������ָ���������		
		c.add("e");
		c.add("ahah��");			
		c.add("e");
		c.add("d");
		
		Object[] arr = c.toArray();             //������ת����һ��object���͵�����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
