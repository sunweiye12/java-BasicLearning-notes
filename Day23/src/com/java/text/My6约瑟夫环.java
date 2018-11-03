package com.java.text;

import java.util.ArrayList;

public class My6约瑟夫环 {

	/**
	 * @param args
	 * * 幸运数字
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLuckyNum(8));
	}
	
	//幸运数字方法
	//返回值类型 int num
	//参数列表 int num
	public static int getLuckyNum( int num) {
		ArrayList<Integer> list = new ArrayList<>();    //创建一个容器来存数据
		for(int i = 1; i <= num;i++) {					//将数据村到集合中
			list.add(i);
		}
		int count = 1;
		for (int i = 0; list.size() != 1; i++) {
			if (i == list.size()) {
				i = 0;
			}
			
			if (count % 3 == 0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}
}
