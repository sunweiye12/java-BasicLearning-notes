package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map���� {

	/**
	 *Map����ͨ�����������б���.
	*��ȡ����
	* Set<Map.Entry<K,V>> entrySet():
	* V get(Object key):  ���ݼ���ȡֵ
	* Set<K> keySet():    ��ȡ���������м��ļ���
	
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();    //��ΪMap�ǽӿ�,��˲���ֱ�Ӵ�������,����ʱҪ��������ָ���������;
		map.put("����", 20);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);  
		
//		Set<String> key = map.keySet();  //��ȡ���������еļ�,װ��һ��set������
//		System.out.println(key);
		
//		Iterator<String> it = key.iterator();     // ˫�м��ϵĵ�һ�ֱ��� !!(�õ�����)�����еļ���ֵ
//		while(it.hasNext()) {
//			String onekey = it.next();
//			Integer value = map.get(onekey);
//			System.out.println(onekey + " =" + value);			
//		}
		
//		for (String onekey : key) {                   //˫�м��ϵĵ�һ�ֱ��� !!(����ǿforѭ��)�����еļ���ֵ
//			Integer value = map.get(onekey);          //���ݼ�����ȡֵ
//			System.out.println(onekey + " =" + value);	
//		}
		
//		for (String key : map.keySet()) {                   //˫�м��ϵĵ�һ�ֱ��� !!(����ǿforѭ��)�����
//			System.out.println(key + " =" + map.get(key));	
//		}
//		
//		Set<Map.Entry<String, Integer>> entryset = map.entrySet();  // ˫�м��ϵĵڶ��ֱ��� !!(�õ�����)�����еļ���ֵ
//		//Map.Entry˵��Entry��Map���ڲ��ӿ�, �˷�����MAp���ϵļ���ֵ��װ���˳ɶԵ�Entry����,�洢��Set������
//		//��ȡÿ������,
//		Iterator<Map.Entry<String, Integer>> it = entryset.iterator();
//		while(it.hasNext()) {
//			//��ȡÿһ��entry����
//			Map.Entry<String, Integer> en = it.next();
//			//ͨ�� get���������entry�����key��valueֵ
//			System.out.println(en.getKey() + " =" + en.getValue());
//		}
		
		for (Entry<String, Integer> en : map.entrySet()) {   //˫�м��ϵĵڶ��ֱ��� !!(����ǿforѭ��)�����
			System.out.println(en.getKey() + " =" + en.getValue());
		}
				
				
		
		
//		Integer i = map.get("����");  //���ݼ�����ȡֵ
//		System.out.println(i);
		
		System.out.println(map);
	
	}

}
