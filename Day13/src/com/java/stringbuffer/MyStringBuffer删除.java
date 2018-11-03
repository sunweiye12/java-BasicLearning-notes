package com.java.stringbuffer;

public class MyStringBuffer删除 {

	/**
 A:StringBuffer的删除功能
	* public StringBuffer deleteCharAt(int index):
		* 删除指定位置的字符，并返回本身
	* public StringBuffer delete(int start,int end):
		* 删除从指定位置开始指定位置结束的内容，并返回本身

	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234");
		System.out.println(sb);
		
		sb.deleteCharAt(2);   //删除的不是第2个字符,而是索引值为2位置上的字符
		System.out.println(sb);
		
		sb.append("wodejava");
		System.out.println(sb);
		
		sb.delete(4, 6);
		System.out.println(sb); //删除的是索引值在第4和第5的字符  (包含头不包含尾)
		
		sb.delete(0, sb.length());//清空缓存

	}

}
