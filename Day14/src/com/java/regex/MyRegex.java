package com.java.regex;

import java.util.Scanner;

public class MyRegex {

	/**
 A:������ʽ
	* ��ָһ��������������ƥ��һϵ�з���ĳ���﷨������ַ����ĵ����ַ�������ʵ����һ�ֹ������Լ������Ӧ�á�
	* ����:����ע������,�������û���������,һ���������Ƴ���,������Ƴ��ȵ��������������ʽ����
* B:������ʾ
	* ����У��qq����.
		* 1:Ҫ�������5-15λ����
		* 2:0���ܿ�ͷ
		* 3:���붼������
		* У��qq
		* 1.��ȷ����ֵ���� boolean
		* 2.�����б� String qq
	* a:��������ʽʵ��
	* b:������ʽʵ��
	 */
	public static void main(String[] args) {
//		* ����У��qq����.
//		* 1:Ҫ�������5-15λ����
//		* 2:0���ܿ�ͷ
//		* 3:���붼������
//		* У��qq
//		* 1.��ȷ����ֵ���� boolean
//		* 2.�����б� String qq
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ע���QQ����:");
		
		String qq = sc.nextLine();
		//System.out.println(qq);
		System.out.println(checkqq(qq));
//                                                 ����ԭ��ѧ��֪ʶ���
	}
	public static boolean checkqq(String qq) {
		boolean falg = true;
		if(qq.length() <= 15 && qq.length() >= 5) {
			if(!qq.startsWith("0")) {
				char arr[] = qq.toCharArray();  //���ַ���ת��Ϊ�ַ�����
				for (int i = 0;  i < arr.length; i++) {
					if(!(arr[i] >= '0' && arr[i] <= '9')) {						
						falg = false;    //�������ַ���false
						System.out.println("���붼������");
						break;
					}
				}
			} else {
				falg = false;         //�����0��ͷ�򷵻�false
				System.out.println("0���ܿ�ͷ");
			}
		} else {
			falg = false;             //����ַ������Ȳ�����Ҫ��ͷ���false
			System.out.println("Ҫ�������5-15λ����");
		}
		if(falg == true) {
			System.out.println("ע��ɹ�!");
		}
		return falg;
		
	}
}
