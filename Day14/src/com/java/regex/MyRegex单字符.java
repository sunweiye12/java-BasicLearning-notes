package com.java.regex;

public class MyRegex���ַ� {

	/**
�ַ���
	* [abc] a��b �� c�����ࣩ 
	* [^abc] �κ��ַ������� a��b �� c���񶨣� 
	* [a-zA-Z] a�� z �� A�� Z����ͷ����ĸ�������ڣ���Χ�� 
	* [0-9] 0��9���ַ�������
	* [a-d[m-p]]	a �� d �� m �� p��[a-dm-p]��������
      [a-z&&[def]]	d��e �� f��������
	  [a-z&&[^bc]]	a �� z������ b �� c��[ad-z]����ȥ��
	  [a-z&&[^m-p]]	a �� z������ m �� p��[a-lq-z]����ȥ��
	 */
	public static void main(String[] args) {
		/*������ʽ��[](������) ������ǵ����ַ�*/
		//a();
		//b();    
		//c();
		//d();
		
	}

	private static void d() {
		String regex = "[0-9]";     		//0��9���ַ�������
		System.out.println("0".matches(regex));
		System.out.println("9".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void c() {
		String regex = "[a-zA-Z]";     //[a-zA-Z] a�� z �� A�� Z����ͷ����ĸ�������ڣ���Χ��
		System.out.println("a".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("z".matches(regex));
	}

	private static void b() {
		String regex = "[^abc]";                     //����������ʽ�������ַ����е��ַ�a��b��c
		System.out.println("a".matches(regex)); 
		System.out.println("d".matches(regex));
	}

	private static void a() {
		String regex = "[abc]";                     //����������ʽ�����ַ���ֻ���е��ַ�a��b��c
		System.out.println("ab".matches(regex));    
		System.out.println("b".matches(regex));		//��֤ǰ����ַ����Ƿ�������õ�������ʽ .���Ϸ���true
	}

}
