package com.java.collection;

public class MyListIterator {

	/**
* ��������һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�

			List list = new ArrayList();
			list.add("a");
			list.add("b");
			list.add("world");
			list.add("d");
			list.add("e");
			
			/*Iterator it = list.iterator();
			while(it.hasNext()) {
				String str = (String)it.next();
				if(str.equals("world")) {
					list.add("javaee");			//������׳�ConcurrentModificationException�����޸��쳣
				}
			}
			
			
* B:ConcurrentModificationException����
	* �����������������޸ļ���
* C:�������
	* a:����������Ԫ�أ��������޸�Ԫ��(ListIterator�����й���add)
	* b:���ϱ���Ԫ�أ������޸�Ԫ��

			ListIterator lit = list.listIterator();		//������ڱ����Ĺ��������Ԫ��,������ListIterator�е�add����
			while(lit.hasNext()) {
				String str = (String)lit.next();
				if(str.equals("world")) {
					lit.add("javaee");	
					//list.add("javaee");
				}
			}
						
���Ͽ��(ListIterator)(�˽�)
* boolean hasNext()�Ƿ�����һ��
* boolean hasPrevious()�Ƿ���ǰһ��
* Object next()������һ��Ԫ��
* Object previous();������һ��Ԫ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
