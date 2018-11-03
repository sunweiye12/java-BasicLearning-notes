package com.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyMap {

	/**
Map集合的功能概述
	* a:添加功能
		* V put(K key,V value):添加元素。
			* 如果键是第一次存储，就直接存储元素，返回null
			* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
	* b:删除功能
		* void clear():移除所有的键值对元素
		* V remove(Object key)：根据键删除键值对元素，并把值返回
	* c:判断功能
		* boolean containsKey(Object key)：       判断集合是否包含指定的键
		* boolean containsValue(Object value): 判断集合是否包含指定的值
		* boolean isEmpty()：判断集合是否为空
	* d:获取功能
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):根据键获取值
		* Set<K> keySet():获取集合中所有键的集合
		* Collection<V> values():获取集合中所有值的集合
	* e:长度功能
		* int size()：返回集合中的键值对的个数
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();    //因为Map是接口,因此不能直接创建对象,创建时要父类引用指向子类对象;
		map.put("张三", 20);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);             //Map中键是唯一的,此方法返回的时 被覆盖的值(前面是键,后面是值,返回类型为值的类型)
//		Integer i = map.put("赵六", 8);  //此处应该返回26,因为将26被覆盖了				
//		System.out.println(i);
		
//		map.clear();                           //清楚所有元素
//		Integer i2 = map.remove("张三");       //根据键来来删除对应的元素 (返回所删除的值)  
//		System.out.println(i2);
		
//		Collection<Integer> co =map.values();   //获取集合中所有的值 返回一个集合
//		System.out.println(co);
		
		System.out.println(map.size());         //获取元素的个数 
		System.out.println(map);

	}

}
