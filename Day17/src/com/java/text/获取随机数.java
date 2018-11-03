package com.java.text;

import java.util.HashSet;
import java.util.Random;

public class 获取随机数 {

	/**
	* 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。		
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();		//创建集合对象
		Random r = new Random();					//创建随机数对象
		
		while(hs.size() < 10) {                     //使集合的长度为10 个元素
			int num = r.nextInt(20) + 1;			//生成1到20的随机数
			hs.add(num);
		}
		
		for (Integer ig : hs) {				//遍历集合
			System.out.println(ig);			//打印每一个元素(都为integer类型)
		}
	}

}
