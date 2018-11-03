package com.java.stringbuffer;

public class MyStringBuffer方法 {

	/**
* A:StringBuffer的替换功能
	* public StringBuffer replace(int start,int end,String str):
		* 从start开始到end用str替换
* B:StringBuffer的反转功能
	* public StringBuffer reverse():
		* 字符串反转
------------------------------------------------------------
 A:StringBuffer的截取功能
	* public String substring(int start):
		* 从指定位置截取到末尾
	* public String substring(int start,int end):
		* 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
* B:注意事项
	* 注意:返回值类型不再是StringBuffer本身而是string
------------------------------------------------------------
 A:String 转换为 StringBuffer
	* a:通过构造方法 
	* b:通过append()方法
* B:StringBuffer 转换为 String
	* a:通过构造方法
	* b:通过toString()方法
	* c:通过subString(0,length);
------------------------------------------------------------

	 */
	public static void main(String[] args) {
		//替换反转();
		//截取内容();
		//String和StringBuffer转换();
		
	}

	private static void String和StringBuffer转换() {
		StringBuffer sb = new StringBuffer("wodejava"); //通过构造方法将String 转换为 StringBuffer
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();  //通过append方法将String 转换为 StringBuffer
		sb1.append("java");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("javahaha"); //通过构造StringBuffer 转换为 String
		String st = new String(sb2);
		System.out.println(st);
		
		StringBuffer sb3 = new StringBuffer("javaxuexi");//通过toString方法StringBuffer 转换为 String
		String st1 = sb3.toString();
		System.out.println(st1);
		
		StringBuffer sb4 = new StringBuffer("xuexi");//通过截取缓冲字符串的方法StringBuffer 转换为 String
		String st2 = sb4.substring( 0, sb4.length());
		System.out.println(st2);
	}

	private static void 截取内容() {
		StringBuffer sb = new StringBuffer("wodejavaxuexi");
		System.out.println(sb);
		
		String sb1 = sb.substring(3);     //返回值为一个string类型值因此要重新创建一个string对象来接收
		System.out.println(sb1);
		
		String sb2 = sb.substring(4, 8); //包含头不包含尾
		System.out.println(sb2);
		System.out.println(sb);   		//以上操作sb的内容不发生改变
	}

	private static void 替换反转() {
		StringBuffer sb = new StringBuffer("wodejava");
		System.out.println(sb);
		
		sb.replace(2, 4, "hahaha"); //在中间替换字符串(包含头不包含尾)
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);    //使对象中的字符串反转
	}

}
