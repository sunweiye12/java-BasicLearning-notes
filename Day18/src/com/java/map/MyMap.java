package com.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyMap {

	/**
Map���ϵĹ��ܸ���
	* a:��ӹ���
		* V put(K key,V value):���Ԫ�ء�
			* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
			* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	* b:ɾ������
		* void clear():�Ƴ����еļ�ֵ��Ԫ��
		* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
	* c:�жϹ���
		* boolean containsKey(Object key)��       �жϼ����Ƿ����ָ���ļ�
		* boolean containsValue(Object value): �жϼ����Ƿ����ָ����ֵ
		* boolean isEmpty()���жϼ����Ƿ�Ϊ��
	* d:��ȡ����
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):���ݼ���ȡֵ
		* Set<K> keySet():��ȡ���������м��ļ���
		* Collection<V> values():��ȡ����������ֵ�ļ���
	* e:���ȹ���
		* int size()�����ؼ����еļ�ֵ�Եĸ���
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();    //��ΪMap�ǽӿ�,��˲���ֱ�Ӵ�������,����ʱҪ��������ָ���������;
		map.put("����", 20);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);             //Map�м���Ψһ��,�˷������ص�ʱ �����ǵ�ֵ(ǰ���Ǽ�,������ֵ,��������Ϊֵ������)
//		Integer i = map.put("����", 8);  //�˴�Ӧ�÷���26,��Ϊ��26��������				
//		System.out.println(i);
		
//		map.clear();                           //�������Ԫ��
//		Integer i2 = map.remove("����");       //���ݼ�����ɾ����Ӧ��Ԫ�� (������ɾ����ֵ)  
//		System.out.println(i2);
		
//		Collection<Integer> co =map.values();   //��ȡ���������е�ֵ ����һ������
//		System.out.println(co);
		
		System.out.println(map.size());         //��ȡԪ�صĸ��� 
		System.out.println(map);

	}

}
