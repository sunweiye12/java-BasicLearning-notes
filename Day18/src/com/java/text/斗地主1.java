package com.java.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class 斗地主1 {

/**
* 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
* 		
*/
	public static void main(String[] args) {
		//买一副扑克
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"方片","梅花","红桃","黑桃"};
		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		
		poker.add("小王");
		poker.add("大王");
		//洗牌
		Collections.shuffle(poker);
		//发牌
		ArrayList<String> gaojin = new ArrayList<>();
		ArrayList<String> longwu = new ArrayList<>();
		ArrayList<String> me = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for(int i = 0; i < poker.size(); i++) {
			if(i >= poker.size() - 3) {
				dipai.add(poker.get(i));
			}else if(i % 3 == 0) {
				gaojin.add(poker.get(i));
			}else if(i % 3 == 1) {
				longwu.add(poker.get(i));
			}else {
				me.add(poker.get(i));
			}
		}
		
		//看牌
		
		System.out.println(gaojin);
		System.out.println(longwu);
		System.out.println(me);
		System.out.println(dipai);
	}}


