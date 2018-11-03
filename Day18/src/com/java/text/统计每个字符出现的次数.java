package com.java.text;

import java.util.HashMap;

public class 统计每个字符出现的次数 {

	/**
* 需求：统计字符串中每个字符出现的次数			
	 */
	public static void main(String[] args) {
		String str = "aaaaaaaabbbbb哈bcccccccccc";
		char[] arr = str.toCharArray();						//将字符串转换成字符数组
		HashMap<Character, Integer> hm = new HashMap<>();	//创建双列集合存储键和值
		
		for(char c : arr) {									//遍历字符数组
			if(!hm.containsKey(c)) {						//如果不包含这个键
				hm.put(c, 1);								//就将键和值为1添加
			}else {											//如果包含这个键
				hm.put(c, hm.get(c) + 1);					//就将键和值再加1添加进来
			}
			
//			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);    //三元运算符  简化算法
			
//			Integer i = !hm.containsKey(c) ? hm.put(c, 1) : hm.put(c, hm.get(c) + 1);
		}
		
		for (Character key : hm.keySet()) {					//遍历双列集合
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
