package com.java.otherclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class MyDate {

	/**
* A:Date类的概述
	* 类 Date 表示特定的瞬间，精确到毫秒。 
* B:构造方法
	* public Date()
	* public Date(long date)
* C:成员方法
	* public long getTime()    返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
	* public void setTime(long time)    设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
----------------------------------------------------------------------------------------------------------------------
 A:DateFormat类的概述
	* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
* B:SimpleDateFormat构造方法
	* public SimpleDateFormat()
	* public SimpleDateFormat(String pattern)
* C:成员方法
	* public final String format(Date date)
	* public Date parse(String source)	
	* 
----------------------------------------------------------------------------------------------------------------------
###14.19_常见对象(Calendar类的概述和获取日期的方法)(掌握)
* A:Calendar类的概述
	* Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
* B:成员方法
	* public static Calendar getInstance()
	* public int get(int field)
* A:成员方法
	* public void add(int field,int amount)
	* public final void set(int year,int month,int date)
*/
	public static void main(String[] args) {
		//日期();
		//可视化日期();
		Calendar c = Calendar.getInstance();  //获取当前日历
		
		System.out.println(c.get(Calendar.YEAR));  //输出当前日历的年  输出string类型
		System.out.println(c.get(Calendar.MONTH));  //输出当前日历的月  月是从0开始编号的
		System.out.println(c.get(Calendar.DAY_OF_MONTH));  //输出当前日历的日(月中)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  //输出当前日历的日 (周中)每周六是最后一天
		
		//c.set(year, month, date)  修改年月日
		
	}

	private static void 可视化日期() {
		Date d1 = new Date();                          //创建当前时间
		
		SimpleDateFormat sd = new SimpleDateFormat();  //创建时间格式
		System.out.println(sd.format(d1));            //输出时间     18-1-26 下午8:40
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy年MM月dd日     HH:mm:ss");  //创建自己的时间格式
		System.out.println(sd1.format(d1));            //输出时间     18-1-26 下午8:40
	}

	private static void 日期() {
		Date d1 = new Date();                	//导包的时候注意 有两个包下都有Date类(获取时间)
		System.out.println(d1);             	//输出时间    Fri Jan 26 20:13:40 CST 2018
		
		Date d2 = new Date(0);                	//参数传为0
		System.out.println(d2); 				//1970年1月1日unix 和c语言的生日
	}

}
