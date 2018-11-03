package com.java.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.java.bean.Person;

public class MyTreeSet {

	/**
	 * @treeset��������
	 * 1.���Ա�֤Ԫ�ص�Ψһ
	 * 2.��������������,���ö���compare to����
	 * 
	 * ���洢������������Ԫ��ʱ,�ö�����뼯��comparable�ӿ�  ����д���� compare to�� ����
	 *  compare to�� ��������Ϊ0��ʱ��,���ϴ洢1 ��Ԫ��
	 *  Ϊ������ʱ�򼯺ϰ����˳��洢,Ϊ������ʱ�򼯺ϰ����˳��ķ�˳��洢.
	 *  
	 */
	public static void main(String[] args) {
		/*TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(8);	
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(4);
		ts.add(2);		
		System.out.println(ts);*/
		
		/*TreeSet<Person> ts = new TreeSet<>(new CompareByLength());   /
	//	ts.comparator(Person.age);
		ts.add(new Person("����", 24));
		ts.add(new Person("����", 23));		
		ts.add(new Person("����", 25));
		ts.add(new Person("����", 23));
		ts.add(new Person("����", 26));
		ts.add(new Person("����", 23));*/
		
		TreeSet<String> ts = new TreeSet<>(new CompareByLength());   //���ñȽ���,ʵ�ְ����ַ�������������(�бȽ���,����ʹ�ñȽ���)
		ts.add("abdjs");
		ts.add("ajs");
		ts.add("ajd");
		ts.add("abddjs");
		ts.add("abjs");
		System.out.println(ts);
		/*for (Person per : ts) {
			System.out.println(per);
		}*/		
	}

}
class CompareByLength implements Comparator<String> {     //�Ƚ��������ʹ��,,���½�treeset����ʱ���е���,����ʱ��Ĭ��ʹ�ñȽ����ıȽϷ���

	@Override
	public int compare(String s, String o) {
		int num =s.length() - o.length(); 
		return num ==0?s.compareTo(o):num ;
	}
	
}