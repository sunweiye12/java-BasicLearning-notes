package com.java.regex;

public class MyRegex���ַ�Ԥ���� {

	/**
		.	�κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩
		\d	���֣�[0-9]
		\D	�����֣� [^0-9]
		\s	�հ��ַ���[ \t\n\x0B\f\r]
		\S	�ǿհ��ַ���[^\s]
		\w	�����ַ���[a-zA-Z_0-9]
		\W	�ǵ����ַ���[^\w]
	 */
	public static void main(String[] args) {
		//a();
		//b();
		//c();
		//d();
	}

	private static void d() {
		String regex = "\\w";     		//   \\w	�����ַ���[a-zA-Z_0-9]
		System.out.println("a".matches(regex));
		System.out.println("=".matches(regex));
	}

	private static void c() {
		String regex = "\\s";     		//   \\s	�հ��ַ���[ \t\n\x0B\f\r]
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));    //Tab��
		System.out.println("    ".matches(regex));    //�ĸ��ո�
	}

	private static void b() {
		String regex = "\\d";     		//   \\d  ���֣�[0-9]  (ע��:�˴�Ӧ����˫��б�� ����б��ֻ����ת���ַ�)
		System.out.println("q".matches(regex));
		System.out.println("0".matches(regex));
	}

	private static void a() {
		String regex = ".";     		//.	�κ��ַ���һ�������һ�������ַ�,��������������
		System.out.println("q".matches(regex));
		String regex1 = "..";     		//.	�κ��ַ���һ�������һ�������ַ�,��������������
		System.out.println("q1".matches(regex1));
	}

}
