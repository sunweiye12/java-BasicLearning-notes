package com.java.regex;

public class MyRegex可多字符 {

	/**
 A:Greedy 数量词 
	* X? X，一次或一次也没有
	* X* X，零次或多次
	* X+ X，一次或多次
	* X{n} X，恰好 n 次 
	* X{n,} X，至少 n 次 
	* X{n,m} X，至少 n 次，但是不超过 m 次 
	----------------------------------------------
	* 正则表达式的分割功能
	* String类的功能：public String[] split(String regex)
	-------------------------------------------------
	正则表达式的替换功能
	* String类的功能：public String replaceAll(String regex,String replacement)
-----------------------------------------------------------------------------------------------
正则表达式的分组功能
	* 捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组： 
* 
		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		组零始终代表整个表达式。
-----------------------------------------------------------------------------------------------
	 */
	public static void main(String[] args) {
		
		 
		String regex = "(.)\\1(.)\\2";  //  \\1代表第一组又出现一次  \\2代表第二组又出现一次
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐快乐".matches(regex));
		String regex1 = "(..)\\1";  
		System.out.println("快乐快乐".matches(regex1));
		
		
		//将某些字符替换();
		//分割字符串();
		//a();   	// X?   代表X中的内容一次或一次也没有(前提是X中的内容)
		//b();		// X*   代表X中的内容零次到多次出现(前提是X中的内容)
		//c();		// X+   代表X中的内容一次到多次出现(前提是X中的内容)
		//d();		// X{n}   代表X中的内容恰好 n 次 出现(前提是X中的内容)
		//e();		// X{n,m}   代表X中的内容至少 n 次，但是不超过 m 次 出现(前提是X中的内容)



	}

	private static void 将某些字符替换() {
		String str = "我1爱5学334习653";     //将其中的数字用空字符替换调
		String regex = "\\d";                //   这里 的\\d代表的是任意数字
	//	String regex = "[1-5]";                //   这里 的代表的是1-5数字
		String str1 = str.replaceAll(regex, "");
		System.out.println(str1);
	}

	private static void 分割字符串() {
		String str = "wo de,java xue xi";
		String[] arr = str.split(" ");                 //用" "(空格)将原字符串分割成数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------");
		
		String[] arr1 = str.split(",");                 //用","(逗号)将原字符串分割成数组
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

	private static void e() {
		String regex = "[abc]{2,4}";                     //   X{n,m}   代表X中的内容至少 n 次，但是不超过 m 次 出现(前提是X中的内容)
		System.out.println("a".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("abacb".matches(regex));
		System.out.println("abd".matches(regex));
	}

	private static void d() {
		String regex = "[abc]{1}";                     //  X{n}   代表X中的内容恰好 n 次 出现(前提是X中的内容)
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void c() {
		String regex = "[abc]+";                     // X+   代表X中的内容一次到多次出现(前提是X中的内容)
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("aaacb".matches(regex));
	}

	private static void b() {
		String regex = "[abc]*";                     // X*   代表X中的内容零次到多次出现(前提是X中的内容)
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("aabc".matches(regex));
		System.out.println("ad".matches(regex));
	}

	private static void a() {
		String regex = "[abc]?";                     // X?   代表X中的内容一次或一次也没有(前提是X中的内容)
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("d".matches(regex));
	}

}
