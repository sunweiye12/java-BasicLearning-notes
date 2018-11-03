package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexText_找电话 {

	/**
需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
		将字符串还原成:“我要学编程”。
--------------------------------------------------------------------------
需求：把一个字符串中的手机号码获取出来
*      获取一堆数据中的手机号

 
	 */
	public static void main(String[] args) {

		//a();
		b();
	
	}

	private static void b() {
		String s ="我现在用的手机号是:17801020179,我原来用的手机号是15732028636.";
		
//		String regex = "1[3578]\\d{9}";            //得到手机号的正则表达式
//		Pattern p =Pattern.compile(regex);         //将正则表达式转换成一种模式
//		Matcher m = p.matcher("17801020179");		//p.matcher(String)获取一个匹配器,将匹配器中的内容与模式做对比
//		boolean b = m.matches();					//m.matches()获取匹配器的结果
//		System.out.println(b);   					//shuchu
		
		String regex = "1[3578]\\d{9}";            //得到手机号的正则表达式
	/*	
	
		Pattern p =Pattern.compile(regex);    	  //将正则表达式转换成一种模式
		Matcher m = p.matcher(s);				  //将上模式存到匹配器中,并在匹配器中存入目标字符串
		boolean b = m.find();                      //在s中寻找是否含有正则表达式的内容
		System.out.println(b);
		System.out.println(m.group());             //输出与正则表达式一致的内容
		boolean b2 = m.find();
		System.out.println(m.group());
    */

		Pattern p =Pattern.compile(regex);    	  //将正则表达式转换成一种模式
		Matcher m = p.matcher(s);				  //将上模式存到匹配器中,并在匹配器中存入目标字符串
		while (m.find()) {                           //利用循环,输出所有匹配项   
			//find函数有指针作用,在寻找到一个目标后下次寻找时会忽略已经寻找的目标
			System.out.println(m.group());		
		}
	}

	private static void a() {
		String str = "我我....我...我我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String regex = "\\.+";       //    . 必须用\\.来表示           +表示一个或多个
		String s1 = str.replaceAll(regex, "");   //将所有的. 用空字符替代(即删除所有的.)
		System.out.println(s1);
		String s2 = s1.replaceAll("(.)\\1+", "$1");   //   (.)\\1+ 代表任意字符出现了一次到多次    $1代表第一组中的数据
		System.out.println(s2);
	}

}
