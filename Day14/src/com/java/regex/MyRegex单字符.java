package com.java.regex;

public class MyRegex单字符 {

	/**
字符类
	* [abc] a、b 或 c（简单类） 
	* [^abc] 任何字符，除了 a、b 或 c（否定） 
	* [a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
	* [0-9] 0到9的字符都包括
	* [a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集）
      [a-z&&[def]]	d、e 或 f（交集）
	  [a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去）
	  [a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
	 */
	public static void main(String[] args) {
		/*正则表达式中[](中括号) 代表的是单个字符*/
		//a();
		//b();    
		//c();
		//d();
		
	}

	private static void d() {
		String regex = "[0-9]";     		//0到9的字符都包括
		System.out.println("0".matches(regex));
		System.out.println("9".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void c() {
		String regex = "[a-zA-Z]";     //[a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围）
		System.out.println("a".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("z".matches(regex));
	}

	private static void b() {
		String regex = "[^abc]";                     //代表正则表达式不允许字符串有单字符a或b或c
		System.out.println("a".matches(regex)); 
		System.out.println("d".matches(regex));
	}

	private static void a() {
		String regex = "[abc]";                     //代表正则表达式允许字符串只能有单字符a或b或c
		System.out.println("ab".matches(regex));    
		System.out.println("b".matches(regex));		//验证前面的字符串是否符合设置的正则表达式 .复合返回true
	}

}
