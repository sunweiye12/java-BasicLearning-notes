package com.java.myString;

import java.util.Scanner;

public class �û���½ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i < 3;i++){
			System.out.println("�������û���:");
			String userName = sc.nextLine();
			System.out.println("�������¼����:");
			String passWord = sc.nextLine();
	
			if ("admin".equals(userName) && "admin".equals(passWord)) {
				System.out.println("��ӭ" + userName + "��½��ϵͳ");
				break;
			} else {
				if (i==2) {
					System.out.println("���Ļ���������,������������!");
				} else {
					System.out.println("��������û�������������,�㻹ʣ"+ (2-i) + "�λ���!");
				}
			}
		}
	}

}
