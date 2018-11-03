package com.java.regex;

public class MyRegex�ɶ��ַ� {

	/**
 A:Greedy ������ 
	* X? X��һ�λ�һ��Ҳû��
	* X* X����λ���
	* X+ X��һ�λ���
	* X{n} X��ǡ�� n �� 
	* X{n,} X������ n �� 
	* X{n,m} X������ n �Σ����ǲ����� m �� 
	----------------------------------------------
	* ������ʽ�ķָ��
	* String��Ĺ��ܣ�public String[] split(String regex)
	-------------------------------------------------
	������ʽ���滻����
	* String��Ĺ��ܣ�public String replaceAll(String regex,String replacement)
-----------------------------------------------------------------------------------------------
������ʽ�ķ��鹦��
	* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 
* 
		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		����ʼ�մ����������ʽ��
-----------------------------------------------------------------------------------------------
	 */
	public static void main(String[] args) {
		
		 
		String regex = "(.)\\1(.)\\2";  //  \\1�����һ���ֳ���һ��  \\2����ڶ����ֳ���һ��
		System.out.println("�������".matches(regex));
		System.out.println("���ֿ���".matches(regex));
		String regex1 = "(..)\\1";  
		System.out.println("���ֿ���".matches(regex1));
		
		
		//��ĳЩ�ַ��滻();
		//�ָ��ַ���();
		//a();   	// X?   ����X�е�����һ�λ�һ��Ҳû��(ǰ����X�е�����)
		//b();		// X*   ����X�е�������ε���γ���(ǰ����X�е�����)
		//c();		// X+   ����X�е�����һ�ε���γ���(ǰ����X�е�����)
		//d();		// X{n}   ����X�е�����ǡ�� n �� ����(ǰ����X�е�����)
		//e();		// X{n,m}   ����X�е��������� n �Σ����ǲ����� m �� ����(ǰ����X�е�����)



	}

	private static void ��ĳЩ�ַ��滻() {
		String str = "��1��5ѧ334ϰ653";     //�����е������ÿ��ַ��滻��
		String regex = "\\d";                //   ���� ��\\d���������������
	//	String regex = "[1-5]";                //   ���� �Ĵ������1-5����
		String str1 = str.replaceAll(regex, "");
		System.out.println(str1);
	}

	private static void �ָ��ַ���() {
		String str = "wo de,java xue xi";
		String[] arr = str.split(" ");                 //��" "(�ո�)��ԭ�ַ����ָ������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------");
		
		String[] arr1 = str.split(",");                 //��","(����)��ԭ�ַ����ָ������
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

	private static void e() {
		String regex = "[abc]{2,4}";                     //   X{n,m}   ����X�е��������� n �Σ����ǲ����� m �� ����(ǰ����X�е�����)
		System.out.println("a".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("abacb".matches(regex));
		System.out.println("abd".matches(regex));
	}

	private static void d() {
		String regex = "[abc]{1}";                     //  X{n}   ����X�е�����ǡ�� n �� ����(ǰ����X�е�����)
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void c() {
		String regex = "[abc]+";                     // X+   ����X�е�����һ�ε���γ���(ǰ����X�е�����)
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("aaacb".matches(regex));
	}

	private static void b() {
		String regex = "[abc]*";                     // X*   ����X�е�������ε���γ���(ǰ����X�е�����)
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("aabc".matches(regex));
		System.out.println("ad".matches(regex));
	}

	private static void a() {
		String regex = "[abc]?";                     // X?   ����X�е�����һ�λ�һ��Ҳû��(ǰ����X�е�����)
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("d".matches(regex));
	}

}
