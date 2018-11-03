package com.java.set;

import java.util.HashSet;

import com.java.bean.Person;

public class MyHashSet {

	/**
	 * Set����:������,�޿����ظ�,��ȡ����
* 1.HashSetԭ��
	* ����ʹ��Set���϶�����Ҫȥ���ظ�Ԫ�ص�, ����ڴ洢��ʱ�����equals()�Ƚ�, Ч�ʽϵ�,��ϣ�㷨�����ȥ�ظ���Ч��, ������ʹ��equals()�����Ĵ���
	* ��HashSet����add()�����洢�����ʱ��, �ȵ��ö����hashCode()�����õ�һ����ϣֵ, Ȼ���ڼ����в����Ƿ��й�ϣֵ��ͬ�Ķ���
		* ���û�й�ϣֵ��ͬ�Ķ����ֱ�Ӵ��뼯��
		* ����й�ϣֵ��ͬ�Ķ���, �ͺ͹�ϣֵ��ͬ�Ķ����������equals()�Ƚ�,�ȽϽ��Ϊfalse�ʹ���, true�򲻴�
* 2.���Զ�����Ķ������HashSetȥ�ظ�
	* ���б�����дhashCode()��equals()����
	* hashCode(): ������ͬ�Ķ��󷵻�ֵ������ͬ, ���Բ�ͬ�ķ���ֵ������ͬ(���Ч��)
	* equals(): ������ͬ����true, ���Բ�ͬ����false,����false��ʱ��洢
	 */
	public static void main(String[] args) {
		//�洢StringԪ��();	
		//�洢���ö���();
		
		
		
		
		
	}

	private static void �洢���ö���() {
		HashSet< Person> hs = new HashSet<>(); 
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 25));
		hs.add(new Person("����", 26));
		hs.add(new Person("����", 23));                //���������������� ֻ����д��equals���� �ſ�����Ϊ��ͬ���ԵĶ���Ϊͬһ����
													   //�˴�����Ҫ��дequals���� ��Ҫ��дhashcode����
		/*��hashset������� ָ������ʱ �����ʱ�ͻ����hashcode���������ص�hashcodeֵ��ͬʱ���������equals����    */
		System.out.println(hs);			//��ӡ����
		
		for (Person per : hs) {			//��������
			System.out.println(per);
		}
	}

	private static void �洢StringԪ��() {
		HashSet< String> hs = new HashSet<>();            //����һ��hashset���϶���     
		hs.add("a");										//set���Ϻ�list���ϵ������������set���Ͽ��Ա�֤Ԫ�ص�Ψһ��
		boolean b1 = hs.add("a");										//��˲��������ͬԪ��
		hs.add("b");										//�洢��ͬԪ��ʱ����Ϊfalse
		hs.add("c"); 										//hashset�̳���ϵ����д��tostring����
		hs.add("d");
		for (String str : hs) {								//ֻҪ�����õ����� �����ľͿ�������ǿforѭ��������
			System.out.println(str);
		}
		System.out.println(b1);
	}

}
