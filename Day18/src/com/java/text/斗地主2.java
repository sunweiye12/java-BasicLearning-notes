package com.java.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * * ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
 */
public class ������2 {
	public static void main(String[] args) {
		//��һ����
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"��Ƭ","÷��","����","����"};
		HashMap<Integer, String> hm = new HashMap<>();			//�洢�������˿���
		ArrayList<Integer> list = new ArrayList<>();			//�洢����
		int index = 0;											//�����Ŀ�ʼֵ
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index, s2.concat(s1));					//���������˿�����ӵ�HashMap��
				list.add(index);								//��������ӵ�ArrayList������
				index++;
			}
		}
		hm.put(index, "С��");
		list.add(index);
		index++;
		hm.put(index, "����");
		list.add(index);
		//ϴ��
		Collections.shuffle(list);
		//����
		TreeSet<Integer> gaojin = new TreeSet<>();
		TreeSet<Integer> longwu = new TreeSet<>();
		TreeSet<Integer> me = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(i >= list.size() - 3) {
				dipai.add(list.get(i)); 						//��list�����е�������ӵ�TreeSet�����л��Զ�����
			}else if(i % 3 == 0) {
				gaojin.add(list.get(i));
			}else if(i % 3 == 1) {
				longwu.add(list.get(i));
			}else {
				me.add(list.get(i));
			}
		}
		
		//����
		lookPoker("�߽�", gaojin, hm);
		lookPoker("����", longwu, hm);
		lookPoker("���", me, hm);
		lookPoker("����", dipai, hm);
		
	}
	
	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer, String> hm) {
		System.out.print(name + "������:");
		for (Integer index : ts) {
			System.out.print(hm.get(index) + " ");
		}
		
		System.out.println();
	}
	

}
