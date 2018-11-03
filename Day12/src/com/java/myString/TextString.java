package com.java.myString;

public class TextString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";					//相当于  Person p = new Person;但这个可以过set方法来改变p对象的属性
		System.out.println(str);			//而string类型的一旦赋值则无法改变其值
		System.out.println("-----------------------");
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		String s4 = "bc";
		String s5 = "a";
		
		System.out.println(s1.equals(s2));        		//true          //判断字符串是否相等(区分大小写)
		System.out.println(s1.equals(s3));     			//false
		System.out.println(s1.equalsIgnoreCase(s3));     //true          (不区分大小写)
		System.out.println(s1.contains(s4));    		//true           //判断是否包含
		System.out.println(s1.startsWith(s5));  		//true           //判断是否以s5字符串开头
		System.out.println(s1.endsWith(s4));    		//true           //判断是否以s4字符串结尾
		System.out.println(s1.isEmpty());      			//false          //判断是否为空字符串
		
		System.out.println("-----------------------");
		
		
		
		
		
		
		
	}

}
