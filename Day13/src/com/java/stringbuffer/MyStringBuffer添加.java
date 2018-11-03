package com.java.stringbuffer;

public class MyStringBuffer添加 {

	/**
	 *  A:StringBuffer的添加功能
	 	* public StringBuffer append(String str):
	 		* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	 	* public StringBuffer insert(int offset,String str):
	 		* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
	 */
	public static void main(String[] args) {
		//demo1();
		demo2();
	
		

	}

	private static void demo2() {
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3,"java");  //在第三个字符后添加(这里记住,所有的添加都是针对创建的对象而言的,而没有创建新的对象)
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append(true);
		StringBuffer sb2 = sb.append("java");
		System.out.println(sb2.toString());
		StringBuffer sb3 = sb.append(100);
		StringBuffer sb4 = sb.append('w');
		//在添加对象时不会创建新的对象,而是不断的添加到原对象中,最后得到的都是都添加完后的结果(4四个引用指向的是一个对象)
		System.out.println(sb.toString());
	}

}
