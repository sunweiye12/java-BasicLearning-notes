package com.java.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ���Ƽ���¼�� {

	/**
    * ����¼��һ��int���͵�����,����������Ʊ�����ʽ
	 * ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
	 * ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
	 * ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");		
		
		while(true) {
			String line = sc.nextLine();	
			try {
				int i = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(i));
			} catch (Exception e) {
				 try {
					 new BigInteger(line);
					 System.out.println("¼�����,���������������,������������һ������: ");
				} catch (Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("¼�����,�������Ϊһ��С��,������������һ������: ");
					} catch (Exception e2) {					
						System.out.println("¼�����,��������ǷǷ��ַ�,������������һ������: ");
					} 
				}
			}
		} 
		

	}

}
