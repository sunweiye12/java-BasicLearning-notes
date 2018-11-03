package com.java.regex;

public class MyRegex单字符预定义 {

	/**
		.	任何字符（与行结束符可能匹配也可能不匹配）
		\d	数字：[0-9]
		\D	非数字： [^0-9]
		\s	空白字符：[ \t\n\x0B\f\r]
		\S	非空白字符：[^\s]
		\w	单词字符：[a-zA-Z_0-9]
		\W	非单词字符：[^\w]
	 */
	public static void main(String[] args) {
		//a();
		//b();
		//c();
		//d();
	}

	private static void d() {
		String regex = "\\w";     		//   \\w	单词字符：[a-zA-Z_0-9]
		System.out.println("a".matches(regex));
		System.out.println("=".matches(regex));
	}

	private static void c() {
		String regex = "\\s";     		//   \\s	空白字符：[ \t\n\x0B\f\r]
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));    //Tab键
		System.out.println("    ".matches(regex));    //四个空格
	}

	private static void b() {
		String regex = "\\d";     		//   \\d  数字：[0-9]  (注意:此处应该用双反斜线 单反斜线只代表转义字符)
		System.out.println("q".matches(regex));
		System.out.println("0".matches(regex));
	}

	private static void a() {
		String regex = ".";     		//.	任何字符（一个点代表一个任意字符,两个代表两个）
		System.out.println("q".matches(regex));
		String regex1 = "..";     		//.	任何字符（一个点代表一个任意字符,两个代表两个）
		System.out.println("q1".matches(regex1));
	}

}
