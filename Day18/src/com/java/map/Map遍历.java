package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map遍历 {

	/**
	 *Map不能通过遍历器进行遍历.
	*获取功能
	* Set<Map.Entry<K,V>> entrySet():
	* V get(Object key):  根据键获取值
	* Set<K> keySet():    获取集合中所有键的集合
	
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();    //因为Map是接口,因此不能直接创建对象,创建时要父类引用指向子类对象;
		map.put("张三", 20);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);  
		
//		Set<String> key = map.keySet();  //获取集合中所有的键,装到一个set集合里
//		System.out.println(key);
		
//		Iterator<String> it = key.iterator();     // 双列集合的第一种遍历 !!(用迭代器)集合中的键和值
//		while(it.hasNext()) {
//			String onekey = it.next();
//			Integer value = map.get(onekey);
//			System.out.println(onekey + " =" + value);			
//		}
		
//		for (String onekey : key) {                   //双列集合的第一种遍历 !!(用增强for循环)集合中的键和值
//			Integer value = map.get(onekey);          //根据键来获取值
//			System.out.println(onekey + " =" + value);	
//		}
		
//		for (String key : map.keySet()) {                   //双列集合的第一种遍历 !!(用增强for循环)化简版
//			System.out.println(key + " =" + map.get(key));	
//		}
//		
//		Set<Map.Entry<String, Integer>> entryset = map.entrySet();  // 双列集合的第二种遍历 !!(用迭代器)集合中的键和值
//		//Map.Entry说明Entry是Map的内部接口, 此方法将MAp集合的键和值封装成了成对的Entry对象,存储在Set集合中
//		//获取每个对象,
//		Iterator<Map.Entry<String, Integer>> it = entryset.iterator();
//		while(it.hasNext()) {
//			//获取每一个entry对象
//			Map.Entry<String, Integer> en = it.next();
//			//通过 get方法来获得entry对象的key和value值
//			System.out.println(en.getKey() + " =" + en.getValue());
//		}
		
		for (Entry<String, Integer> en : map.entrySet()) {   //双列集合的第二种遍历 !!(用增强for循环)化简版
			System.out.println(en.getKey() + " =" + en.getValue());
		}
				
				
		
		
//		Integer i = map.get("张三");  //根据键来获取值
//		System.out.println(i);
		
		System.out.println(map);
	
	}

}
