package com.java.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class ������1 {

/**
* ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
* 		
*/
	public static void main(String[] args) {
		//��һ���˿�
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"��Ƭ","÷��","����","����"};
		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		
		poker.add("С��");
		poker.add("����");
		//ϴ��
		Collections.shuffle(poker);
		//����
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
		
		//����
		
		System.out.println(gaojin);
		System.out.println(longwu);
		System.out.println(me);
		System.out.println(dipai);
	}}


