package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.java.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked", "unused" })    //Ctrl+1 ʵ�� ȥ�����õľ���
public class MyCollection {

	/**
 A:������ʾ	 
		����������ʾ
		boolean add(E e)
		boolean remove(Object o)
		void clear()
		boolean contains(Object o)  //�ж��Ƿ����o
		boolean isEmpty()
		int size()
��All�Ĺ�����ʾ	
		boolean addAll(Collection c)
		boolean removeAll(Collection c)      //ɾ�����Ǽ��ϵĽ���
		boolean containsAll(Collection c)
		boolean retainAll(Collection c)      //ȡ������  (���õļ���ֻҪ�����ı����true)
	 		
		
		��������ʵ��  ���ϱ���
		
* B:ע��:
* 		Collection���ڽӿ��� ��˲�����ʵ���� ����ͨ����������ָ���������ķ���
		collectionXxx.javaʹ����δ�����򲻰�ȫ�Ĳ���.
		ע��:Ҫ�˽���ϸ��Ϣ,��ʹ�� -Xlint:unchecked���±���.
		java��������Ϊ�ó�����ڰ�ȫ����
		��ܰ��ʾ:�ⲻ�Ǳ���ʧ��,�����Ȳ������,��ѧ�˷������֪����
	 */
	public static void main(String[] args) {
			Collection c = new ArrayList<Object>();  //��������ָ���������
			
			c.add("e");
			c.add("a");			
			c.add("e");
			c.add("b");
			c.remove("e");
			c.remove("e");  //ɾ���ƶ�Ԫ��
//			c.clear();       //��ռ���
//			c.removeAll(c);  //��� ����
			
			System.out.println(c.contains("a"));          //�ж��Ƿ����o
			System.out.println(c.isEmpty());              //�жϼ����Ƿ�Ϊ��
			
			int i = c.size();                           //��ȡԪ�صĸ���	
			System.out.println(c);
			System.out.println(i);
			
		    Iterator ite = c.iterator();            //��ȡһ������������ ��������
		    while (ite.hasNext()) {                 //�жϼ������Ƿ����Ԫ��(����ָ��ЧӦ)
		    	System.out.println(ite.next());     //��ȡ��Ԫ�ز���ӡ
		    }
		
			
			
			//���(c);

	}

	private static void ���(Collection c) {
		boolean b1 = c.add("����");         //�ڼ����в��ܴ洢������������(��˴˴������Զ�װ��)
		boolean b2 = c.add(100); 
		boolean b3 = c.add('a'); 
		boolean b4 = c.add(true); 
		boolean b5 = c.add(new Student("����",14));
		boolean b6 = c.add("����");         //��Ϊarraylist���Դ洢��ͬ������  ������Ϸ��صĶ���true
		
		System.out.println(c);   			//��ӡ����
	}

}
